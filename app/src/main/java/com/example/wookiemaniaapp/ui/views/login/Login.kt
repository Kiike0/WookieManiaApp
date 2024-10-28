package com.example.wookiemaniaapp.ui.views.login

import android.util.Log
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
import com.example.wookiemaniaapp.loginprototipo.LoginPrototipo
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.HeadBoard
import com.example.wookiemaniaapp.ui.components.LoginComposable
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun LoginScreen(
    navController: NavHostController,
    accessUser: UserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        LoginComposable(
            backToStartButton = {navController.navigate(Routes.FirstScreen.route)},
            accessButton = { accessUser.login {
                // Agrega un registro para confirmar que onSuccess se está llamando correctamente
                Log.d("LOGIN_SUCCESS", "Inicio de sesión exitoso")
                navController.navigate(Routes.Home.route)
            }
            },
            accessUser = accessUser
        )


    }


}
/*

/**
 * Función composable que representa la pantalla principal para loguearse.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param accessViewModel El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun Login(
    navController: NavHostController,
    accessViewModel: UserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp),
        contentAlignment = Alignment.Center
    ) {
        LoginComposable(
            modifier = Modifier,
            onAccessButton = {
                accessViewModel.login {
                    // Agrega un registro para confirmar que onSuccess se está llamando correctamente
                    Log.d("LOGIN_SUCCESS", "Inicio de sesión exitoso")
                    navController.navigate(Routes.HomeScreen.route)
                }
            },
            onCreateButton = { navController.navigate(Routes.RegisterScreen.route) },
            accessUserViewModel = accessViewModel
        )
        if (accessViewModel.showAlert) {
            Alert(title = "Alerta",
                message = "Usuario y/o contrasena incorrectos",
                confirmText = "Aceptar",
                onConfirmClick = { accessViewModel.closeAlert() },
                onDismissClick = { } )
        }

    }
}

 */