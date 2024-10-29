package com.example.wookiemaniaapp.model

data class QuestionModel(
    var idQuiz: String = "",
    val category: String,
    val tittle: String,
    val correctAnswer: String,
    val incorrectAnswer1: String,
    val incorrectAnswer2: String,
    val incorrectAnswer3: String,
    val isValid: Boolean,
    val favourite: ArrayList<String> = arrayListOf()

) {
    // Constructor sin argumentos requerido por Firestore
    constructor() : this("","","","","","","",false)
}
