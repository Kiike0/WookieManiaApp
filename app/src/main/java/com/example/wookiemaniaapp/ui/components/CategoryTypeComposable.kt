package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.categorytypecomp.firaSans
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Esta es la función donde aparecen todas las categorías de cine de la app
 */
@Composable
fun CategoryTypeComposable(
    modifier: Modifier = Modifier,
    categoryButton: () -> Unit = {},
    contenido: String
) {
    LevelCategoryTypeComposable(modifier = modifier) {
        Rectangulo2FondoNegroComposable(
            categoryButton = categoryButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Rectangulo1FondoComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 20.036842346191406.dp
                )
            )
        )
        ContentCategoryText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.dp,
                    y = 16.0.dp
                )
            ),
            contenido = contenido
        )
    }
}

@Composable
fun Rectangulo2FondoNegroComposable(
    categoryButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.category_type_comp_rectangulo2fondo_negro),
        modifier = modifier.tappable(onTap = categoryButton)
    )
}

@Composable
fun Rectangulo1FondoComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.category_type_comp_rectangulo1fondo),
        modifier = modifier
    )
}

@Composable
fun ContentCategoryText(
    modifier: Modifier = Modifier,
    contenido: String
    ) {
    RelayText(
        content = contenido,
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 214,
            blue = 0
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier.wrapContentWidth(Alignment.CenterHorizontally)
    )
}

@Composable
fun LevelCategoryTypeComposable(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
