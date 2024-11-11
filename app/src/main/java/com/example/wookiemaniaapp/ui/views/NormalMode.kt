package com.example.wookiemaniaapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.nextnav.NextNav
import com.example.wookiemaniaapp.question.firaSans
import com.example.wookiemaniaapp.ui.components.NormalQuestion
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun NormalMode(
    navController: NavHostController,
    questionViewModel: QuestionViewModel
) {
    val allQuestions by questionViewModel.allQuestions.observeAsState(emptyList())
    var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }
    val currentQuestion = allQuestions.getOrNull(currentQuestionIndex)

    // Estado para almacenar respuestas barajadas
    var shuffledAnswers by remember(currentQuestion) { mutableStateOf(emptyList<String>()) }

    // Estado para mostrar el resultado de la respuesta
    var selectedAnswer by rememberSaveable { mutableStateOf("") }
    var showAnswerResult by rememberSaveable { mutableStateOf(false) }
    var isCorrect by rememberSaveable { mutableStateOf(false) }

    // Inicializar las respuestas barajadas cuando la pregunta cambia
    LaunchedEffect(currentQuestion) {
        currentQuestion?.let {
            shuffledAnswers = listOf(
                it.correctAnswer,
                it.incorrectAnswer1,
                it.incorrectAnswer2,
                it.incorrectAnswer3
            ).shuffled()
        }
    }

    // Cargar preguntas válidas cuando la pantalla se muestra
    LaunchedEffect(Unit) {
        questionViewModel.fetchAllQuestionsValid()
    }

    if (currentQuestion != null && shuffledAnswers.isNotEmpty()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(ColorApp)
        ) {
            NormalQuestion(
                textCategory = currentQuestion.category,
                questionTitle = currentQuestion.tittle,
                closeIcon = { navController.navigate(Routes.Home.route) },
                saveIcon = {},

                buttonTextAnswerA = {
                    selectedAnswer = shuffledAnswers[0]
                    isCorrect = shuffledAnswers[0] == currentQuestion.correctAnswer
                    showAnswerResult = true
                },
                buttonTextAnswerB = {
                    selectedAnswer = shuffledAnswers[1]
                    isCorrect = shuffledAnswers[1] == currentQuestion.correctAnswer
                    showAnswerResult = true
                },
                buttonTextAnswerC = {
                    selectedAnswer = shuffledAnswers[2]
                    isCorrect = shuffledAnswers[2] == currentQuestion.correctAnswer
                    showAnswerResult = true
                },
                buttonTextAnswerD = {
                    selectedAnswer = shuffledAnswers[3]
                    isCorrect = shuffledAnswers[3] == currentQuestion.correctAnswer
                    showAnswerResult = true
                },
                questionAnswer1 = shuffledAnswers[0],
                questionAnswer2 = shuffledAnswers[1],
                questionAnswer3 = shuffledAnswers[2],
                questionAnswer4 = shuffledAnswers[3]
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(142.dp)
                    .background(color = Color.Transparent)
                    .padding(bottom = 10.dp)
            ) {
                NextNav(
                    modifier = Modifier.fillMaxWidth(1f),
                    nextButton = {
                        if (currentQuestionIndex < allQuestions.size - 1) {
                            currentQuestionIndex++
                        } else {
                            currentQuestionIndex = 0
                        }
                    }
                )
            }
        }

        if (showAnswerResult) {
            AlertDialog(
                onDismissRequest = { showAnswerResult = false },
                title = {
                    Text(
                        text = if (isCorrect) "¡Correcto!" else "Respuesta incorrecta",
                        fontFamily = firaSans
                    )
                },
                text = { /* Sin texto adicional */ },
                confirmButton = {
                    Button(
                        onClick = {
                            showAnswerResult = false
                            if (currentQuestionIndex < allQuestions.size - 1) {
                                currentQuestionIndex++
                            } else {
                                currentQuestionIndex = 0
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black
                        )
                    ) {
                        Text(
                            text = "OK",
                            color = Color.White,
                            fontFamily = firaSans
                        )
                    }
                },
                containerColor = Color.White
            )
        }

    }
}