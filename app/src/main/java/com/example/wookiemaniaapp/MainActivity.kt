package com.example.wookiemaniaapp

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.WookieManiaAppTheme
import com.example.wookiemaniaapp.ui.views.Categories
import com.example.wookiemaniaapp.ui.views.CategoryQuestion
import com.example.wookiemaniaapp.ui.views.FirstScreenView
import com.example.wookiemaniaapp.ui.views.HomeScreen
import com.example.wookiemaniaapp.ui.views.NormalMode
import com.example.wookiemaniaapp.ui.views.RankingScreen
import com.example.wookiemaniaapp.ui.views.creation.CorrectAnswer
import com.example.wookiemaniaapp.ui.views.creation.IncorrectAnswer
import com.example.wookiemaniaapp.ui.views.creation.QuestionTitle
import com.example.wookiemaniaapp.ui.views.login.LoginScreen
import com.example.wookiemaniaapp.ui.views.login.RegisterScreen
import com.example.wookiemaniaapp.viewmodels.UserViewModel

class MainActivity : ComponentActivity() {
    private val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Para ocultar la barra "toolbar" de arriba del movil
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContent {
            WookieManiaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.FirstScreen.route
                    ) {
                        // Ruta desde la primera Screen
                        composable(Routes.FirstScreen.route) {
                            FirstScreenView(
                                navController = navController
                            )
                        }

                        // Ruta desde el login
                        composable(Routes.Login.route) {
                            LoginScreen(
                                navController = navController,
                                accessUser = userViewModel
                            )
                        }

                        // Ruta desde la pantalla de registro
                        composable(Routes.Register.route) {
                            RegisterScreen(
                                newUserVM = userViewModel,
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla Home
                        composable(Routes.Home.route) {
                            HomeScreen(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla de las categorias a elegir
                        composable(Routes.Categories.route) {
                            Categories(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla del Ranking global
                        composable(Routes.Ranking.route) {
                            RankingScreen(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.QuestionTitle.route) {
                            QuestionTitle(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.CorrectAnswer.route) {
                            CorrectAnswer(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.IncorrectAnswer.route) {
                            IncorrectAnswer(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla del modo Normal
                        composable(Routes.Category.route) {
                            CategoryQuestion(
                                navController = navController
                            )
                        }

                        // Composable con la ruta a la pantalla del modo Normal
                        composable(Routes.NormalMode.route) {
                            NormalMode(
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}