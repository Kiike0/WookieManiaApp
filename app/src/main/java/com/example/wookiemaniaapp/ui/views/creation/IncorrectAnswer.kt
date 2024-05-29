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
import com.example.wookiemaniaapp.preguntatitulo.PreguntaTitulo
import com.example.wookiemaniaapp.ui.components.ToAddComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun IncorrectAnswer(
    navController: NavHostController
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
                    backButton = { navController.navigate(Routes.CorrectAnswer.route) }
                )
            }
            Spacer(modifier = Modifier.height(50.dp))

            //Pregunta prototipo
            PreguntaTitulo(modifier = Modifier)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = ColorApp)
                .align(Alignment.BottomEnd)
                .padding(bottom = 122.dp)
        ) {
            ToAddComposable(
                modifier = Modifier,
                addButton = {navController.navigate(Routes.Home.route)}
            )

        }

    }


}