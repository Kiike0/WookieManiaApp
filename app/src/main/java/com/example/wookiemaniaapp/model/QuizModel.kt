package com.example.wookiemaniaapp.model


/**
 * Define el modelo de datos para las preguntas.
 * Se utiliza para gestionar las preguntas de las quiz en la base de datos.
 */
data class QuizModel(
    var idQuiz: String = "",
    val public : Boolean,
    val title: String = "",
    val question1: List<String>? = null,
    val question2: List<String>? = null,
    val question3: List<String>? = null,
    val question4: List<String>? = null,
    val question5: List<String>? = null,
    val totalCompleted: Int
) {
    // Constructor sin argumentos requerido por Firestore
    constructor() : this("", false, "", null, null, null, null, null, 0)
}
