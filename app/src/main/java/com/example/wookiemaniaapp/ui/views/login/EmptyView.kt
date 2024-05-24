package com.example.wookiemaniaapp.ui.views.login

/*
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
            navController.navigate(Routes.HomeScreen.route)
        }else{
            navController.navigate(Routes.StartGameScreen.route)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.backgroundinicio),
            contentDescription = "Fondo de inicio",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        CustomizedBiggerTextBold(
            customizedText = "Cargando ...",
            modifier = Modifier.align(Alignment.BottomStart)
        )

    }

}

 */