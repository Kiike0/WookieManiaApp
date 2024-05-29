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

    /**
     * Pantalla de todas las Categorías para elegir.
     */

    object Categories : Routes("categoriesView")

    /**
     * Pantalla de la Categoría elegida o modo normal de juego.
     */

    object Category : Routes("categoryView")


    /**
     * Pantalla de las preguntas del modo normal de juego.
     */

    object NormalMode : Routes("normalModeView")

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