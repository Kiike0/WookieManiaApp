package com.example.wookiemaniaapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.startgame.StartGame
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla principal del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun FirstScreenView(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        StartGame(
            modifier = Modifier,
            loginButton = { navController.navigate(Routes.Login.route) },
            registerButton = { navController.navigate(Routes.Register.route) },
            invitadoButton = { navController.navigate(Routes.Home.route) }
        )
    }
}

/*
Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 150.dp)
                .align(Alignment.TopCenter)
        ){
            Text(
                text = "WookieMania",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

            )
            Spacer(modifier = Modifier.height(300.dp))
            Button(
                onClick = { navController.navigate(Routes.Home.route) },
                modifier = Modifier
                    .size(120.dp)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black, contentColor = Color.White)
            )
            {
                Text(
                    "Play Now!",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    textAlign = TextAlign.Center
                )

            }
        }
 */