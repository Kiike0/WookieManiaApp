package com.example.wookiemaniaapp.ui.views.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.IconsImage
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * Función composable que representa la pantalla de configuración del usuario.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun SettingsScreen(
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

        Spacer(modifier = Modifier.height(45.dp))

        // Aquí se aseguran de que cada ClickableSettings esté centrado
        ClickableSettings(
            iconResId = R.drawable.editicon,
            text = "Editar Usuario",
            onClick = {}
        )

        Spacer(modifier = Modifier.height(35.dp))

        ClickableSettings(
            iconResId = R.drawable.addicon,
            text = "Añadir amigo",
            onClick = {}
        )

        Spacer(modifier = Modifier.height(35.dp))

        ClickableSettings(
            iconResId = R.drawable.infoicon,
            text = "Información",
            onClick = {navController.navigate(Routes.AboutScreen.route)}
        )

        Spacer(modifier = Modifier.height(35.dp))

        ClickableSettings(
            iconResId = R.drawable.serverstateicon,
            text = "Estado servidor",
            onClick = {navController.navigate(Routes.ServerStateScreen.route)}
        )

        Spacer(modifier = Modifier.height(35.dp))

        ClickableSettings(
            iconResId = R.drawable.politicsicon,
            text = "Política y privacidad",
            onClick = {navController.navigate(Routes.PoliticsScreen.route)}
        )

        Spacer(modifier = Modifier.height(35.dp))

        ClickableSettings(
            iconResId = R.drawable.logouticon,
            text = "Cerrar sesión",
            onClick = {
                currentUserViewModel.signOut()
                navController.navigate(Routes.FirstScreen.route)}
        )
    }
}
@Composable
fun ClickableSettings(
    iconResId: Int, // ID del recurso de la imagen
    text: String,   // Texto a mostrar
    onClick: () -> Unit // Acción del botón
) {
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp)
            .border(3.dp, Color.Black, RoundedCornerShape(8.dp))
            .background(Color.White, RoundedCornerShape(8.dp))
            .clickable(onClick = onClick) // Hace que la Box sea un botón
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth() // Ocupa todo el ancho de la Box
                .height(60.dp)
                .padding(start = 50.dp), // Asegúrate de que el Row tenga la misma altura que la Box
            verticalAlignment = Alignment.CenterVertically, // Alinea verticalmente al centro
            horizontalArrangement = Arrangement.Start // Cambiado a 'Start' para alinear al inicio
        ) {
            // Imagen
            IconsImage(
                painter = painterResource(id = iconResId), // Usa el recurso pasado
                size = 40
            )

            Spacer(modifier = Modifier.width(15.dp)) // Espacio entre la imagen y el texto

            // Texto
            Text(
                text = text, // Usa el texto pasado
                modifier = Modifier.padding(end = 10.dp), // Padding a la derecha
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}