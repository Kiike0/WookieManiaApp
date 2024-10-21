package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize

/**
 * This composable was generated from the UI Package 'pregunta_titulo'.
 * Generated code; do not edit directly
 */
@Composable
fun AddingTittleComposable(modifier: Modifier = Modifier) {

    Column(){
        DropDownMenu()
        QuestionTextField()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownMenu() {

    var expanded by remember { mutableStateOf(false) }
    val suggestions = listOf("Acción", "Terror", "Comedia", "Fantasía")
    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero) }

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown


    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            modifier = Modifier
                .width(350.dp)
                .onGloballyPositioned { coordinates ->
                    //This value is used to assign to the DropDown the same width
                    textfieldSize = coordinates.size.toSize()
                }
                .background(Color.White, shape = MaterialTheme.shapes.medium)
                .border(
                    BorderStroke(5.dp, Color.Black), // Borde negro
                    shape = MaterialTheme.shapes.medium // Puedes ajustar la forma si lo deseas
                ),
            label = { Text("Elige categoría") },
            trailingIcon = {
                Icon(icon,"contentDescription",
                    Modifier.clickable { expanded = !expanded })
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Transparent, // Borde original invisible para que no se vea el antiguo
                focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
            )
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .width(with(LocalDensity.current){textfieldSize.width.toDp()})
        ) {
            suggestions.forEach { label ->
                DropdownMenuItem(
                    text = { Text(text = label) },
                    onClick = {
                        selectedText = label
                        expanded = false
                    }
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionTextField() {
    var userInput by remember { mutableStateOf("") }
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = userInput,
            onValueChange = { userInput = it },
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
