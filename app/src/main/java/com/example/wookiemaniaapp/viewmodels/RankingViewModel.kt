package com.example.wookiemaniaapp.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wookiemaniaapp.model.RankingModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

/**
 * ViewModel responsable de gestionar la lógica de la puntuación de los rankings.
 * Proporciona funciones para el ranking utilizando Firebase Auth.
 *
 */
class RankingViewModel : ViewModel() {

    // LiveData que contiene la lista de Rankings
    private val _rankingList = MutableLiveData<List<RankingModel>>()
    val rankingList: LiveData<List<RankingModel>> get() = _rankingList

    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    // Método para agregar un nuevo ranking
    fun addRanking(ranking: RankingModel) {
        // Crear un nuevo documento en Firestore con los datos del ranking
        val rankingData = hashMapOf(
            "idRanking" to ranking.idRanking,
            "position" to ranking.position,
            "nickname" to ranking.nickname,
            "points" to ranking.points
        )

        // Agregar el nuevo ranking en la colección "Ranking" en Firestore
        firestore.collection("Ranking")  // Aquí es "Ranking" en lugar de "Rankings"
            .add(rankingData)
            .addOnSuccessListener {
                // Si se agrega correctamente, actualizar la lista de rankings en vivo
                updateRankingList()
            }
            .addOnFailureListener { e ->
                // Manejar cualquier error
                println("Error al agregar el ranking: $e")
            }
    }

    // Método para obtener los rankings desde Firestore
    fun fetchRankingData() {
        firestore.collection("Ranking")  // Aquí es "Ranking"
            .orderBy("points", Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { documents ->
                val rankings = mutableListOf<RankingModel>()
                for (document in documents) {
                    val ranking = document.toObject(RankingModel::class.java)
                    rankings.add(ranking)
                }
                _rankingList.value = rankings
            }
            .addOnFailureListener { e ->
                // Manejar cualquier error
                println("Error al obtener los rankings: $e")
            }
    }

    // Método para actualizar la lista de rankings en vivo después de agregar o eliminar un ranking
    private fun updateRankingList() {
        firestore.collection("Ranking")  // Aquí es "Ranking"
            .orderBy("points", Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { documents ->
                val rankings = mutableListOf<RankingModel>()
                for (document in documents) {
                    val ranking = document.toObject(RankingModel::class.java)
                    rankings.add(ranking)
                }
                _rankingList.value = rankings
            }
            .addOnFailureListener { e ->
                println("Error al obtener los rankings: $e")
            }
    }

    fun updateRankingPoints(nickname: String) {
        val rankingRef = firestore.collection("Ranking")

        if (nickname.isNotEmpty()) {
            rankingRef.whereEqualTo("nickname", nickname)
                .get()
                .addOnSuccessListener { documents ->
                    if (documents.isEmpty) {
                        Log.d("RankingUpdate", "El usuario no está en el ranking.")
                    } else {
                        val document = documents.firstOrNull()
                        if (document != null) {
                            val updatedRanking = document.toObject(RankingModel::class.java)
                            updatedRanking.let {
                                Log.d("RankingUpdate", "Puntos actuales para $nickname: ${it.points}")
                                it.points += 1
                                Log.d("RankingUpdate", "Puntos después de incremento para $nickname: ${it.points}")

                                rankingRef.document(document.id).set(it)
                                    .addOnSuccessListener {
                                        Log.d("RankingUpdate", "Puntos actualizados correctamente para $nickname.")
                                    }
                                    .addOnFailureListener { e ->
                                        Log.e("RankingUpdateError", "Error al actualizar los puntos del ranking: $e")
                                    }
                            }
                        }
                    }
                }
                .addOnFailureListener { e ->
                    Log.e("RankingUpdateError", "Error al obtener el ranking: $e")
                }
        } else {
            Log.e("RankingUpdateError", "Nickname vacío o nulo.")
        }
    }


}