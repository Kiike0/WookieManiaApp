package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CorrectAnswerField(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = userInput,
            onValueChange = { userInput = it },
            modifier = Modifier
                .width(350.dp)
                .height(70.dp) // Controla la altura total del campo
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro personalizado
                    shape = MaterialTheme.shapes.medium
                ),
            placeholder = { Text("Aquí debes poner la respuesta correcta") }, // Texto de marcador
            label = { Text("Respuesta correcta") },
            maxLines = 1, // Permitir hasta 3 líneas de texto
            minLines = 1, // Hacer que el tamaño mínimo sea de 3 líneas
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )
    }

}