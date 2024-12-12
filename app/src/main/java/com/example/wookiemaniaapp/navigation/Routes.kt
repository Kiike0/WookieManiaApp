package com.example.wookiemaniaapp.navigation

/**
 * Clase sellada que representa las diferentes pantallas de la aplicación.
 *
 * @property route El identificador de la ruta
 */
sealed class Routes(val route: String) {

    /**
     * Pantalla Inicial de la aplicación.
     */
    data object FirstScreen : Routes("firstScreen")

    /**
     * Pantalla vacía.
     */
    data object EmptyScreen : Routes("emptyScreen")

    /**
     * Objeto que representa la pantalla de Inicio de Sesión (Acceso).
     */
    data object Login : Routes("loginScreen")

    /**
     * Objeto que representa la pantalla de Registro de usuario.
     */
    data object Register : Routes("registerScreen")



    /**
     * Pantalla Home de juego.
     */
    data object Home : Routes("homeView")

    /**
     * Pantalla de todas las Categorías para elegir.
     */
    data object Categories : Routes("categoriesView")

    /**
     * Pantalla del Ranking.
     */
    data object Ranking : Routes("rankingView")


    /**
     * Pantalla del Perfil del usuario.
     */
    data object Profile : Routes("profileScreen")


    //----------------------- Modos de juego --------------------//

    /**
     * Pantalla de las preguntas del modo normal de juego.
     */

    data object NormalMode : Routes("normalModeView")

    /**
     * Pantalla de las preguntas del modo supervivencia de juego.
     */

    data object SurvivalMode : Routes("survivalModeView")

    // Ruta para el modo por categoría con un parámetro dinámico
    data object CategoryMode : Routes("categoryMode/{categorySelected}") {
        fun createRoute(categorySelected: String): String {
            return "categoryMode/$categorySelected"
        }
    }

    /**
     * Pantalla de las preguntas del modo quiz de juego.
     */

    data object QuizMode : Routes("quizModeView")





    //----------------------- Configuración --------------------//

    /**
     * Pantalla de la configuracion.
     */
    data object Settings : Routes("settingsScreen")

    /**
     * Pantalla de la configuracion del usuario.
     */
    data object UserEdit : Routes("userEditScreen")

    /**
     * Pantalla de la configuracion del administrador.
     */
    data object AdminSettings : Routes("adminSettingsScreen")

    /**
     * Pantalla de la configuracion del administrador.
     */
    data object AdminMode : Routes("adminModeScreen")

    /**
     * Pantalla de la creación de quizzes.
     */
    data object AddingQuiz : Routes("addingQuizScreen")

    /**
     * Pantalla información.
     */
    data object AboutScreen : Routes("aboutScreen")

    /**
     * Pantalla política y privacidad.
     */
    data object PoliticsScreen : Routes("politicsScreen")

    /**
     * Pantalla estado del servidor.
     */
    data object ServerStateScreen : Routes("serverStateScreen")

    /**
     * Pantalla de la configuracion del avatar.
     */
    data object AvatarSelection : Routes("avatarSelection")

    /**
     * Pantalla de la edicion de preguntas ya mostradas.
     */
    data object EditQuestions : Routes("editQuestions")


    //----------------------- Creación de preguntas --------------------//

    /**
     * Pantalla de la creación de la pregunta.
     */

    data object QuestionTitle : Routes("questionTitleView")

    /**
     * Pantalla de la creación de la pregunta.
     */

    data object CorrectAnswer : Routes("correctAnswerView")

    /**
     * Pantalla de la creación de la pregunta.
     */

    data object IncorrectAnswer : Routes("incorrectAnswerView")



}