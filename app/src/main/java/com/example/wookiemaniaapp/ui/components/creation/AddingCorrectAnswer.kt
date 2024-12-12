package com.example.wookiemaniaapp.ui.components.creation

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel

/**
 * Esta es la función que representa la agregación de la respuesta correcta
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CorrectAnswerField(
    newQuestionVM : QuestionViewModel
) {
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = newQuestionVM.correctAnswer,
            onValueChange = { newQuestionVM.createCorrectAnswer(it) },
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