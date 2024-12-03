package com.example.wookiemaniaapp.ui.views.user.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.cabeceratipo3.CabeceraTipo3
import com.example.wookiemaniaapp.cabeceratipo3.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla política y privacidad del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun PoliticsScreen(
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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 60.dp)
            ) {
                CabeceraTipo3(
                    modifier = Modifier,
                    screenText = "Política y privacidad",
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

            // Contenedor scrollable para el texto largo
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Para ocupar el espacio restante de la pantalla y permitir scroll
                    .padding(horizontal = 24.dp)
                    .widthIn(max = 350.dp)
            ) {
                item {
                    Text(
                        text = """
                            Declaración de privacidad
                            WookieManiaApp es consciente de la importancia que para usted supone el uso que hacemos de su información personal y el modo en que la compartimos. Esta Política de Privacidad tiene por objeto ayudarle a entender qué datos recopilamos, con qué finalidad los tratamos y nuestros esfuerzos por protegerlos. Apreciamos la confianza que deposita en nosotros para que los tratemos con las garantías adecuadas y de conformidad con los principios de transparencia, minimización, limitación de la finalidad, exactitud, integridad y confidencialidad, así como respetando el resto de obligaciones y garantías establecidas en el Reglamento (UE) 2016/679 del Parlamento Europeo y del Consejo de 27 de abril de 2016 relativo a la protección de las personas físicas en lo que respecta al tratamiento de datos personales y a la libre circulación de estos datos y en la Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos y garantía de los derechos digitales.
                            
                            Los datos personales que el cliente o usuario facilite serán tratados como se describe en detalle en el artículo 15 y siguientes del RGPD.
                        """.trimIndent(),
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp,
                        fontFamily = firaSans,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}