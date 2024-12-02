package com.example.wookiemaniaapp.ui.components


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.RelayText

/**
 * Funciones customizadas de como se muestran diferentes textos en la aplicación
 */

@Composable
fun CustomizedCategoryText(
    modifier: Modifier = Modifier,
    contenido: String
) {
    RelayText(
        content = contenido,
        fontSize = 18.0.sp,
        fontFamily = firaSans,
        color = Color(red = 0, green = 0, blue = 0, alpha = 255),
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(top=20.dp).boxAlign(
            alignment = Alignment.Center,
            offset = DpOffset(
                x = (-20).dp,
                y = 0.dp
            )
        )
    )
}

@Composable
fun CustomizedTypeText(
    modifier: Modifier = Modifier,
    contenido: String
) {
    RelayText(
        content = contenido,
        fontSize = 18.0.sp,
        fontFamily = firaSans,
        color = Color(red = 0, green = 0, blue = 0, alpha = 255),
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(top=20.dp).boxAlign(
            alignment = Alignment.Center,
            offset = DpOffset(
                x = 20.dp,
                y = 0.dp
            )
        )
    )
}

@Composable
fun CustomizedBiggerTextBold(
    customizedText: String,
    modifier: Modifier
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color.Black,
            fontSize = 20.0.sp,
            fontFamily = firaSans,
            fontWeight = FontWeight.Bold // Esta línea establece el texto en negrita
        ),
        modifier = modifier
    )
}

@Composable
fun CustomizedSimpleText(
    customizedText: String
) {
    Text(
        text = customizedText,
        fontSize = 14.0.sp,
        fontFamily = firaSans,
        color = Color.Black
    )
}

@Composable
fun CustomizedSimpleTextBlack(
    customizedText: String
) {
    Text(
        text = customizedText,
        fontSize = 14.0.sp,
        fontFamily = firaSans,
        color = Color.Black
    )
}

@Composable
fun CustomizedText(
    customizedText: String
) {
    Text(
        text = customizedText,
        style = TextStyle(
            color = Color(
                alpha = 255,
                red = 151,
                green = 168,
                blue = 183
            ),
            fontSize = 14.0.sp,
            fontFamily = firaSans
        )
    )
}


