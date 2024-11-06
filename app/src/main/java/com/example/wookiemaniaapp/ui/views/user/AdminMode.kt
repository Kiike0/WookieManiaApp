package com.example.wookiemaniaapp.ui.views.user


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
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
    questionViewModel: QuestionViewModel // Obtén el ViewModel
) {
    // Observa la lista de todas las preguntas
    val allQuestions by questionViewModel.allQuestions.observeAsState(emptyList())

    // Llama a fetchAllQuestions para cargar las preguntas cuando se inicie la pantalla
    LaunchedEffect(Unit) {
        questionViewModel.fetchAllQuestions()
    }

    // Selecciona la primera pregunta de la lista o la pregunta que quieras filtrar
    val question = allQuestions.firstOrNull() // Aquí seleccionas la pregunta que quieres mostrar

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

            // Verifica si la pregunta existe
            question?.let { question ->
                Spacer(modifier = Modifier.height(200.dp))

                Box(
                    modifier = Modifier
                        .width(370.dp) // El ancho de la Box es más pequeño que el de la pantalla
                        .height(250.dp) // Altura de la Box
                        .background(Color.White, shape = RoundedCornerShape(8.dp)) // Fondo blanco con bordes redondeados
                        .padding(16.dp) // Espaciado interno
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(end = 50.dp) // Deja espacio para las imágenes alineadas a la derecha
                    ) {
                        // Mostrar el título de la pregunta
                        Text(
                            text = question.tittle, // Mostrar el título de la pregunta
                            style = MaterialTheme.typography.title1,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )

                        // Mostrar las respuestas
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
                    }
                }
            } ?: run {
                Spacer(modifier = Modifier.height(50.dp))
                // Si no se encuentra la pregunta, mostrar un mensaje
                Text(
                    text = "Cargando pregunta...",
                    style = MaterialTheme.typography.title1,
                    modifier = Modifier.padding(16.dp)
                )
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
                    modifier = Modifier.fillMaxWidth(1f),
                    nextButton = {}
                )

            }

        }
    }
}