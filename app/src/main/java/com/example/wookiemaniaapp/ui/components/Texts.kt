package com.example.wookiemaniaapp.ui.components


import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.google.relay.compose.BoxScopeInstance.boxAlign
import com.google.relay.compose.RelayText

@Composable
fun CustomizedCateogiesText(
    modifier: Modifier = Modifier,
    contenido: String
) {
    RelayText(
        content = contenido,
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(red = 0, green = 0, blue = 0, alpha = 255),
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(top=20.dp).boxAlign(
            alignment = Alignment.Center,
            offset = DpOffset(
                x = -20.dp,
                y = 0.dp
            )
        )
    )
}