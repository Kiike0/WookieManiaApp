package com.example.wookiemaniaapp.viewmodels

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.wookiemaniaapp.model.AvatarModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID

class AvatarViewModel : ViewModel() {
    private val storageRef = FirebaseStorage.getInstance().reference
    private val firestore = FirebaseFirestore.getInstance()

    fun uploadImageToStorage(uri: Uri, userId: String, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
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

    private fun saveAvatarToFirestore(avatar: AvatarModel, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
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



