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
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.loginprototipo.firaSans
import com.example.wookiemaniaapp.loginprototipo.rubikWetPaint
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.example.wookiemaniaapp.viewmodels.UserViewModel
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'login_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginComposable(
    backToStartButton: () -> Unit = {},
    accessButton: () -> Unit = {},
    accessUser: UserViewModel
) {
    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Centra horizontalmente el contenido
        verticalArrangement = Arrangement.Center){
        WookiemaniaCustom(
            modifier = Modifier
            )
        Spacer(modifier = Modifier.height(20.dp))
        TextField1Custom(
            accessUser = accessUser
            )
        Spacer(modifier = Modifier.height(20.dp))
        TextField2Custom(
            accessUser = accessUser
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row {
            BotonVolver(
                backToStartButton = backToStartButton
            )
            Spacer(modifier = Modifier.width(20.dp))
            BotonAcceder(
                accessButton = accessButton
            )

        }

    }

}
@Composable
fun BotonAcceder(
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
        Text(text = "Acceder",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans
        )
    }
}
@Composable
fun BotonVolver(
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

@Composable
fun WookiemaniaCustom(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 36.0.sp,
        fontFamily = rubikWetPaint,
        height = 1.2000000762939453.em,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(279.0.dp)
            .requiredHeight(53.0.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField1Custom(
    accessUser: UserViewModel
) {
    OutlinedTextField(
        value = accessUser.email,
        onValueChange = { accessUser.changeEmail(it) },
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
fun TextField2Custom(
    accessUser: UserViewModel
) {
    OutlinedTextField(
        value = accessUser.password,
        onValueChange = { accessUser.changePassword(it) },
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
