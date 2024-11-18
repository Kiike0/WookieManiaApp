package com.example.wookiemaniaapp.ui.views.login


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CustomizedBiggerTextBold
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.google.firebase.auth.FirebaseAuth


/**
 * Vista composable vacía que sirve como punto de entrada o pantalla inicial,
 * con el propósito de mostrar una pantalla de carga mientras accede a la base de datos.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun EmptyView(
    navController: NavController
){

    LaunchedEffect(Unit){
        if (!FirebaseAuth.getInstance().currentUser?.email.isNullOrEmpty()){
            navController.navigate(Routes.Home.route)
        }else{
            navController.navigate(Routes.FirstScreen.route)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize().background(ColorApp),
        contentAlignment = Alignment.Center
    ) {

        CustomizedBiggerTextBold(
            customizedText = "Cargando ...",
            modifier = Modifier.align(Alignment.BottomStart)
        )

    }

}

