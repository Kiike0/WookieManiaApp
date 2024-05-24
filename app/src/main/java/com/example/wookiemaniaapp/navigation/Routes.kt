package com.example.wookiemaniaapp.navigation

/**
 * Clase sellada que representa las diferentes pantallas de la aplicación.
 *
 * @property route El identificador de la ruta
 */
sealed class Routes(val route: String) {


    /**
     * Pantalla Inicial.
     */

    object FirstScreen : Routes("firstScreen")


    /**
     * Pantalla Home de juego.
     */

    object Home : Routes("homeView")

    /*

        /**
         * Objeto que representa la pantalla vacia.
         */
        object EmptyScreen : Routes("emptyScreen")

        /**
         * Objeto que representa la pantalla de Inicio de Sesión (Acceso).
         */
        object AccessScreen : Routes("accessScreen")

        /**
         * Objeto que representa la pantalla de Registro de usuario.
         */
        object RegisterScreen : Routes("registerScreen")




        /**
         * Objeto que representa la pantalla Añadir quiz.
         */
        object AddQuizScreen : Routes("addQuizScreen")

        /**
         * Objeto que representa la pantalla del inicio de la quiz.
         */
        object QuizScreen : Routes("quizScreen")

        /**
         * Objeto que representa la pantalla de las preguntas.
         */
        object QuestionsScreen : Routes("questionsScreen")


        /**
         * Objeto que representa la pantalla de las Quiz disponibles.
         */
        object AllQuizzesScreen : Routes("allQuizzesScreen")

     */

}