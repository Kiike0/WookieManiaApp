package com.example.wookiemaniaapp.ui.views.login

/*

/**
 * Función composable que representa la pantalla principal para loguearse.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param accessViewModel El ViewModel responsable de gestionar la lógica del usuario.
 */
@Composable
fun Login(
    navController: NavHostController,
    accessViewModel: UserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackGroundApp),
        contentAlignment = Alignment.Center
    ) {
        LoginComposable(
            modifier = Modifier,
            onAccessButton = {
                accessViewModel.login {
                    // Agrega un registro para confirmar que onSuccess se está llamando correctamente
                    Log.d("LOGIN_SUCCESS", "Inicio de sesión exitoso")
                    navController.navigate(Routes.HomeScreen.route)
                }
            },
            onCreateButton = { navController.navigate(Routes.RegisterScreen.route) },
            accessUserViewModel = accessViewModel
        )
        if (accessViewModel.showAlert) {
            Alert(title = "Alerta",
                message = "Usuario y/o contrasena incorrectos",
                confirmText = "Aceptar",
                onConfirmClick = { accessViewModel.closeAlert() },
                onDismissClick = { } )
        }

    }
}

 */