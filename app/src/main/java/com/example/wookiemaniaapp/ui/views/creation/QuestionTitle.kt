package com.example.wookiemaniaapp.ui.views.creation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.cabeceratipo3.CabeceraTipo3
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.creation.AddingButtonComposable
import com.example.wookiemaniaapp.ui.components.creation.AddingTittleComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel

/**
 * Función composable que representa la pantalla de la creacion de la respuesta para el título de las preguntas.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param newQuestionVM El controlador de view model para gestionar las preguntas.
 */
@Composable
fun QuestionTitle(
    navController: NavHostController,
    newQuestionVM: QuestionViewModel
) {
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
                    screenText = "Creación",
                    backButton = {navController.navigate(Routes.Home.route)}
                )
            }
            Spacer(modifier = Modifier.height(225.dp))

            /**
             * Esta es la función donde añadiremos el título de la pregunta
             */
            AddingTittleComposable(
                newQuestionVM = newQuestionVM
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = ColorApp)
                .align(Alignment.BottomEnd)
                .padding(bottom = 122.dp)
        ) {
            // Cuando pulsemos este botón se añadirá la pregunta a la base de datos
            AddingButtonComposable(
                modifier= Modifier,
                addButton = {navController.navigate(Routes.CorrectAnswer.route)}
            )

        }

    }


}