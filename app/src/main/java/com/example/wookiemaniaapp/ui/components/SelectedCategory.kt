package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.categoriaelegida.firaSans
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'categoria_elegida'.
 * Generated code; do not edit directly
 */
@Composable
fun CategoriaElegidaS(
    modifier: Modifier = Modifier,
    startButton: () -> Unit = {},
    closeButton: () -> Unit = {},
    category: String
) {
    TopLevelS(modifier = modifier) {
        CategoryCompS(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -181.0.dp
                )
            )
        ) {
            Rectangle51S(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle50S(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Categorical(
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f),
                category = category
            )
        }
        StartButtonS(
            startButton = startButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 6.0.dp,
                    y = 39.0.dp
                )
            )
        ) {
            Ellipse2S(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            StartS(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        CloseS(
            closeButton = closeButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 6.0.dp,
                    y = 215.0.dp
                )
            )
        ) {
            VectorS(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle51S(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.categoria_elegida_rectangle_51),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 48.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle50S(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.categoria_elegida_rectangle_50),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 50.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Categorical(
    modifier: Modifier = Modifier,
    category: String = ""
) {
    RelayText(
        content = category,
        fontSize = 30.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.0.dp,
                top = 19.0.dp,
                end = 14.0.dp,
                bottom = 73.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CategoryCompS(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun Ellipse2S(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.categoria_elegida_ellipse_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 18.0.dp,
                top = 0.0.dp,
                end = 18.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun StartS(modifier: Modifier = Modifier) {
    RelayText(
        content = "Start",
        fontSize = 36.0.sp,
        fontFamily = firaSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000211927626.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 46.0.dp,
                end = 0.0.dp,
                bottom = 38.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun StartButtonS(
    startButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = startButton).requiredWidth(178.0.dp).requiredHeight(142.0.dp)
    )
}

@Composable
fun VectorS(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.categoria_elegida_vector),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 3.75.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CloseS(
    closeButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = closeButton).requiredWidth(60.0.dp).requiredHeight(60.0.dp)
    )
}

@Composable
fun TopLevelS(
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