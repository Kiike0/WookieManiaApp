package com.example.wookiemaniaapp.ui.views.gamesmodes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.cabeceratipo2.CabeceraTipo2
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.components.CategoryTypeComposable
import com.example.wookiemaniaapp.ui.components.CustomizedCategoryText
import com.example.wookiemaniaapp.ui.components.NavigationBar
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * Función composable que representa la pantalla Home del juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 */
@Composable
fun Categories(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorApp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 30.dp)
            ) {
                CabeceraTipo2(modifier = Modifier)
            }
            Spacer(modifier = Modifier.height(32.dp))



            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalArrangement = Arrangement.spacedBy((-50).dp)
            ) {
                item {
                    CustomizedCategoryText(contenido = "Categorías")
                }
                item {

                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Aventura"))},
                        contenido = "Aventura"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Terror"))},
                        contenido = "Terror"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Ciencia Ficción"))},
                        contenido = "Ciencia Ficción"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Drama"))},
                        contenido = "Drama"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Acción"))},
                        contenido = "Acción"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Fantasía"))},
                        contenido = "Fantasía"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Comedia"))},
                        contenido = "Comedia"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Animación"))},
                        contenido = "Animación"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Historia"))},
                        contenido = "Historia"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Suspense"))},
                        contenido = "Suspense"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Romance"))},
                        contenido = "Romance"
                    )
                }
                item {
                    CategoryTypeComposable(
                        modifier = Modifier.size(100.dp, 125.dp),
                        categoryButton = {navController.navigate(Routes.CategoryMode.createRoute("Western"))},
                        contenido = "Western"
                    )
                }
                item {
                    Spacer(modifier = Modifier.height(142.dp))
                }
                item {
                    Spacer(modifier = Modifier.height(142.dp))
                }

            }


        }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(142.dp)
                    .background(color = ColorApp)
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 10.dp)
            ) {
                NavigationBar(
                    modifier = Modifier,
                    homeButton = {navController.navigate(Routes.Home.route)},
                    profileButton= {navController.navigate(Routes.Profile.route)},
                    addButton = {navController.navigate(Routes.QuestionTitle.route)}
                )

            }





    }

}