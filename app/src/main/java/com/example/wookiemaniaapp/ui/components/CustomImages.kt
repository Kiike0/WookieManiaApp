package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

/**
 * Fichero que contiene la composable de imágenes personalizados
 */
@Composable
fun IconsImage(
    painter: Painter, // Pasa el recurso de imagen desde el llamador de la función
    size: Int = 100 // Tamaño de la imagen
) {
    Image(
        painter = painter,
        contentDescription = "Imagen cuadrada",
        modifier = Modifier.size(size.dp) // Define el tamaño cuadrado
    )
}