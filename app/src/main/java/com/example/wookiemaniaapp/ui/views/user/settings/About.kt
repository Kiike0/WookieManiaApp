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
import androidx.compose.foundation.layout.wrapContentSize
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
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Información de la app.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun AboutScreen(
    navController: NavHostController
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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 60.dp)
            ) {
                CabeceraTipo3(
                    modifier = Modifier,
                    screenText = "Información",
                    backButton = {navController.navigate(Routes.Settings.route)}
                )
            }
            Spacer(modifier = Modifier.height(140.dp))

            Image(
                painter = painterResource(id = R.drawable.logoapp),
                contentDescription = "Imagen logo",
                modifier = Modifier
                    .wrapContentSize() // Ajusta la imagen a su tamaño de contenido
            )

            Image(
                painter = painterResource(id = R.drawable.nameapp),
                contentDescription = "Imagen nombre",
                modifier = Modifier
                    .wrapContentSize() // Ajusta la imagen a su tamaño de contenido
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Contenedor para limitar el ancho del texto
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp) // Añade un margen alrededor del texto
                    .widthIn(max = 350.dp) // Limita el ancho máximo del texto
            ) {
                Text(
                    text = """
                        Conozca nuestra creciente familia. Nuestra app de preguntas Wookiemania es un eco-sistema de preguntas y respuestas para descubrir cuánto sabes de la cultura pop del cine, la música y los videojuegos.

                        Proyecto afianzado en España que busca acercar el tradicional juego de Trivial con un toque diferente.

                        Síguenos en cualquiera de nuestras redes.
                    """.trimIndent(),
                    textAlign = TextAlign.Center,
                    fontSize = 15.0.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.redesimage),
                contentDescription = "Imagen redes provisional",
                modifier = Modifier
                    .wrapContentSize() // Ajusta la imagen a su tamaño de contenido
            )
        }

    }


}