package com.example.wookiemaniaapp.model.states

import com.example.wookiemaniaapp.model.QuestionModel

/**
 * Una clase sellada que encuentra los estados en la base de datos
 * Utilizada para acceder a las preguntas de las quiz
 *
 */
sealed class QuestionState {
    object Loading : QuestionState()
    data class Success(val quiz: QuestionModel) : QuestionState()
    data class Error(val message: String) : QuestionState()
}