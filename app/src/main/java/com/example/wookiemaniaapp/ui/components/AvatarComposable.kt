package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    )
}