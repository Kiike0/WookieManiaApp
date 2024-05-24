package com.example.wookiemaniaapp.categoriaelegida

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
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
fun CategoriaElegida(
    modifier: Modifier = Modifier,
    startButton: () -> Unit = {},
    closeButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        CategoryComp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Rectangle51(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Rectangle50(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Aventura(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        StartButton(
            startButton = startButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            Ellipse2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Start(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Close(
            closeButton = closeButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 358, heightDp = 490)
@Composable
private fun CategoriaElegidaPreview() {
    MaterialTheme {
        RelayContainer {
            CategoriaElegida(
                startButton = {},
                closeButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle51(modifier: Modifier = Modifier) {
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
fun Rectangle50(modifier: Modifier = Modifier) {
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
fun Aventura(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aventura",
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
fun CategoryComp(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 362.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
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
fun Start(modifier: Modifier = Modifier) {
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
fun StartButton(
    startButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 96.0.dp,
                top = 213.0.dp,
                end = 84.0.dp,
                bottom = 135.0.dp
            )
        ).tappable(onTap = startButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.categoria_elegida_vector),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 3.75.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Close(
    closeButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 155.0.dp,
                top = 430.0.dp,
                end = 143.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = closeButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
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
