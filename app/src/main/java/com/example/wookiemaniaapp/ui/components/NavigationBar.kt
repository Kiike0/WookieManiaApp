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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Es la función que representa la barra de navegación:
 * - Pantalla home
 * - Pantalla agregar pregunta
 * - Pantalla usuario
 */
@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    homeButton: () -> Unit = {},
    profileButton: () -> Unit = {},
    addButton: () -> Unit = {},
    profileImagePainter: Painter
) {
    BotLevel(modifier = modifier) {
        NavComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        HomeButtonComposable(
            homeButton = homeButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-126.5).dp,
                    y = (-12.5).dp
                )
            )
        ) {
            VectorHome2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorHome1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        ProfileButtonComposable(
            profileButton = profileButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 122.0.dp,
                    y = (-11.0).dp
                )
            ),
            profileImagePainter = profileImagePainter
        )
        AddButtonComposable(
            addButton = addButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-1.0).dp,
                    y = (-11.0).dp
                )
            )
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun NavComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_nav),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun VectorHome2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_vector_home2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.078338623046875.dp,
                top = 30.301513671875.dp,
                end = 39.026246547698975.dp,
                bottom = 21.59614109992981.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorHome1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_vector_home1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.1539306640625.dp,
                top = 3.4375.dp,
                end = 5.149120330810547.dp,
                bottom = 1.7264480590820312.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HomeButtonComposable(
    homeButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = homeButton).requiredWidth(55.0.dp).requiredHeight(55.0.dp)
    )
}

@Composable
fun ProfileButtonComposable(
    profileButton: () -> Unit,
    modifier: Modifier = Modifier,
    profileImagePainter: Painter
) {
    RelayImage(
        image = profileImagePainter,
        radius = 100.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        strokeWidth = 4.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = profileButton).requiredWidth(50.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.barra_navegacion_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.0.dp,
                top = 5.0.dp,
                end = 4.999996185302734.dp,
                bottom = 4.999996185302734.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AddButtonComposable(
    addButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = addButton).requiredWidth(60.0.dp).requiredHeight(60.0.dp)
    )
}

@Composable
fun BotLevel(
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