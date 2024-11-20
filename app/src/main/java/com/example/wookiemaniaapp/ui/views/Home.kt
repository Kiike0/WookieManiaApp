package com.example.wookiemaniaapp.ui.views


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.HeadBoard
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.SuggestsQuizComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    // Variable a parte necesaria
    //val scroll = rememberLazyListState()
    //val flingBehavior = rememberSnapFlingBehavior(lazyListState = scroll)

    Column(
        modifier = Modifier.fillMaxSize().background(ColorApp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(color = Color.Transparent)
                .padding(top = 30.dp)
        ) {
            HeadBoard(
                modifier= Modifier,
                rankingButton = {navController.navigate(Routes.Ranking.route)},
                playButton = {navController.navigate(Routes.NormalMode.route) },
                survivalButton = {navController.navigate(Routes.SurvivalMode.route)},
                categoriesButton = {navController.navigate(Routes.Categories.route)},
                starButton = {}
            )

        }

/*
        Box(
            modifier = Modifier
                .fillMaxWidth() // Para que ocupe todo el ancho
                .padding(start = 25.dp, top = 30.dp) // Asegúrate de que el padding sea correcto
        ){
            CustomizedBasicText(modifier = Modifier, contenido = "Para ti")
        }

 */

        SuggestsQuizComposable(modifier = Modifier)

        // Este Spacer ocupa todo el espacio restante
        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = Color.Transparent)
                .padding(bottom = 10.dp)
        ) {
            NavigationBar(
                modifier = Modifier,
                homeButton = {navController.navigate(Routes.Home.route)},
                profileButton= { navController.navigate(Routes.Profile.route)},
                addButton = {navController.navigate(Routes.QuestionTitle.route)}
            )

        }

    }



}