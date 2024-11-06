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
import com.example.wookiemaniaapp.model.QuestionModel
import com.example.wookiemaniaapp.model.states.QuestionState
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class QuestionViewModel : ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore

    private val _questionData = MutableStateFlow<List<QuestionModel>>(emptyList())
    val questionData: StateFlow<List<QuestionModel>> = _questionData

    var state by mutableStateOf(QuestionModel())
        private set

    private val _stateFlow = MutableStateFlow<QuestionState>(QuestionState.Loading)
    val stateFlow: StateFlow<QuestionState> = _stateFlow

    private val _questionId = MutableLiveData<String>()
    val questionId: LiveData<String> = _questionId

    private var _allQuestions: MutableLiveData<ArrayList<QuestionModel>> =
        MutableLiveData<ArrayList<QuestionModel>>()
    val allQuestions: LiveData<ArrayList<QuestionModel>> = _allQuestions

    private var _questionsIdsList: MutableLiveData<ArrayList<String>> =
        MutableLiveData<ArrayList<String>>()
    val questionsIdsList: LiveData<ArrayList<String>> = _questionsIdsList

    //var currentList = _quizIdsList.value ?: ArrayList()


    // ---------------------------------------------------------------------------------------- //

    /**
     * Todos estos son los parámetros para crear una pregunta
     */

    var category by mutableStateOf("")
        private set
    var title by mutableStateOf("")
        private set
    var correctAnswer by mutableStateOf("")
        private set
    var incorrectAnswer1 by mutableStateOf("")
        private set
    var incorrectAnswer2 by mutableStateOf("")
        private set
    var incorrectAnswer3 by mutableStateOf("")
        private set


    // Obtiene una sola pregunta por su ID
    fun getQuestionById(questionId: String): QuestionModel? {
        return _allQuestions.value?.firstOrNull { it.idQuiz == questionId }
    }

    /**
     * Actualiza el id de la quiz actual, para leer las preguntas en la quiz seleccionada.
     *
     */
    fun changeQuestionId(questionId: String) {
        _questionId.value = questionId
    }


    // Método para agregar una nueva pregunta a la colección en Firestore
    fun addNewQuestion(onSuccess: () -> Unit) {
        val newQuestion = QuestionModel(
            category = category,
            tittle = title,
            correctAnswer = correctAnswer,
            incorrectAnswer1 = incorrectAnswer1,
            incorrectAnswer2 = incorrectAnswer2,
            incorrectAnswer3 = incorrectAnswer3,
            isValid = false
        )

        val collectionRef = FirebaseFirestore.getInstance().collection("Questions")

        viewModelScope.launch {
            try {
                collectionRef.add(newQuestion)
                    .addOnSuccessListener { documentReference ->
                        val nuevoDocumentoId = documentReference.id
                        Log.d(TAG, "Nuevo documento agregado con ID: $nuevoDocumentoId")
                        onSuccess() // Navega a la pantalla Home cuando la pregunta se agrega exitosamente
                    }
                    .addOnFailureListener { exception ->
                        Log.d(TAG, "Error al agregar nuevo documento: $exception")
                    }
            } catch (e: Exception) {
                Log.d("ERROR CREAR USUARIO", "ERROR: ${e.localizedMessage}")
            }
        }
    }
    /**
     * Recupera todas las preguntas de la base de datos.
     */
    fun fetchAllQuestions() {
        firestore.collection("Questions")
            .get()
            .addOnSuccessListener { snapshot ->
                val questionsList = snapshot.documents.mapNotNull {
                    it.toObject(QuestionModel::class.java)?.apply {
                        idQuiz = it.id // Aquí obtenemos el ID del documento
                    }
                }
                // Convertimos la lista a ArrayList antes de asignarla
                _allQuestions.value = ArrayList(questionsList)
            }
            .addOnFailureListener { exception ->
                Log.e("QuestionViewModel", "Error al recuperar preguntas: $exception")
            }
    }

    /**
     * Actualiza una pregunta en Firestore.
     */
    fun updateQuestion(questionId: String, updatedQuestion: QuestionModel, onSuccess: () -> Unit) {
        val questionRef = firestore.collection("Questions").document(questionId)
        questionRef.set(updatedQuestion)
            .addOnSuccessListener {
                Log.d(TAG, "Pregunta actualizada exitosamente.")
                onSuccess()
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "Error al actualizar la pregunta: $exception")
            }
    }

    /**
     * Elimina una pregunta de Firestore por ID.
     */
    fun deleteQuestion(questionId: String, onSuccess: () -> Unit) {
        firestore.collection("Questions").document(questionId)
            .delete()
            .addOnSuccessListener {
                Log.d(TAG, "Pregunta eliminada correctamente.")
                onSuccess()
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "Error al eliminar la pregunta: $exception")
            }
    }

    /**
     * Crea la pregunta.
     *
     */
    fun createSelectedCategory(category: String) {
        this.category = category
    }

    fun createTitle(title: String) {
        this.title = title
    }


    fun createCorrectAnswer(correctAnswer: String) {
        this.correctAnswer = correctAnswer
    }

    fun createIncorrectAnswer1(incorrectAnswer1: String) {
        this.incorrectAnswer1 = incorrectAnswer1
    }

    fun createIncorrectAnswer2(incorrectAnswer2: String) {
        this.incorrectAnswer2 = incorrectAnswer2
    }

    fun createIncorrectAnswer3(incorrectAnswer3: String) {
        this.incorrectAnswer3 = incorrectAnswer3
    }


}