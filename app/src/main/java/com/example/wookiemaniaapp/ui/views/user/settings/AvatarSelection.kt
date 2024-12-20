package com.example.wookiemaniaapp.ui.views.user.settings

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.cabeceratipo3.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.painters.avatarUrlResources
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.AvatarViewModel

/**
 * Función composable que representa la pantalla de la selección de avatares.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param avatarViewModel El controlador de avatares del viewmodel utilizado para gestionar los avatares de los usuarios.
 */
@Composable
fun AvatarSelectionScreen(
    navController: NavHostController,
    avatarViewModel: AvatarViewModel
) {
    val context = LocalContext.current  // Obtiene el contexto actual para mostrar toasts y otras acciones

    // Estructura de la pantalla
    Column(
        modifier = Modifier
            .fillMaxSize()               // Llena todo el tamaño de la pantalla
            .background(ColorApp),        // Establece el color de fondo
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 25.dp, start = 25.dp)
                    .clickable(onClick = {
                        navController.navigate(Routes.Profile.route)
                    })
            ) {
                Image(
                    painter = painterResource(id = R.drawable.closeicon),
                    contentDescription = "Settings"
                )
            }

            // Título de la pantalla
            Text(
                text = "Selecciona un Avatar",
                fontFamily = firaSans,       // Familia de fuentes personalizada
                fontWeight = FontWeight.Bold,// Fuente en negrita
                fontSize = 19.sp,            // Tamaño de la fuente
                color = Color.Black,
                modifier = Modifier.padding(start = 60.dp, top = 25.dp) // Padding debajo del título
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        // Lista que muestra los avatares en filas de dos elementos
        // Se usa Lazycolumn por si se quieren añadir más avatares
        LazyColumn {
            items(avatarUrlResources.chunked(2)) { rowItems ->   // Divide la lista de URLs en listas de dos elementos
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),  // Padding vertical alrededor de cada fila
                    horizontalArrangement = Arrangement.SpaceAround // Distribuye espacio uniformemente
                ) {
                    rowItems.forEach { avatarUrl ->  // Para cada URL de avatar en la fila
                        Box(
                            modifier = Modifier
                                .padding(8.dp)      // Padding alrededor de cada avatar
                                .clickable {
                                    avatarViewModel.updateAvatarUrl(avatarUrl) {
                                        // Muestra un toast cuando se actualice el avatar
                                        Toast.makeText(context, "Avatar actualizado exitosamente", Toast.LENGTH_SHORT).show()
                                        // Navega de vuelta a la pantalla de edición de usuario
                                        navController.navigate(Routes.UserEdit.route)
                                    }
                                }
                        ) {
                            // Muestra la imagen del avatar
                            Image(
                                painter = rememberImagePainter(avatarUrl),
                                contentDescription = "Avatar Image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)  // Tamaño de la imagen
                                    .clip(CircleShape) // Hace la imagen circular
                                    .border(BorderStroke(2.dp, Color.Black), CircleShape) // Añade borde
                                    .background(Color.Gray) // Fondo gris mientras se carga
                            )
                        }
                    }
                }
            }
        }
    }
}


