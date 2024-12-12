package com.example.wookiemaniaapp.model

import com.google.firebase.firestore.PropertyName

/**
 * Define el modelo de datos para las preguntas.
 * Se utiliza para gestionar las preguntas de las quiz en la base de datos.
 */
data class QuestionModel(
    var idQuiz: String = "",
    val category: String,
    val tittle: String,
    val correctAnswer: String,
    val incorrectAnswer1: String,
    val incorrectAnswer2: String,
    val incorrectAnswer3: String,
    @PropertyName("valid") val isValid: Boolean,  // Mapea "valid" en la base de datos a "isValid" en el modelo
    val favourite: ArrayList<String> = arrayListOf()
) {
    constructor() : this("","","","","","","",false)
}
