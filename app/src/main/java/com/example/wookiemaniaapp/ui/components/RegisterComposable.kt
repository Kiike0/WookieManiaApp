package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.wookiemaniaapp.loginprototipo.firaSans
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel

/**
 * This composable was generated from the UI Package 'login_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun RegisterComposable(
    newUserVM: UserViewModel,
    navController: NavHostController
) {
    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Centra horizontalmente el contenido
        verticalArrangement = Arrangement.Center){
        OutlinedTextField1Custom(newUserVM = newUserVM)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField2Custom(newUserVM = newUserVM)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField3Custom(newUserVM = newUserVM)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField4Custom(newUserVM = newUserVM)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField5Custom(newUserVM = newUserVM)
        Spacer(modifier = Modifier.height(40.dp))
        Row {
            BotonVolverR(
                backToStartButton = {navController.navigate(Routes.FirstScreen.route)}
            )
            Spacer(modifier = Modifier.width(20.dp))
            BotonAccederR(
                accessButton = {newUserVM.createUser{navController.navigate(Routes.Home.route)}}
            )

        }

    }

}
@Composable
fun BotonAccederR(
    accessButton: () -> Unit
) {
    Button(
        onClick = accessButton,
        modifier = Modifier
            .defaultMinSize(minWidth = 150.dp, minHeight = 50.dp),  // Ajusta el tamaño mínimo si es necesario
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,       // Fondo negro
            contentColor = ColorApp       // Texto amarillo
        ),
        border = BorderStroke(4.dp, Color.Black),
        shape = RoundedCornerShape(8.dp)       // Bordes redondeados
    ) {
        Text(text = "Registrarse",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans
        )
    }
}
@Composable
fun BotonVolverR(
    backToStartButton: () -> Unit
) {
    Button(
        onClick = backToStartButton,
        modifier = Modifier
            .defaultMinSize(minWidth = 150.dp, minHeight = 50.dp),  // Ajusta el tamaño mínimo si es necesario
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,  // Fondo transparente
            contentColor = Color.Black           // Color del texto
        ),
        border = BorderStroke(4.dp, Color.Black),  // Borde negro
        shape = RoundedCornerShape(8.dp)           // Bordes redondeados
    ) {
        Text(text = "Volver",
            fontSize = 20.sp,               // Tamaño de fuente más grande
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField1Custom(
    newUserVM: UserViewModel
) {
    OutlinedTextField(
        value = newUserVM.name,
        onValueChange = { newUserVM.changeName(it) },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa tu nombre") }, // Texto de marcador
        label = { Text("Nombre") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField2Custom(
    newUserVM: UserViewModel
) {
    OutlinedTextField(
        value = newUserVM.surname,
        onValueChange = { newUserVM.changeSurname(it) },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa tus apellidos") }, // Texto de marcador
        label = { Text("Apellidos") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField3Custom(
    newUserVM: UserViewModel
) {
    OutlinedTextField(
        value = newUserVM.nickName,
        onValueChange = { newUserVM.changeUserName(it) },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa tu nombre de usuario") }, // Texto de marcador
        label = { Text("Nombre de usuario") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField4Custom(
    newUserVM: UserViewModel
) {
    OutlinedTextField(
        value = newUserVM.email,
        onValueChange = { newUserVM.changeEmail(it) },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa un email válido") }, // Texto de marcador
        label = { Text("Email") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField5Custom(
    newUserVM: UserViewModel
) {
    OutlinedTextField(
        value = newUserVM.password,
        onValueChange = { newUserVM.changePassword(it) },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa la contraseña correctamente") }, // Texto de marcador
        label = { Text("Contraseña") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}