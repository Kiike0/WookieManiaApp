package com.example.wookiemaniaapp.ui.views.gamesmodes

import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.nextnav.NextNav
import com.example.wookiemaniaapp.question.firaSans
import com.example.wookiemaniaapp.ui.components.CloseIconComposable
import com.example.wookiemaniaapp.ui.components.SaveComposable
import com.example.wookiemaniaapp.ui.components.TituloPreguntaComposable
import com.example.wookiemaniaapp.ui.components.VectorSaveComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.ui.theme.ColorBoxNormalQuestion
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel
import com.example.wookiemaniaapp.viewmodels.RankingViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla del modo normal.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun NormalMode(
    navController: NavHostController,
    questionViewModel: QuestionViewModel,
    currentUserViewModel: UserViewModel,
    rankingViewModel: RankingViewModel
) {
    // Estado de carga
    var isLoading by rememberSaveable { mutableStateOf(true) }

    // Inicializamos las preguntas y respuestas
    val allQuestions by questionViewModel.allQuestions.observeAsState(emptyList())
    var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }

    // Estado para las respuestas barajadas
    var shuffledAnswers by rememberSaveable { mutableStateOf(emptyList<String>()) }

    // Estados para los colores de los botones y la respuesta seleccionada
    var buttonColors by rememberSaveable { mutableStateOf(listOf(Color.White, Color.White, Color.White, Color.White)) }
    var buttonsEnabled by rememberSaveable { mutableStateOf(true) }

    var selectedAnswer by rememberSaveable { mutableStateOf("") }
    var isCorrect by rememberSaveable { mutableStateOf(false) }

    // Cargar las preguntas una sola vez al principio
    LaunchedEffect(Unit) {
        questionViewModel.fetchAllQuestionsValid()
        currentUserViewModel.getCurrentUserData()
    }

    // Detectar cambios en allQuestions para actualizar el estado de carga
    LaunchedEffect(allQuestions) {
        isLoading = allQuestions.isEmpty()
    }

    // Cambiar las respuestas y colores de los botones al cambiar la pregunta
    val currentQuestion = allQuestions.getOrNull(currentQuestionIndex)

    // Inicializar las respuestas barajadas cuando cambia la pregunta
    if (shuffledAnswers.isEmpty() && currentQuestion != null) {
        shuffledAnswers = listOf(
            currentQuestion.correctAnswer,
            currentQuestion.incorrectAnswer1,
            currentQuestion.incorrectAnswer2,
            currentQuestion.incorrectAnswer3
        ).shuffled()
        buttonColors = listOf(Color.White, Color.White, Color.White, Color.White)
        buttonsEnabled = true
    }

    if (isLoading) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ColorApp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Cargando preguntas...",
                color = Color.Black,
                fontSize = 24.sp,
                fontFamily = firaSans,
                fontWeight = FontWeight.Bold
            )
        }
    } else if (currentQuestion != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(ColorApp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(728.dp)
                    .background(ColorBoxNormalQuestion),
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
                    }

                    TituloPreguntaComposable(
                        questionTitle = currentQuestion.tittle,
                        modifier = Modifier.padding(start = 40.dp, top = 20.dp)
                    )

                    // Botones de respuestas
                    for (i in shuffledAnswers.indices) {
                        Button(
                            onClick = {
                                if (buttonsEnabled) {
                                    selectedAnswer = shuffledAnswers[i]
                                    isCorrect = shuffledAnswers[i] == currentQuestion.correctAnswer
                                    buttonColors = buttonColors.toMutableList().apply {
                                        this[i] = if (isCorrect) Color.Green else Color.Red
                                    }

                                    // Deshabilitar los botones después de un retraso de 1 segundo
                                    Handler(Looper.getMainLooper()).postDelayed({
                                        buttonsEnabled = false
                                    }, 500)

                                    // Actualizar puntos si la respuesta es correcta
                                    if (isCorrect) {
                                        val nickname = currentUserViewModel.fetchCurrentNickName()
                                        Log.d("NormalMode", "Nickname del usuario actual: $nickname")
                                        rankingViewModel.updateRankingPoints(nickname)
                                        Log.d("NormalMode", "Puntos actualizados para $nickname")
                                    }
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
                                text = "${'A' + i}. ${shuffledAnswers[i]}",
                                color = Color.Black,
                                fontSize = 18.0.sp,
                                fontFamily = firaSans,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 30.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        SaveComposable(
                            saveIcon = {},
                            modifier = Modifier.padding(end = 20.dp)
                        ) {
                            VectorSaveComposable(modifier = Modifier)
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
                NextNav(
                    modifier = Modifier.fillMaxWidth(1f),
                    nextButton = {
                        if (currentQuestionIndex < allQuestions.size - 1) {
                            currentQuestionIndex++
                        } else {
                            currentQuestionIndex = 0
                        }
                        shuffledAnswers = emptyList()  // Restablecer las respuestas barajadas para la siguiente pregunta
                    }
                )
            }
        }
    }
}

