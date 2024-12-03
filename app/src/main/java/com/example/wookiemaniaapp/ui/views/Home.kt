package com.example.wookiemaniaapp.ui.views


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.cabeceratipo3.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.HeadBoard
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.components.QuizCardComposable
import com.example.wookiemaniaapp.ui.painters.imageQuizResources
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.QuizViewModel

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */

@Composable
fun HomeScreen(
    navController: NavHostController,
    quizVM: QuizViewModel
) {

    val quizIdsList: ArrayList<String> by quizVM.quizIdsList.observeAsState(ArrayList())
    val datos by quizVM.quizData.collectAsState()

    LaunchedEffect(Unit) {
        quizVM.fetchQuiz()
    }

    val miArrayList = ArrayList<String>()
    datos.forEach { item ->
        miArrayList.add(item.title)
    }

    val nuevaListaJSON = miArrayList.toString()
    val jsonSinCorchetes = nuevaListaJSON.substring(1, nuevaListaJSON.length - 1)
    val valoresTitulos = jsonSinCorchetes.split(", ")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(color = Color.Transparent)
                .padding(top = 30.dp)
        ) {
            HeadBoard(
                modifier = Modifier,
                rankingButton = { navController.navigate(Routes.Ranking.route) },
                playButton = { navController.navigate(Routes.NormalMode.route) },
                survivalButton = { navController.navigate(Routes.SurvivalMode.route) },
                categoriesButton = { navController.navigate(Routes.Categories.route) },
                starButton = {}
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        val esImpar = datos.size % 2 != 0
        //val esPar = !esImpar

        var tamanyoTotal = datos.size / 2
        val tamanyoImagenResources = imageQuizResources.size / 2
        if (esImpar) tamanyoTotal++

        var elementoComprobacion = 0

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.weight(1f).padding(start = 30.dp)
        ) {
            item{
                // Texto "Quizzes Personalizadas"
                Text(
                    text = "Quizzes Personalizadas",
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(end = 150.dp)
                )
            }
            items(tamanyoTotal) { elemento ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start // Alinear a la izquierda
                ) {
                    QuizCardComposable(
                        modifier = Modifier
                            .size(155.dp, 200.dp),
                        quizImg = painterResource(imageQuizResources[elementoComprobacion]),
                        quizTitleText = "${valoresTitulos.getOrNull(elemento * 2)}",
                        onBoxQuiz = {
                            quizVM.changeQuizId(quizIdsList[elemento * 2])
                            navController.navigate(Routes.QuizMode.route)
                        },
                        onQuizImg = {
                            quizVM.changeQuizId(quizIdsList[elemento * 2])
                            navController.navigate(Routes.QuizMode.route)
                        }
                    )

                    if (elemento * 2 + 1 < datos.size) {
                        Spacer(modifier = Modifier.width(25.dp))
                        QuizCardComposable(
                            modifier = Modifier.size(155.dp, 200.dp),
                            quizImg = painterResource(imageQuizResources[elementoComprobacion + tamanyoImagenResources]),
                            quizTitleText = "${valoresTitulos.getOrNull(elemento * 2 + 1)}",
                            onBoxQuiz = {
                                quizVM.changeQuizId(quizIdsList[elemento * 2 + 1])
                                navController.navigate(Routes.QuizMode.route)
                            },
                            onQuizImg = {
                                quizVM.changeQuizId(quizIdsList[elemento * 2 + 1])
                                navController.navigate(Routes.QuizMode.route)
                            }
                        )
                    }
                }

                if (elementoComprobacion < tamanyoImagenResources - 1) elementoComprobacion++
                else elementoComprobacion = 0
            }

            item {
                Spacer(modifier = Modifier.height(70.dp))
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(142.dp)
                .background(color = Color.Transparent)
                .padding(bottom = 10.dp)
        ) {
            NavigationBar(
                modifier = Modifier.align(Alignment.BottomCenter),
                homeButton = { navController.navigate(Routes.Home.route) },
                profileButton = { navController.navigate(Routes.Profile.route) },
                addButton = { navController.navigate(Routes.QuestionTitle.route) }
            )
        }
    }
}
