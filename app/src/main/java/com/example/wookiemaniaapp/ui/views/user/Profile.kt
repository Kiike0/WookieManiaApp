package com.example.wookiemaniaapp.ui.views.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CircularImage
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.RoundedCornerSquareImage
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel


/**
 * Función composable que representa la pantalla de perfil del usuario.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */

@Composable
fun ProfileScreen(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {

    LaunchedEffect(Unit) {
        currentUserViewModel.getNickName()
    }


    Column(
        modifier = Modifier.fillMaxSize().background(ColorApp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
            verticalAlignment = Alignment.CenterVertically // Alinea el contenido verticalmente al centro
        ) {
            // Texto centrado en la fila
            Text(
                text = "@" + currentUserViewModel.getCurrentNickName(),
                modifier = Modifier
                    .weight(1f) // Permite que el texto ocupe el espacio disponible
                    .padding(start = 20.dp), // Padding a la izquierda
                textAlign = TextAlign.Start, // Alinea el texto a la izquierda
                fontWeight = FontWeight.Bold,
                fontFamily = firaSans,
                fontSize = 18.sp
            )

            // Spacer que empuja la imagen hacia la derecha
            Spacer(modifier = Modifier.weight(1f)) // Ocupa el espacio restante

            // Imagen a la derecha
            Box(
                modifier = Modifier
                    .padding(end = 20.dp)
                    .clickable(onClick = {
                        navController.navigate(Routes.Settings.route)
                    })
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ruedaconfiguracion),
                    contentDescription = "Settings"
                )
            }
        }

        // Caja para centrar la imagen circular en la parte superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            CircularImage()
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Envuelve PlayerStatusBox en un Box para centrarlo
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center // Centra horizontalmente
        ) {
            PlayerStatusBox(playerStatus = "Jugador amateur") // Llama a la función con el texto deseado
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Texto centrado debajo de la imagen
        Text(
            text = "Posición en el ranking",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans,
            fontSize = 17.sp
        )

        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(50.dp)
                .border(2.dp, Color.Black, RoundedCornerShape(8.dp))
                .background(Color.Transparent)
                .align(Alignment.CenterHorizontally)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth() // Ocupa todo el ancho de la Box
                    .height(50.dp), // Asegúrate de que el Row tenga la misma altura que la Box
                verticalAlignment = Alignment.CenterVertically, // Alinea verticalmente al centro
                horizontalArrangement = Arrangement.Start // Alinea horizontalmente al inicio
            ) {
                // Primer texto
                Text(
                    text = "34",
                    modifier = Modifier.padding(start = 20.dp), // Padding a la izquierda
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )

                Spacer(modifier = Modifier.width(10.dp)) // Espacio reducido entre el texto y la imagen

                // Imagen
                RoundedCornerSquareImage(
                    painter = painterResource(id = R.drawable.avatarprueba),
                    size = 35,
                    cornerRadius = 5
                )

                Spacer(modifier = Modifier.width(10.dp)) // Espacio reducido entre la imagen y el segundo texto

                // Segundo texto
                Text(
                    text = currentUserViewModel.getCurrentNickName(),
                    modifier = Modifier.padding(end = 10.dp), // Padding a la derecha
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )

                // Spacer que empuja el tercer texto a la derecha
                Spacer(modifier = Modifier.weight(1f)) // Ocupa el espacio restante

                // Tercer texto alineado a la derecha
                Text(
                    text = "119",
                    modifier = Modifier.padding(end = 20.dp),
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )
            }
        }



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

@Composable
fun PlayerStatusBox(playerStatus: String) {
    Box(
        modifier = Modifier
            .width(220.dp) // Ancho de la Box
            .height(40.dp) // Alto de la Box
            .border(2.dp, Color.Black, RoundedCornerShape(16.dp)) // Borde negro con esquinas redondeadas
            .background(Color.Black, RoundedCornerShape(16.dp)) // Fondo negro con esquinas redondeadas
            .padding(8.dp) // Padding interno
    ) {
        Text(
            text = playerStatus, // Usa el texto pasado como argumento
            modifier = Modifier
                .fillMaxSize(), // Ocupa todo el espacio de la Box
            textAlign = TextAlign.Center, // Centra el texto horizontalmente
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp, // Reducir el tamaño de la fuente
            fontFamily = firaSans,
            color = ColorApp // Color blanco para mayor visibilidad
        )
    }
}