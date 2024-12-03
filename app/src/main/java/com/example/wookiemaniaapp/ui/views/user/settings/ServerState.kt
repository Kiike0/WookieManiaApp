package com.example.wookiemaniaapp.ui.views.user.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.cabeceratipo3.CabeceraTipo3
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla del estado del servidor del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun ServerStateScreen(
    navController: NavHostController,
    userViewModel: UserViewModel
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
            // Cabecera
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 60.dp)
            ) {
                CabeceraTipo3(
                    modifier = Modifier,
                    screenText = "Estado del servidor",
                    backButton = {
                        if (userViewModel.currentUserEmail == "adminprueba@gmail.com") {
                            navController.navigate(Routes.AdminSettings.route)
                        } else {
                            navController.navigate(Routes.Settings.route)
                        }
                    }
                )
            }

            Spacer(modifier = Modifier.height(100.dp))

            // Imagen agrandada
            Image(
                painter = painterResource(id = R.drawable.serverstatelogo),
                contentDescription = "Imagen servidor",
                modifier = Modifier
                    .size(150.dp) // Tamaño más grande para la imagen
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Contenedor para el texto
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp) // Añade un margen alrededor del texto
                    .widthIn(max = 350.dp) // Limita el ancho máximo del texto
            ) {
                Text(
                    text = "El servidor está online",
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    fontFamily = com.example.wookiemaniaapp.categorytypecomp.firaSans,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center) // Centrado dentro de la Box
                )
            }
        }
    }
}