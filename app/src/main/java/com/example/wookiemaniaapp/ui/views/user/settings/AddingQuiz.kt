package com.example.wookiemaniaapp.ui.views.user.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.ui.components.creation.AddQuizComposable
import com.example.wookiemaniaapp.viewmodels.QuizViewModel

/**
 * Función composable que representa la pantalla para crear una quiz.
 *
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 *
 * @param quizVM El ViewModel responsable de gestionar la lógica de la colección de quizzes.
 */
@Composable
fun AddQuizView(
    navController: NavHostController,
    //newUserVM: UserViewModel,
    quizVM: QuizViewModel
) {
    AddQuizComposable(
        navController = navController,
        quizVM = quizVM
    )
}