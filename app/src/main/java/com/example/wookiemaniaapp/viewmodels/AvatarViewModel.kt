package com.example.wookiemaniaapp.viewmodels


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wookiemaniaapp.model.AvatarModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.auth.FirebaseAuth

/**
 * ViewModel responsable de gestionar la lógica de autenticación de los avatares.
 * Proporciona funciones para el cambio de avatar utilizando Firebase Auth.
 *
 * @property auth Instancia de FirebaseAuth utilizada para las operaciones de autenticación.
 */
class AvatarViewModel : ViewModel() {
    private val firestore = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    private val _avatarUrl = MutableLiveData<String>()
    val avatarUrl: LiveData<String> get() = _avatarUrl

    fun fetchAvatarUrl() {
        val userId = auth.currentUser?.uid ?: return // Obtener el ID del usuario actual

        firestore.collection("Avatars")
            .whereEqualTo("userId", userId)
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    val avatar = document.toObject(AvatarModel::class.java)
                    _avatarUrl.value = avatar.imageUrl
                }
            }
            .addOnFailureListener { exception ->
                Log.e("AvatarViewModel", "Error al obtener el avatar: $exception")
            }
    }

    fun updateAvatarUrl(newAvatarUrl: String, onComplete: () -> Unit) {
        val userId = auth.currentUser?.uid ?: return // Obtiene el ID del usuario actual o retornar si es nulo
        firestore.collection("Avatars")
            .whereEqualTo("userId", userId) // Busca el documento de avatar correspondiente al ID del usuario
            .get()
            .addOnSuccessListener { documents ->
                if (documents.isEmpty) {
                    Log.w("AvatarViewModel", "No avatar document found for user: $userId")
                } else {
                    // Si se encuentra el documento, actualiza el campo "imageUrl"
                    for (document in documents) {
                        val avatarDocRef = firestore.collection("Avatars").document(document.id)
                        avatarDocRef.update("imageUrl", newAvatarUrl)
                            .addOnSuccessListener {
                                _avatarUrl.value = newAvatarUrl // Actualiza el LiveData con la nueva URL del avatar
                                onComplete() // Llama a la función de completado
                            }
                            .addOnFailureListener { e ->
                                Log.w("AvatarViewModel", "Error updating avatar document", e)
                            }
                    }
                }
            }
            .addOnFailureListener { e ->
                Log.w("AvatarViewModel", "Error retrieving avatar document", e)
            }
    }


}




