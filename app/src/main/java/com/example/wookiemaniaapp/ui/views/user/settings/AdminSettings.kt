package com.example.wookiemaniaapp.ui.views.user.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla de configuración del administrador.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun AdminSettingsScreen(
    navController: NavHostController,
    currentUserViewModel: UserViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        horizontalAlignment = Alignment.CenterHorizontally // Alineación horizontal al centro
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 50.dp, start = 25.dp)
                    .clickable(onClick = {
                        navController.navigate(Routes.Profile.route)
                    })
            ) {
                Image(
                    painter = painterResource(id = R.drawable.closeicon),
                    contentDescription = "Settings"
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Aquí se aseguran de que cada ClickableSettings esté centrado
        ClickableSettings(
            iconResId = R.drawable.adminquestionslogo,
            text = "Ver preguntas",
            onClick = {navController.navigate(Routes.AdminMode.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Aquí se aseguran de que cada ClickableSettings esté centrado
        ClickableSettings(
            iconResId = R.drawable.adminquestionslogo,
            text = "Añadir preguntas",
            onClick = {navController.navigate(Routes.AddingQuiz.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Aquí se aseguran de que cada ClickableSettings esté centrado
        ClickableSettings(
            iconResId = R.drawable.editicon,
            text = "Editar Usuario",
            onClick = {navController.navigate(Routes.UserEdit.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        ClickableSettings(
            iconResId = R.drawable.infoicon,
            text = "Información",
            onClick = {navController.navigate(Routes.AboutScreen.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        ClickableSettings(
            iconResId = R.drawable.serverstateicon,
            text = "Estado servidor",
            onClick = {navController.navigate(Routes.ServerStateScreen.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        ClickableSettings(
            iconResId = R.drawable.politicsicon,
            text = "Política y privacidad",
            onClick = {navController.navigate(Routes.PoliticsScreen.route)}
        )

        Spacer(modifier = Modifier.height(20.dp))

        ClickableSettings(
            iconResId = R.drawable.logouticon,
            text = "Cerrar sesión",
            onClick = {
                currentUserViewModel.signOut()
                navController.navigate(Routes.FirstScreen.route)}
        )
    }
}