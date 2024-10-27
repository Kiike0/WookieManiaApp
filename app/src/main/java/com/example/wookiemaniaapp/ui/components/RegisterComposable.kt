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
import com.example.wookiemaniaapp.loginprototipo.firaSans
import com.example.wookiemaniaapp.ui.theme.ColorApp

/**
 * This composable was generated from the UI Package 'login_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun RegisterComposable(
    modifier: Modifier = Modifier,
    volverAInicioBoton : () -> Unit = {},
    registrarseBoton: () -> Unit = {}
) {
    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Centra horizontalmente el contenido
        verticalArrangement = Arrangement.Center){
        OutlinedTextField1Custom()
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField2Custom()
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField3Custom()
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField4Custom()
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField5Custom()
        Spacer(modifier = Modifier.height(40.dp))
        Row {
            BotonVolverR(
                backToStartButton = volverAInicioBoton
            )
            Spacer(modifier = Modifier.width(20.dp))
            BotonAccederR(
                accessButton = registrarseBoton
            )

        }

    }

}
@Composable
fun BotonAccederR(
    accessButton: () -> Unit
) {
    Button(
        onClick = { /* Acción del botón */ },
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
fun OutlinedTextField1Custom() {
    var userInput by remember { mutableStateOf("") }
    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
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
fun OutlinedTextField2Custom() {
    var userInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
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
fun OutlinedTextField3Custom() {
    var userInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
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
fun OutlinedTextField4Custom() {
    var userInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
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
fun OutlinedTextField5Custom() {
    var userInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
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