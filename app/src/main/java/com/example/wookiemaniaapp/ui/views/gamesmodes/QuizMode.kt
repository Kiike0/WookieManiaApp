package com.example.wookiemaniaapp.ui.views.gamesmodes

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.cabeceratipo3.firaSans
import com.example.wookiemaniaapp.model.states.QuizState
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CloseIconComposable
import com.example.wookiemaniaapp.ui.components.NextNav2
import com.example.wookiemaniaapp.ui.components.TituloPreguntaComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.ui.theme.ColorBoxQuizQuestion
import com.example.wookiemaniaapp.viewmodels.QuizViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla de las preguntas.
 *
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 *
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
 */
@Composable
fun QuizMode(
    navController: NavHostController,
    quizVM: QuizViewModel,
    currentUserViewModel: UserViewModel
) {
    val quizId: String by quizVM.quizId.observeAsState(initial = "")

    LaunchedEffect(Unit) {
        quizVM.getQuizById(quizId)
        currentUserViewModel.getCurrentUserData()
    }

    val stateFlow by quizVM.stateFlow.collectAsState()

    when (stateFlow) {
        is QuizState.Loading -> Text(text = "Loading...")
        is QuizState.Success -> {
            val quiz = (stateFlow as QuizState.Success).quiz

            val questions = listOf(
                quiz.question1,
                quiz.question2,
                quiz.question3,
                quiz.question4,
                quiz.question5
            )

            // Indice para pasar a la siguiente pregunta
            var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }

            // Guarda una lista de las respuestas actuales
            val answerList: MutableList<String> = mutableListOf()

            // Guarda el título de la pregunta actual
            var questionTitle by rememberSaveable { mutableStateOf("") }

            // Contador para contar las respuestas correctas
            var correctCount by rememberSaveable { mutableIntStateOf(0) }

            // Estado para los colores de los botones y la respuesta seleccionada
            var buttonColors by rememberSaveable { mutableStateOf(listOf(Color.White, Color.White, Color.White, Color.White)) }
            var buttonsEnabled by rememberSaveable { mutableStateOf(true) }
            var selectedAnswer by rememberSaveable { mutableStateOf("") }
            var isCorrect by rememberSaveable { mutableStateOf(false) }

            if (currentQuestionIndex < questions.size) {
                val currentQuestion = questions[currentQuestionIndex]
                currentQuestion?.forEachIndexed { index, option ->
                    when (index) {
                        0 -> questionTitle = option // Esto muestra la pregunta
                        else -> answerList.add(option) // Esto muestra las opciones
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(ColorApp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(728.dp)
                            .background(ColorBoxQuizQuestion),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 37.dp)
                                    .size(30.dp)
                            ) {
                                Spacer(modifier = Modifier.width(30.dp))
                                CloseIconComposable(
                                    onCloseIcon = { navController.navigate(Routes.Home.route) },
                                    modifier = Modifier.padding(top = 7.dp)
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Text(
                                    text = "${currentQuestionIndex + 1}/${questions.size}",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = firaSans,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Text(
                                    modifier = Modifier.padding(end = 25.dp),
                                    text = quiz.title,
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = firaSans,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            TituloPreguntaComposable(
                                questionTitle = questionTitle,
                                modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                            )

                            // Botones de respuestas
                            val correctAnswer = answerList.getOrNull(4) // La respuesta correcta siempre está en la última posición de answerList

                            answerList.take(4).forEachIndexed { i, answer ->
                                Button(
                                    onClick = {
                                        if (buttonsEnabled) {
                                            selectedAnswer = answer
                                            isCorrect = answer == correctAnswer
                                            buttonColors = buttonColors.toMutableList().apply {
                                                this[i] = if (isCorrect) Color.Green else Color.Red
                                            }

                                            // Deshabilitar los botones después de un retraso de 1 segundo
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                buttonsEnabled = false
                                            }, 500)

                                            // Actualizar puntos si la respuesta es correcta
                                            if (isCorrect) {
                                                correctCount++
                                            }

                                            // Avanzar a la siguiente pregunta después de un retraso
                                            Handler(Looper.getMainLooper()).postDelayed({
                                                currentQuestionIndex++
                                                buttonColors = listOf(Color.White, Color.White, Color.White, Color.White)
                                                buttonsEnabled = true
                                            }, 500)
                                        }
                                    },
                                    enabled = buttonsEnabled,
                                    colors = ButtonDefaults.buttonColors(containerColor = buttonColors[i]),
                                    border = BorderStroke(3.dp, Color.Black),
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier
                                        .padding(12.dp)
                                        .size(500.dp, 50.dp)
                                ) {
                                    Text(
                                        text = "${'A' + i}. $answer",
                                        color = Color.Black,
                                        fontSize = 18.0.sp,
                                        fontFamily = firaSans,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(142.dp)
                            .background(color = Color.Transparent)
                            .padding(bottom = 10.dp)
                    ) {
                        NextNav2(
                            modifier = Modifier.fillMaxWidth(1f)
                        )
                    }
                }
            } else {
                // Mostrar mensaje de felicitaciones al terminar las 5 preguntas
                CongratulationsDialog(
                    correctCount = correctCount,
                    onContinueButton = {
                        navController.navigate(Routes.Home.route)
                    }
                )
            }
        }

        is QuizState.Error -> Text(
            text = (stateFlow as QuizState.Error).message,
            color = Color.Red
        )
    }
}

@Composable
fun CongratulationsDialog(correctCount: Int, onContinueButton: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp), // Fondo principal colorApp
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp, 200.dp) // Tamaño del cuadro de diálogo
                .clip(RoundedCornerShape(16.dp)) // Redondear las esquinas
                .background(Color.White, shape = RoundedCornerShape(16.dp))
                .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "¡Buen trabajo! Has conseguido $correctCount de 5 respuestas correctas.",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = onContinueButton,
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(
                        text = "Continuar",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = firaSans,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }
}


