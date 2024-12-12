package com.example.wookiemaniaapp.ui.views.login

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.user.LoginComposable
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla de Login del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param accessUser El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun LoginScreen(
    navController: NavHostController,
    accessUser: UserViewModel
) {
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        LoginComposable(
            backToStartButton = {navController.navigate(Routes.FirstScreen.route)},
            accessButton = { accessUser.login {
                Toast.makeText(context, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                // Agrega un registro para confirmar que onSuccess se está llamando correctamente
                Log.d("LOGIN_SUCCESS", "Inicio de sesión exitoso")
                navController.navigate(Routes.Home.route)
            }
            },
            accessUser = accessUser
        )


    }


}