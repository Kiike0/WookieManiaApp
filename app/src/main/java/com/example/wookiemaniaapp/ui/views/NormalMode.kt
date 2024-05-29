package com.example.wookiemaniaapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.nextnav.NextNav
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.NormalQuestion
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun NormalMode(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent)
                .align(Alignment.TopStart)
        ) {
            NormalQuestion(
                modifier = Modifier,
                textCategory = "Fantasía",
                questionTitle = "¿Cómo se llama la lechuza de Harry " +
                        "Potter?", //Titulo ejemplo
                dislikeIcon = {},
                likeIcon = {},
                closeIcon = { navController.navigate(Routes.Home.route) },
                saveIcon = {},
                buttonTextAnswerA = {},
                buttonTextAnswerB = {},
                buttonTextAnswerC = {},
                buttonTextAnswerD = {}
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = Color.Transparent)
                .align(Alignment.BottomEnd)
                .padding(bottom = 10.dp)
        ) {
            NextNav(
                modifier = Modifier,
                nextButton = {}
            )

        }


    }


}