package com.example.wookiemaniaapp.ui.views.user.settings

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.wookiemaniaapp.cabeceratipo3.CabeceraTipo3
import com.example.wookiemaniaapp.cabeceratipo3.firaSans
import com.example.wookiemaniaapp.model.UserModel
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.AvatarViewModel
import com.example.wookiemaniaapp.viewmodels.UserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserEditScreen(
    navController: NavHostController,
    userViewModel: UserViewModel,
    avatarViewModel: AvatarViewModel
) {
    val context = LocalContext.current
    val imageUri = remember { mutableStateOf<Uri?>(null) }
    val userImage = remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        userViewModel.getCurrentUserData()
    }

    val userId = userViewModel.userId

    // Launcher para seleccionar imagen de la galería
    val galleryLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let {
            avatarViewModel.uploadImageToStorage(
                it,
                userId,
                onSuccess = { imageUrl ->
                    userImage.value = imageUrl
                    Toast.makeText(context, "Imagen subida exitosamente", Toast.LENGTH_SHORT).show()
                },
                onFailure = { exception ->
                    Toast.makeText(context, "Error al subir imagen: ${exception.message}", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }

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
            // Cabecera
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(color = Color.Transparent)
                    .padding(top = 60.dp)
            ) {
                CabeceraTipo3(
                    modifier = Modifier,
                    screenText = "Edición de usuario",
                    backButton = {
                        if (userViewModel.currentUserEmail == "adminprueba@gmail.com") {
                            navController.navigate(Routes.AdminSettings.route)
                        } else {
                            navController.navigate(Routes.Settings.route)
                        }
                    }
                )
            }

            Spacer(modifier = Modifier.height(120.dp))

            // Imagen del avatar
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                userImage.value?.let {
                    Image(
                        painter = rememberImagePainter(it),
                        contentDescription = "User Avatar",
                        modifier = Modifier.fillMaxSize()
                    )
                } ?: Text(text = "No Image")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botón para seleccionar imagen
            Button(
                onClick = { galleryLauncher.launch("image/*") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)) {
                Text(
                    text = "Seleccionar imagen",
                    color = Color.White,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(25.dp))

            // Campos de texto para editar información del usuario
            OutlinedTextField(
                value = userViewModel.name,
                onValueChange = { userViewModel.changeName(it) },
                modifier = Modifier
                    .width(350.dp)
                    .height(70.dp)
                    .background(Color.White, shape = MaterialTheme.shapes.medium)
                    .border(
                        BorderStroke(5.dp, Color.Black),
                        shape = MaterialTheme.shapes.medium
                    ),
                placeholder = { Text("Nuevo nombre") },
                label = { Text("Nombre") },
                maxLines = 1,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = userViewModel.surname,
                onValueChange = { userViewModel.changeSurname(it) },
                modifier = Modifier
                    .width(350.dp)
                    .height(70.dp)
                    .background(Color.White, shape = MaterialTheme.shapes.medium)
                    .border(
                        BorderStroke(5.dp, Color.Black),
                        shape = MaterialTheme.shapes.medium
                    ),
                placeholder = { Text("Nuevo apellido") },
                label = { Text("Apellidos") },
                maxLines = 1,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Botón para guardar cambios
            Button(
                onClick = {
                    // Implementar lógica para guardar cambios
                    userViewModel.updateUser(
                        name = userViewModel.name,
                        surname = userViewModel.surname
                    ) {
                        Toast.makeText(context, "Usuario actualizado exitosamente", Toast.LENGTH_SHORT).show()
                        navController.navigate(Routes.Profile.route)
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                modifier = Modifier
                    .height(50.dp)
                    .width(100.dp)
            ) {
                Text(
                    text = "Guardar",
                    color = Color.White,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}





