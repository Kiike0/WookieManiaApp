package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.example.wookiemaniaapp.ui.theme.BackGroundAccessBox
import com.google.relay.compose.RelayText

/**
 * Fichero que contiene varios composable de botones personalizados
 */
@Composable
fun CustomizedButton(
    onCreateButton: () -> Unit = {}
) {
    ButtonBlue(
        onCreateButton = onCreateButton
    )

}

@Composable
fun ButtonBlue(
    onCreateButton: () -> Unit
) {
    Button(
        onClick = onCreateButton,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
            .width(130.0.dp)
            .height(58.0.dp)
            .border(
                width = 4.dp,
                color = Color.White,
                shape = RoundedCornerShape(25.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = BackGroundAccessBox
        )
    ) {
        TextButton()
    }
}


@Composable
fun TextButton(modifier: Modifier = Modifier) {
    RelayText(
        content = "Crear",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(red = 255, green = 255, blue = 255, alpha = 255),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun CustomizedButton2(
    onCreateButton: () -> Unit = {}
) {
    ButtonBlue2(
        onCreateButton = onCreateButton
    )

}

@Composable
fun ButtonBlue2(
    onCreateButton: () -> Unit
) {
    Button(
        onClick = onCreateButton,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
            .width(130.0.dp)
            .height(58.0.dp)
            .border(
                width = 4.dp,
                color = Color.Black,
                shape = RoundedCornerShape(25.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White
        )
    ) {
        TextButton2()
    }
}


@Composable
fun TextButton2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Volver",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(red = 0, green = 0, blue = 0, alpha = 255),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}