package com.example.wookiemaniaapp.ui.views.user

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.AvatarViewModel
import com.example.wookiemaniaapp.viewmodels.RankingViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel


/**
 * Función composable que representa la pantalla de perfil del usuario.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */

@Composable
fun ProfileScreen(
    navController: NavHostController,
    currentUserViewModel: UserViewModel,
    rankingViewModel: RankingViewModel,
    avatarViewModel: AvatarViewModel
) {
    // Observa la lista de rankings en lugar de los usuarios
    val allRankingUsers by rankingViewModel.rankingList.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        currentUserViewModel.getCurrentUserData()
        rankingViewModel.fetchRankingData()
        avatarViewModel.fetchAvatarUrl() // Llama a fetchAvatarUrl para obtener la URL del avatar
    }

    // Observa la URL del avatar
    val avatarUrl by avatarViewModel.avatarUrl.observeAsState()

    // Busca al usuario actual en el ranking
    val userRanking = allRankingUsers.find { it.nickname == currentUserViewModel.fetchCurrentNickName() }

    // Si no se encuentra al usuario, coloca un valor por defecto
    val userPoints = userRanking?.points?.toString() ?: "0"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            verticalAlignment = Alignment.CenterVertically // Alinea el contenido verticalmente al centro
        ) {
            // Texto centrado en la fila
            Text(
                text = "@" + currentUserViewModel.fetchCurrentNickName(),
                modifier = Modifier
                    .padding(start = 20.dp), // Padding a la izquierda
                textAlign = TextAlign.Start, // Alinea el texto a la izquierda
                fontWeight = FontWeight.Bold,
                fontFamily = firaSans,
                fontSize = 18.sp,
                color = Color.Black
            )

            // Spacer que empuja la imagen hacia la derecha
            Spacer(modifier = Modifier.weight(1f)) // Ocupa el espacio restante

            // Imagen a la derecha
            Box(
                modifier = Modifier
                    .padding(end = 20.dp)
                    .clickable(onClick = {
                        if (currentUserViewModel.currentUserEmail == "adminprueba@gmail.com") {
                            navController.navigate(Routes.AdminSettings.route)
                        } else {
                            navController.navigate(Routes.Settings.route)
                        }
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
            // Mostrar el avatar
            avatarUrl?.let { url ->
                Image(
                    painter = rememberImagePainter(url),
                    contentDescription = "Avatar Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(BorderStroke(2.dp, Color.Black), CircleShape)
                        .background(Color.Gray)
                )
            } ?: Text(text = "No Image")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center // Centra horizontalmente
        ) {
            // Texto centrado debajo de la imagen
            Text(
                text = currentUserViewModel.fetchCurrentName() + " " + currentUserViewModel.fetchCurrentSurname(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontFamily = firaSans,
                fontSize = 16.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        // Envuelve PlayerStatusBox en un Box para centrarlo
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center // Centra horizontalmente
        ) {
            PlayerStatusBox(playerStatus = "Jugador amateur") // Llama a la función con el texto deseado
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Puntuación en el ranking",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans,
            fontSize = 17.sp,
            color = Color.Black
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
                Spacer(modifier = Modifier.width(30.dp)) // Espacio reducido

                // Texto
                Text(
                    text = currentUserViewModel.fetchCurrentNickName(),
                    modifier = Modifier.padding(end = 10.dp), // Padding a la derecha
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    color = Color.Black
                )

                // Spacer que empuja el tercer texto a la derecha
                Spacer(modifier = Modifier.weight(1f)) // Ocupa el espacio restante

                // Tercer texto alineado a la derecha
                Text(
                    text = userPoints,
                    modifier = Modifier.padding(end = 20.dp),
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    color = Color.Black
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
                homeButton = { navController.navigate(Routes.Home.route) },
                profileButton = { navController.navigate(Routes.Profile.route) },
                addButton = { navController.navigate(Routes.QuestionTitle.route) },
                profileImagePainter = rememberImagePainter(avatarUrl)
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
            .border(
                2.dp,
                Color.Black,
                RoundedCornerShape(16.dp)
            ) // Borde negro con esquinas redondeadas
            .background(
                Color.Black,
                RoundedCornerShape(16.dp)
            ) // Fondo negro con esquinas redondeadas
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