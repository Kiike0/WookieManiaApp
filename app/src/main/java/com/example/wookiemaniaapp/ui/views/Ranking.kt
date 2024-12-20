package com.example.wookiemaniaapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CustomizedTypeText
import com.example.wookiemaniaapp.ui.components.HeadBoard2
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.RankingPoints
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.AvatarViewModel
import com.example.wookiemaniaapp.viewmodels.RankingViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla Ranking del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun RankingScreen(
    navController: NavHostController,
    userViewModel: UserViewModel,
    rankingViewModel: RankingViewModel,
    avatarViewModel: AvatarViewModel // Añadimos AvatarViewModel
) {

    // Observa la lista de rankings en lugar de los usuarios
    val allRankingUsers by rankingViewModel.rankingList.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        userViewModel.getCurrentUserData()
        rankingViewModel.fetchRankingData()
        avatarViewModel.fetchAvatarUrl() // Llama a fetchAvatarUrl para obtener la URL del avatar
    }

    // Observa la URL del avatar
    val avatarUrl by avatarViewModel.avatarUrl.observeAsState()

    // Busca al usuario actual en el ranking
    val userRanking = allRankingUsers.find { it.nickname == userViewModel.fetchCurrentNickName() }

    // Si no se encuentra al usuario, coloca un valor por defecto
    val userPoints = userRanking?.points?.toString() ?: "0"

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
                    .padding(top = 90.dp)
            ) {
                HeadBoard2(
                    modifier = Modifier,
                    starButton = {}
                )
            }
            Spacer(modifier = Modifier.height(62.dp))

            val tamanyoTotal = allRankingUsers.size
            var contador = 0
            LazyColumn {
                item {
                    CustomizedTypeText(contenido = "Tu puntuación en el ranking")
                    Spacer(modifier = Modifier.height(15.dp))
                    RankingPoints(
                        modifier = Modifier,
                        username = "@${userViewModel.fetchCurrentNickName()}",
                        points = userPoints,
                        boxToProfileButton = {}
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                }
                item {
                    CustomizedTypeText(contenido = "Ranking global")
                    Spacer(modifier = Modifier.height(15.dp))
                }
                items(tamanyoTotal) {
                    val user = allRankingUsers[contador++]
                    RankingPoints(
                        modifier = Modifier,
                        username = "@${user.nickname}",
                        points = user.points.toString(),
                        boxToProfileButton = {}
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                }
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = ColorApp)
                .align(Alignment.BottomEnd)
                .padding(bottom = 10.dp)
        ) {
            NavigationBar(
                modifier = Modifier,
                homeButton = { navController.navigate(Routes.Home.route) },
                profileButton = { navController.navigate(Routes.Profile.route) },
                addButton = { navController.navigate(Routes.QuestionTitle.route) },
                profileImagePainter = rememberImagePainter(avatarUrl) // Pasar la imagen
            )
        }
    }
}
