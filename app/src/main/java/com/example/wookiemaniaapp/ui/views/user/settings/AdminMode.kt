package com.example.wookiemaniaapp.ui.views.user.settings


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.MaterialTheme
import com.example.wookiemaniaapp.cabeceratipo3.CabeceraTipo3
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.nextnav.NextNav
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun AdminView(
    navController: NavHostController,
    questionViewModel: QuestionViewModel
) {
    // Observa solo `allQuestions` que será filtrado a `invalidQuestions`
    val allQuestions by questionViewModel.allQuestions.observeAsState(emptyList())
    val invalidQuestions = allQuestions.filter { !it.isValid }

    LaunchedEffect(Unit) {
        questionViewModel.fetchAllQuestionsFalse()
    }

    var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }
    val isEndOfQuestions = currentQuestionIndex >= invalidQuestions.size

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 60.dp)
            ) {
                CabeceraTipo3(
                    modifier = Modifier,
                    screenText = "Modo Administrador",
                    backButton = { navController.navigate(Routes.AdminSettings.route) }
                )
            }

            if (invalidQuestions.isNotEmpty() && !isEndOfQuestions) {
                val question = invalidQuestions[currentQuestionIndex]

                Spacer(modifier = Modifier.height(200.dp))

                Box(
                    modifier = Modifier
                        .width(370.dp)
                        .height(380.dp)
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = question.tittle,
                            style = MaterialTheme.typography.title1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Text(
                            text = "Correcta: ${question.correctAnswer}",
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Text(
                            text = "Incorrecta 1: ${question.incorrectAnswer1}",
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Text(
                            text = "Incorrecta 2: ${question.incorrectAnswer2}",
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        Text(
                            text = "Incorrecta 3: ${question.incorrectAnswer3}",
                            style = MaterialTheme.typography.body1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.Bottom,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp)
                        ) {
                            // Botón "Añadir"
                            Button(
                                onClick = {
                                    val updatedQuestion = question.copy(isValid = true)
                                    questionViewModel.updateQuestion(
                                        question.idQuiz,
                                        updatedQuestion
                                    ) {
                                        // Avanza a la siguiente pregunta después de actualizar
                                        currentQuestionIndex++
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(text = "Añadir", color = Color.White)
                            }

                            // Botón "Borrar"
                            Button(
                                onClick = {
                                    questionViewModel.deleteQuestion(question.idQuiz) {
                                        currentQuestionIndex++
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(text = "Borrar", color = Color.White)
                            }
                        }
                    }
                }
            } else {
                Spacer(modifier = Modifier.height(200.dp))
                Box(
                    modifier = Modifier
                        .width(370.dp)
                        .height(100.dp)
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No hay más preguntas",
                        style = MaterialTheme.typography.title1,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

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
                        if (!isEndOfQuestions) {
                            currentQuestionIndex++
                        }
                    }
                )
            }
        }
    }
}

