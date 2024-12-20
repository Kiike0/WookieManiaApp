package com.example.wookiemaniaapp.viewmodels

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wookiemaniaapp.model.AvatarModel
import com.example.wookiemaniaapp.model.RankingModel
import com.example.wookiemaniaapp.model.UserModel
import com.example.wookiemaniaapp.ui.painters.avatarUrlResources
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.UUID


/**
 * ViewModel responsable de gestionar la lógica de autenticación de usuarios.
 * Proporciona funciones para el inicio de sesión y registro de usuarios utilizando Firebase Auth.
 * Mantiene el estado de la UI relevante para la autenticación, como los campos de entrada y las alertas.
 *
 * @property auth Instancia de FirebaseAuth utilizada para las operaciones de autenticación.
 * @property showAlert Estado que determina si se debe mostrar una alerta de error en la UI.
 * @property email Email del usuario, utilizado para el inicio de sesión y registro.
 * @property password Contraseña del usuario, utilizada para el inicio de sesión y registro.
 * @property getCurrentUserData Nombre de usuario, utilizado solo en el proceso de registro.
 */
class UserViewModel : ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore

    private val rankingViewModel = RankingViewModel() // Instanciamos el RankingViewModel

    private var showAlert by mutableStateOf(false)

    var nickname by mutableStateOf("")
        private set
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var name by mutableStateOf("")
        private set
    var surname by mutableStateOf("")
        private set

    var userId by mutableStateOf("")
        private set

    // Propiedad que devuelve el id del usuario autenticado actualmente
    var currentUserId: String? = null
        get() = auth.currentUser?.uid

    fun fetchCurrentUserId(): String? { return currentUserId }

    private val _user = MutableLiveData<UserModel?>()
    val user: LiveData<UserModel?> get() = _user

    private var currentNickname by mutableStateOf("")

    private var currentName: String = ""
        get() = field.ifBlank { "" }

    private var currentSurname: String = ""
        get() = field.ifBlank { "" }

    // Propiedad que devuelve el correo electrónico del usuario autenticado actualmente
    val currentUserEmail: String?
        get() = auth.currentUser?.email

    fun fetchCurrentUserEmail(): String? { return currentUserEmail }

    /**
     * El login del usuario
     * Intenta iniciar sesión con el email y la contraseña proporcionados.
     * Si el inicio de sesión es exitoso, ejecuta la acción de éxito proporcionada.
     * En caso de error, actualiza el estado para mostrar una alerta.
     *
     * @param onSuccess Acción a ejecutar si el inicio de sesión es exitoso.
     */
    fun login(onSuccess: () -> Unit) {
        viewModelScope.launch {
            try {
                // Utiliza el servicio de autenticación de Firebase para validar al usuario
                // por email y contraseña
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d(
                                "LOGIN_SUCCESS",
                                "Inicio de sesión exitoso"
                            ) // Mensaje de registro
                            onSuccess() // Redirige al usuario si la autenticación es exitosa
                        } else {
                            Log.d("ERROR EN FIREBASE", "Usuario y/o contrasena incorrectos")
                            showAlert = true
                        }
                    }
            } catch (e: Exception) {
                Log.d("ERROR EN JETPACK", "ERROR: ${e.localizedMessage}")
            }
        }
    }

    fun fetchCurrentName() = currentName.ifBlank { "" }
    fun fetchCurrentSurname() = currentSurname.ifBlank { "" }
    fun fetchCurrentNickName() = currentNickname.ifBlank { "" }

    /**
     * Accede a los datos del usuario para poder mostrarlos por pantalla.
     *
     */
    fun getCurrentUserData() {
        val uid = auth.currentUser?.uid
        if (uid != null) {
            firestore.collection("Users")
                .whereEqualTo("userId", uid)
                .get()
                .addOnSuccessListener { documents ->
                    for (document in documents) {
                        //Log.d(TAG, "${document.id} => ${document.data.get("nickname")}")
                        //Log.d(TAG, "${document.data.get("nickname").toString()}")
                        currentUserId = document.data["userId"].toString()
                        currentName = document.data["name"].toString()
                        currentSurname = document.data["surname"].toString()
                        currentNickname = document.data["nickname"].toString()
                    }
                }
                .addOnFailureListener { exception ->
                    Log.d(TAG, "Error al obtener el documento del usuario: $exception")
                }
        }
    }

    /**
     * Crea un nuevo usuario con el email y la contraseña proporcionados.
     * Si el registro es exitoso, guarda la información del usuario en Firestore y ejecuta la acción de éxito proporcionada.
     * En caso de error, actualiza el estado para mostrar el mensaje de alerta.
     *
     * @param onSuccess Acción a ejecutar si el registro es exitoso.
     */
    fun createUser(onSuccess: () -> Unit) {
        viewModelScope.launch {
            try {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d("AUTH_SUCCESS", "Usuario creado correctamente")
                            val currentUser = auth.currentUser
                            if (currentUser != null) {
                                saveUser(name, surname, nickname) // Aquí usas los datos ingresados

                                // Crea un modelo de ranking y añadirlo a la colección de ranking
                                val ranking = RankingModel(
                                    idRanking = currentUser.uid,  // Usa el UID del usuario como el ID de ranking
                                    position = 0,                 // Puedes inicializar la posición según la lógica del ranking
                                    nickname = nickname,
                                    points = 0                    // Puntos iniciales
                                )

                                rankingViewModel.addRanking(ranking)  // Llama a la función addRanking del RankingViewModel

                                // Selecciona una URL de imagen al azar
                                val randomImageUrl = avatarUrlResources.random()

                                // Crea un modelo de avatar y añadirlo a la colección de avatars
                                val avatar = AvatarModel(
                                    id = UUID.randomUUID().toString(), // Genera un ID único para el avatar
                                    userId = currentUser.uid,
                                    imageUrl = randomImageUrl // Asigna la URL al azar
                                )

                                saveAvatarToFirestore(avatar)

                                Log.d("NAVIGATION", "Navegando a la pantalla Home")
                                onSuccess()
                            } else {
                                Log.d("ERROR EN FIREBASE", "Usuario creado pero no encontrado")
                                showAlert = true
                            }
                        } else {
                            Log.d("AUTH_ERROR", "Error al crear usuario: ${task.exception?.message}")
                            showAlert = true
                        }
                    }
            } catch (e: Exception) {
                Log.d("ERROR CREAR USUARIO", "ERROR: ${e.localizedMessage}")
                showAlert = true
            }
        }
    }

    private fun saveAvatarToFirestore(avatar: AvatarModel) {
        firestore.collection("Avatars")
            .document(avatar.id)
            .set(avatar)
            .addOnSuccessListener {
                Log.d("AVATAR_CREATION_SUCCESS", "Avatar creado correctamente en Firestore")
            }
            .addOnFailureListener { exception ->
                Log.d("ERROR AL GUARDAR AVATAR", "Error al guardar el avatar en Firestore: ${exception.message}")
            }
    }

    private fun saveUser(name: String, surname: String, nickName: String) {
        val id = auth.currentUser?.uid
        val email = auth.currentUser?.email

        viewModelScope.launch(Dispatchers.IO) {
            val user = UserModel(
                name = name,
                surname = surname,
                userId = id.toString(),
                email = email.toString(),
                nickname = nickName,
                totalAdded = 0,
                trophiesNumber = 0
            )
            // Añade el usuario a la colección "Users" en la base de datos Firestore
            firestore.collection("Users")
                .add(user)
                .addOnSuccessListener {
                    Log.d("GUARDAR OK", "Se guardó el usuario correctamente en Firestore")
                }
                .addOnFailureListener { exception ->
                    Log.d("ERROR AL GUARDAR", "ERROR al guardar en Firestore: ${exception.message}")
                }
        }
    }


    /**
     * Cierra la sesión del usuario actual en Firebase Auth.
     */
    fun signOut() {
        auth.signOut()
    }

    /**
     * Cierra el diálogo de alerta de error mostrada en la UI.
     */
    fun closeAlert() {
        showAlert = false
    }

    /**
     * Actualiza el email del usuario.
     *
     * @param email Nuevo email a establecer.
     */
    fun changeEmail(email: String) {
        this.email = email
    }

    /**
     * Actualiza la contraseña del usuario.
     *
     * @param password Nueva contraseña a establecer.
     */
    fun changePassword(password: String) {
        this.password = password
    }

    /**
     * Actualiza el nombre de usuario.
     *
     * @param nickName Nuevo nombre de usuario a establecer.
     */
    fun changeNickName(nickName: String) {
        this.nickname = nickName
    }

    /**
     * Actualiza el nombre.
     *
     * @param name Nuevo nombre a establecer.
     */
    fun changeName(name: String) {
        this.name = name
    }

    /**
     * Actualiza el apellido.
     *
     * @param surname Nuevo apellido de usuario a establecer.
     */
    fun changeSurname(surname: String) {
        this.surname = surname
    }

    /**
     * Actualiza la información del usuario en Firestore.
     *
     * @param user UserModel con la información actualizada del usuario.
     * @param onSuccess Acción a ejecutar si la actualización es exitosa.
     */
    fun updateUser(name: String, surname: String, onSuccess: () -> Unit) {
        val userId = auth.currentUser?.uid ?: return

        firestore.collection("Users")
            .whereEqualTo("userId", userId)
            .get()
            .addOnSuccessListener { documents ->
                if (!documents.isEmpty) { // Usar isEmpty en lugar de isNotEmpty
                    val document = documents.first()
                    firestore.collection("Users")
                        .document(document.id)
                        .update(
                            "name", name,
                            "surname", surname
                        )
                        .addOnSuccessListener {
                            Log.d("UpdateUser", "Usuario actualizado correctamente.")
                            onSuccess()
                        }
                        .addOnFailureListener { exception ->
                            Log.e("UpdateUserError", "Error al actualizar el usuario: $exception")
                        }
                } else {
                    Log.e("UpdateUserError", "No se encontró el documento del usuario.")
                }
            }
            .addOnFailureListener { exception ->
                Log.e("UpdateUserError", "Error al obtener el usuario: $exception")
            }
    }



}


