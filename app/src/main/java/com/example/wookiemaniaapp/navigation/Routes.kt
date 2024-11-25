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

    /**
     * Pantalla del Perfil del usuario.
     */
    object Profile : Routes("profileScreen")


    //----------------------- Configuración --------------------//

    /**
     * Pantalla de la configuracion.
     */
    object Settings : Routes("settingsScreen")

    /**
     * Pantalla de la configuracion.
     */
    object UserEdit : Routes("userEditScreen")

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


    //----------------------- Creación de preguntas --------------------//

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



}