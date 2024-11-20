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
     * Pantalla vacía.
     */
    object EmptyScreen : Routes("emptyScreen")

    /**
     * Objeto que representa la pantalla de Inicio de Sesión (Acceso).
     */
    object Login : Routes("loginScreen")

    /**
     * Objeto que representa la pantalla de Registro de usuario.
     */
    object Register : Routes("registerScreen")



    /**
     * Pantalla Home de juego.
     */
    object Home : Routes("homeView")

    /**
     * Pantalla de todas las Categorías para elegir.
     */
    object Categories : Routes("categoriesView")

    // Ruta para el modo por categoría con un parámetro dinámico
    object CategoryMode : Routes("categoryMode/{categorySelected}") {
        fun createRoute(categorySelected: String): String {
            return "categoryMode/$categorySelected"
        }
    }

    /**
     * Pantalla del Ranking.
     */
    object Ranking : Routes("rankingView")

    /**
     * Pantalla del Perfil del usuario.
     */
    object Profile : Routes("profileScreen")

    /**
     * Pantalla de la configuracion.
     */
    object Settings : Routes("settingsScreen")

    /**
     * Pantalla de la configuracion del administrador.
     */
    object AdminSettings : Routes("adminSettingsScreen")

    /**
     * Pantalla de la configuracion del administrador.
     */
    object AdminMode : Routes("adminModeScreen")

    /**
     * Pantalla información.
     */
    object AboutScreen : Routes("aboutScreen")

    /**
     * Pantalla política y privacidad.
     */
    object PoliticsScreen : Routes("politicsScreen")

    /**
     * Pantalla estado del servidor.
     */
    object ServerStateScreen : Routes("serverStateScreen")

    /**
     * Pantalla de la creación de la pregunta.
     */

    object QuestionTitle : Routes("questionTitleView")

    /**
     * Pantalla de la creación de la pregunta.
     */

    object CorrectAnswer : Routes("correctAnswerView")

    /**
     * Pantalla de la creación de la pregunta.
     */

    object IncorrectAnswer : Routes("incorrectAnswerView")

    /**
     * Pantalla de la Categoría elegida o modo normal de juego.
     */

    object Category : Routes("categoryView")


    /**
     * Pantalla de las preguntas del modo normal de juego.
     */

    object NormalMode : Routes("normalModeView")

    /**
     * Pantalla de las preguntas del modo supervivencia de juego.
     */

    object SurvivalMode : Routes("survivalModeView")

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