package com.example.wookiemaniaapp.ui.components.creation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
 * Esta es la función que representa la agregación de la respuesta incorrecta
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IncorrectsFields(
    newQuestionVM : QuestionViewModel
) {
    Column(Modifier.padding(20.dp)) {

        OutlinedTextField(
            value = newQuestionVM.incorrectAnswer1,
            onValueChange = { newQuestionVM.createIncorrectAnswer1(it) },
            modifier = Modifier
                .width(350.dp)
                .height(70.dp) // Controla la altura total del campo
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro personalizado
                    shape = MaterialTheme.shapes.medium
                ),
            placeholder = { Text("Aquí debes poner una respuesta incorrecta") }, // Texto de marcador
            label = { Text("Respuesta incorrecta") },
            maxLines = 1,
            minLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = newQuestionVM.incorrectAnswer2,
            onValueChange = { newQuestionVM.createIncorrectAnswer2(it) },
            modifier = Modifier
                .width(350.dp)
                .height(70.dp) // Controla la altura total del campo
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro personalizado
                    shape = MaterialTheme.shapes.medium
                ),
            placeholder = { Text("Aquí debes poner una respuesta incorrecta") }, // Texto de marcador
            label = { Text("Respuesta incorrecta") },
            maxLines = 1,
            minLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = newQuestionVM.incorrectAnswer3,
            onValueChange = { newQuestionVM.createIncorrectAnswer3(it) },
            modifier = Modifier
                .width(350.dp)
                .height(70.dp) // Controla la altura total del campo
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro personalizado
                    shape = MaterialTheme.shapes.medium
                ),
            placeholder = { Text("Aquí debes poner una respuesta incorrecta") }, // Texto de marcador
            label = { Text("Respuesta incorrecta") },
            maxLines = 1,
            minLines = 1,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )

    }

}