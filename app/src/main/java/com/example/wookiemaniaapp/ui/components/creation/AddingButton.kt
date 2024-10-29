package com.example.wookiemaniaapp.ui.components.creation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
 * Esta es la función que representa el icono de agregar pregunta
 */
@Composable
fun AddingButtonComposable(
    modifier: Modifier = Modifier,
    addButton: () -> Unit = {}
) {
    TopLevelToAddComposable(modifier = modifier) {
        BoxToAddComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 16.0.dp
                )
            )
        )
        AddIconToAddComposable(
            addButton = addButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-1.0).dp,
                    y = 45.0.dp
                )
            )
        ) {
            VectorToAddComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}


@Composable
fun BoxToAddComposable(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.agregar_nav_box_add),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(392.0.dp).requiredHeight(244.0.dp)
    )
}

@Composable
fun VectorToAddComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.agregar_nav_vector_add),
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
fun AddIconToAddComposable(
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
fun TopLevelToAddComposable(
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