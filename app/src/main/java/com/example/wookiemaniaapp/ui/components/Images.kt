package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.avatarprueba),
        contentDescription = "Imagen circular",
        modifier = Modifier
            .size(100.dp) // Define el tamaño de la imagen
            .clip(CircleShape) // Aplica la forma circular
            .border(3.dp, Color.Black, CircleShape)
    )
}

@Composable
fun RoundedCornerSquareImage(
    painter: Painter, // Pasa el recurso de imagen desde el llamador de la función
    size: Int = 100, // Tamaño de la imagen
    cornerRadius: Int = 16 // Tamaño del redondeo de las esquinas
) {
    Image(
        painter = painter,
        contentDescription = "Imagen cuadrada con esquinas redondeadas",
        modifier = Modifier
            .size(size.dp) // Define el tamaño cuadrado
            .clip(RoundedCornerShape(cornerRadius.dp)) // Redondea las esquinas
            .border(2.dp, Color.Black, RoundedCornerShape(cornerRadius.dp)) // Añade un borde negro con esquinas redondeadas
    )
}

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