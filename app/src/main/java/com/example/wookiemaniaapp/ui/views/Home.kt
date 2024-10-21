package com.example.wookiemaniaapp.ui.views

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.HeadBoard
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavHostController
) {
    // Variable a parte necesaria
    val scroll = rememberLazyListState()
    val flingBehavior = rememberSnapFlingBehavior(lazyListState = scroll)

    Box(
        modifier = Modifier.fillMaxSize().background(ColorApp),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(color = Color.Transparent)
                .align(Alignment.TopStart)
                .padding(top = 30.dp)
        ) {
            HeadBoard(
                modifier= Modifier,
                rankingButton = {navController.navigate(Routes.Ranking.route)},
                playButton = { navController.navigate(Routes.Category.route) },
                survivalButton = {},
                categoriesButton = { navController.navigate(Routes.Categories.route) },
                starButton = {},
                notifButton = {}
            )
        }

        LazyRow(
            state = scroll,
            flingBehavior = flingBehavior,
            modifier = Modifier,
        ) {
            item{


            }
            item {

            }


        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = Color.Transparent)
                .align(Alignment.BottomEnd)
                .padding(bottom = 10.dp)
        ) {
            NavigationBar(
                modifier = Modifier,
                homeButton = {navController.navigate(Routes.Home.route)},
                profileButton= {},
                addButton = {navController.navigate(Routes.QuestionTitle.route)}
            )

        }

    }



}