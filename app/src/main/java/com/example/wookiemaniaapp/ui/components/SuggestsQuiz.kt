package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R

@Composable
fun SuggestsLazyRow(images: List<Int>) { // Usar Int para los recursos de imagen
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(235.dp) // Controla la altura del Box
            .padding(10.dp) // Padding interno
    ) {
        LazyRow(
            modifier = Modifier.fillMaxSize()
        ) {
            images.forEach { imageRes ->
                item {
                    Image(
                        painter = painterResource(id = imageRes), // Usar painterResource para cargar las imágenes
                        contentDescription = null, // No es necesario si es puramente decorativo
                        modifier = Modifier
                            .padding(8.dp) // Espaciado entre las imágenes
                            .fillMaxHeight() // Ajusta la altura a la altura del Box
                            .border(
                                BorderStroke(5.dp, Color.White),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .clip(RoundedCornerShape(12.dp))
                    )
                }
            }
        }
    }
}

@Composable
fun SuggestsQuizComposable(modifier: Modifier = Modifier) {
    val images = listOf(
        R.drawable.imagenprueba1,
        R.drawable.imagenprueba2,
        R.drawable.imagenprueba3
    )
    Column(modifier = Modifier.padding(top = 40.dp)){
        SuggestsLazyRow(images = images)
    }

}