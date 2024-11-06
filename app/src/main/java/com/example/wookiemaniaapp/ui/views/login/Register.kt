package com.example.wookiemaniaapp.ui.views.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.ui.components.user.RegisterComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun RegisterScreen(
    newUserVM: UserViewModel,
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        RegisterComposable(
            newUserVM = newUserVM,
            navController = navController
        )

    }
}