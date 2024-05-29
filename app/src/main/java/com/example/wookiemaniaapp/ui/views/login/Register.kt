package com.example.wookiemaniaapp.ui.views.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.loginprototipo.LoginPrototipo
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.registroprototipo.RegistroPrototipo
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun RegisterScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        RegistroPrototipo(
            modifier = Modifier,
            volverAInicioBoton = {navController.navigate(Routes.FirstScreen.route)},
            registrarseBoton = {}
        )


    }


}

/*
/**
 * Función composable que representa la pantalla principal para registrarse.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param newUserVM El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun Register(
    navController: NavHostController,
    newUserVM: UserViewModel
) {
    RegisterComposable(
        newUserVM = newUserVM,
        navController = navController
    )
}
*/