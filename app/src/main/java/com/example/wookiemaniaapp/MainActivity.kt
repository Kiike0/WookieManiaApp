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
import com.example.wookiemaniaapp.ui.views.login.EmptyView
import com.example.wookiemaniaapp.ui.views.login.LoginScreen
import com.example.wookiemaniaapp.ui.views.login.RegisterScreen
import com.example.wookiemaniaapp.ui.views.user.settings.AdminSettingsScreen
import com.example.wookiemaniaapp.ui.views.user.settings.AdminView
import com.example.wookiemaniaapp.ui.views.user.ProfileScreen
import com.example.wookiemaniaapp.ui.views.user.settings.SettingsScreen
import com.example.wookiemaniaapp.ui.views.user.settings.AboutScreen
import com.example.wookiemaniaapp.ui.views.user.settings.PoliticsScreen
import com.example.wookiemaniaapp.ui.views.user.settings.ServerStateScreen
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel
import com.example.wookiemaniaapp.viewmodels.RankingViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel

class MainActivity : ComponentActivity() {
    private val userViewModel: UserViewModel by viewModels()
    private val questionViewModel: QuestionViewModel by viewModels()
    private val rankingViewModel: RankingViewModel by viewModels()
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
                        startDestination = Routes.EmptyScreen.route
                    ) {

                        composable(Routes.EmptyScreen.route) {
                            EmptyView(
                                navController = navController
                            )
                        }

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

                        // Ruta desde la pantalla de perfil
                        composable(Routes.Profile.route) {
                            ProfileScreen(
                                navController = navController,
                                currentUserViewModel = userViewModel,
                                rankingViewModel = rankingViewModel
                            )
                        }

                        // Ruta desde la pantalla de perfil
                        composable(Routes.Settings.route) {
                            SettingsScreen(
                                navController = navController,
                                currentUserViewModel = userViewModel
                            )
                        }

                        // Ruta desde la pantalla de perfil
                        composable(Routes.AdminSettings.route) {
                            AdminSettingsScreen(
                                navController = navController,
                                currentUserViewModel = userViewModel
                            )
                        }

                        // Ruta desde la pantalla de perfil
                        composable(Routes.AdminMode.route) {
                            AdminView(
                                navController = navController,
                                questionViewModel = questionViewModel
                            )
                        }

                        composable(Routes.AboutScreen.route) {
                            AboutScreen(
                                navController = navController
                            )
                        }

                        composable(Routes.PoliticsScreen.route) {
                            PoliticsScreen(
                                navController = navController
                            )
                        }

                        composable(Routes.ServerStateScreen.route) {
                            ServerStateScreen(
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
                                navController = navController,
                                userViewModel = userViewModel,
                                rankingViewModel = rankingViewModel
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.QuestionTitle.route) {
                            QuestionTitle(
                                navController = navController,
                                newQuestionVM = questionViewModel
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.CorrectAnswer.route) {
                            CorrectAnswer(
                                navController = navController,
                                newQuestionVM = questionViewModel
                            )
                        }

                        // Composable con la ruta a la pantalla de la creación de la pregunta
                        composable(Routes.IncorrectAnswer.route) {
                            IncorrectAnswer(
                                navController = navController,
                                newQuestionVM = questionViewModel
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
                                navController = navController,
                                questionViewModel = questionViewModel,
                                currentUserViewModel = userViewModel,
                                rankingViewModel = rankingViewModel

                            )
                        }
                    }
                }
            }
        }
    }
}