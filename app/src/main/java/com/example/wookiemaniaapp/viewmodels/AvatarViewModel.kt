package com.example.wookiemaniaapp.viewmodels

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wookiemaniaapp.model.AvatarModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.auth.FirebaseAuth

class AvatarViewModel : ViewModel() {
    private val storageRef = FirebaseStorage.getInstance().reference
    private val firestore = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance() // Asegúrate de inicializar FirebaseAuth

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

    fun uploadImageToStorage(
        uri: Uri,
        userId: String,
        onSuccess: (String) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val imageRef = storageRef.child("avatars/${userId}.jpg")
        val uploadTask = imageRef.putFile(uri)

        uploadTask.addOnSuccessListener {
            imageRef.downloadUrl.addOnSuccessListener { uri ->
                val imageUrl = uri.toString()
                val avatar = AvatarModel(id = userId, userId = userId, imageUrl = imageUrl)
                saveAvatarToFirestore(avatar, onSuccess, onFailure)
            }
        }.addOnFailureListener {
            onFailure(it)
        }
    }

    private fun saveAvatarToFirestore(
        avatar: AvatarModel,
        onSuccess: (String) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val docRef = firestore.collection("Avatars").document(avatar.id)
        docRef.set(avatar)
            .addOnSuccessListener {
                onSuccess(avatar.imageUrl)
            }
            .addOnFailureListener {
                onFailure(it)
            }
    }
}




