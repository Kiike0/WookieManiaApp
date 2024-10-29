package com.example.wookiemaniaapp.ui.components.creation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.viewmodels.QuestionViewModel

/**
 * This composable was generated from the UI Package 'pregunta_titulo'.
 * Generated code; do not edit directly
 */
@Composable
fun AddingTittleComposable(
    newQuestionVM : QuestionViewModel
) {

    Column{
        DropDownMenu(newQuestionVM = newQuestionVM)
        QuestionTextField(newQuestionVM = newQuestionVM)
    }

}

@Composable
fun DropDownMenu(
    newQuestionVM: QuestionViewModel
) {
    var expanded by remember { mutableStateOf(false) }
    val suggestions = listOf("Acción", "Terror", "Comedia", "Fantasía")
    var selectedText by remember { mutableStateOf(newQuestionVM.category) }

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    Column(Modifier.padding(20.dp)) {
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(56.dp) // Altura similar a la de un TextField
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(BorderStroke(5.dp, Color.Black), shape = MaterialTheme.shapes.medium)
                .clickable { expanded = !expanded }
                .padding(horizontal = 16.dp, vertical = 12.dp) // Padding interno
        ) {
            Text(
                text = selectedText.ifEmpty { "Elige categoría" },
                color = if (selectedText.isEmpty()) Color.Gray else Color.Black
            )
            Icon(
                imageVector = icon,
                contentDescription = "Icono del menú desplegable",
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(350.dp)
        ) {
            suggestions.forEach { label ->
                DropdownMenuItem(
                    text = { Text(text = label) },
                    onClick = {
                        selectedText = label
                        newQuestionVM.createSelectedCategory(label) // Llama al método para actualizar el ViewModel
                        expanded = false
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionTextField(
    newQuestionVM : QuestionViewModel
) {
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = newQuestionVM.title,
            onValueChange = { newQuestionVM.createTitle(it) },
            modifier = Modifier
                .width(350.dp)
                .height(120.dp) // Controla la altura total del campo
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro personalizado
                    shape = MaterialTheme.shapes.medium
                ),
            placeholder = { Text("Aquí debes poner el título de la pregunta que quieres añadir") }, // Texto de marcador
            label = { Text("Título de la pregunta") },
            maxLines = 3, // Permitir hasta 3 líneas de texto
            minLines = 3, // Hacer que el tamaño mínimo sea de 3 líneas
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )
    }

}
