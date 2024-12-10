package com.example.wookiemaniaapp.ui.views.gamesmodes

import android.os.Handler
import android.os.Looper
import android.util.Log
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
import com.example.wookiemaniaapp.ui.components.TituloPreguntaComposableSurvival
import com.example.wookiemaniaapp.ui.components.VectorHeartComposableSurvival
import com.example.wookiemaniaapp.ui.components.VectorSaveComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.ui.theme.ColorBoxSurvivalQuestion
import com.example.wookiemaniaapp.ui.theme.ColorButtonSurvival
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel
import com.example.wookiemaniaapp.viewmodels.RankingViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel
import androidx.compose.ui.draw.clip

@Composable
fun SurvivalMode(
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
    var buttonColors by rememberSaveable {
        mutableStateOf(
            listOf(
                ColorButtonSurvival,
                ColorButtonSurvival,
                ColorButtonSurvival,
                ColorButtonSurvival
            )
        )
    }
    var buttonsEnabled by rememberSaveable { mutableStateOf(true) }
    var nextButtonEnabled by rememberSaveable { mutableStateOf(true) }

    var selectedAnswer by rememberSaveable { mutableStateOf("") }
    var isCorrect by rememberSaveable { mutableStateOf(false) }

    // Estado de los corazones
    var lives by rememberSaveable { mutableIntStateOf(3) }

    // Estado para mostrar el diálogo de "Game Over"
    var showGameOverDialog by rememberSaveable { mutableStateOf(false) }

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
        buttonColors = listOf(
            ColorButtonSurvival,
            ColorButtonSurvival,
            ColorButtonSurvival,
            ColorButtonSurvival
        )
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
        if (showGameOverDialog) {
            GameOverDialog(
                onBackButton = {
                    navController.navigate(Routes.Home.route)
                }
            )
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(ColorApp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(728.dp)
                        .background(ColorBoxSurvivalQuestion),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 37.dp)
                                .size(30.dp) // Ajusta solo la altura de la Row si es necesario
                        ) {
                            Spacer(modifier = Modifier.width(30.dp))
                            CloseIconComposable(
                                onCloseIcon = { navController.navigate(Routes.Home.route) },
                                modifier = Modifier
                                    .padding(top = 7.dp)
                                    .size(30.dp)
                            )
                            Spacer(modifier = Modifier.width(210.dp))
                            if (lives >= 3) {
                                VectorHeartComposableSurvival(
                                    modifier = Modifier
                                        .width(30.dp)
                                        .padding(end = 10.dp)
                                )
                            }
                            if (lives >= 2) {
                                VectorHeartComposableSurvival(
                                    modifier = Modifier
                                        .width(30.dp)
                                        .padding(end = 10.dp)
                                )
                            }
                            if (lives >= 1) {
                                VectorHeartComposableSurvival(
                                    modifier = Modifier
                                        .width(30.dp)
                                        .padding(end = 20.dp)
                                )
                            }
                        }

                        TituloPreguntaComposableSurvival(
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
                                            Log.d("SurvivalMode", "Nickname del usuario actual: $nickname")
                                            rankingViewModel.updateRankingPoints(nickname)
                                            Log.d("SurvivalMode", "Puntos actualizados para $nickname")
                                        } else {
                                            // Reducir una vida si la respuesta es incorrecta
                                            lives -= 1
                                            if (lives <= 0) {
                                                showGameOverDialog = true
                                            }
                                            nextButtonEnabled = true // Solo deshabilitar el botón de siguiente pregunta si se pierden todas las vidas
                                        }
                                    }
                                },
                                enabled = buttonsEnabled,
                                colors = ButtonDefaults.buttonColors(containerColor = buttonColors[i]),
                                border = BorderStroke(3.dp, Color.Black),
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .padding(12.dp)
                                    .fillMaxWidth()
                                    .height(50.dp)
                            ) {
                                Text(
                                    text = "${'A' + i}. ${shuffledAnswers[i]}",
                                    color = Color.White,
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
                        modifier = Modifier.fillMaxWidth(),
                        nextButton = {
                            if (nextButtonEnabled) {
                                if (currentQuestionIndex < allQuestions.size - 1) {
                                    currentQuestionIndex++
                                } else {
                                    currentQuestionIndex = 0
                                }
                                shuffledAnswers =
                                    emptyList()  // Restablecer las respuestas barajadas para la siguiente pregunta
                                buttonsEnabled = true // Habilitar los botones de nuevo
                            }
                        }
                    )

                }
            }
        }
    }
}


@Composable
fun GameOverDialog(onBackButton: () -> Unit) {
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
                    text = "Game Over\nHas perdido todas tus vidas ¡Inténtalo de nuevo!",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontFamily = com.example.wookiemaniaapp.cabeceratipo3.firaSans,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = onBackButton,
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .size(40.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(
                        text = "Volver",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = com.example.wookiemaniaapp.cabeceratipo3.firaSans,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}







