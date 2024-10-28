package com.example.wookiemaniaapp.ui.views.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CircularImage
import com.example.wookiemaniaapp.ui.components.HeadBoard
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.SuggestsQuizComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel


/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */

@Composable
fun ProfileScreen(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    // Variable a parte necesaria
    //val scroll = rememberLazyListState()
    //val flingBehavior = rememberSnapFlingBehavior(lazyListState = scroll)

    LaunchedEffect(Unit) {
        currentUserViewModel.getNickName()
    }

    Column(
        modifier = Modifier.fillMaxSize().background(ColorApp)
    ) {

        // Caja para centrar la imagen circular en la parte superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp), // Agrega un espacio superior si lo necesitas
            contentAlignment = Alignment.TopCenter // Centra la imagen en la parte superior
        ) {
            CircularImage() // Llama a la función que contiene la imagen circular
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Texto centrado debajo de la imagen
        Text(
            text = currentUserViewModel.getCurrentNickName(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )



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
                profileButton= {},
                addButton = {navController.navigate(Routes.QuestionTitle.route)}
            )

        }

    }



}