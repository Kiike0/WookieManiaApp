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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.cabecera.rubikWetPaint
import com.google.relay.compose.ColumnScopeInstance.boxAlign
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'cabecera'.
 * Generated code; do not edit directly
 */
@Composable
fun HeadBoard2(
    modifier: Modifier = Modifier,
    starButton: () -> Unit = {}
) {
    TopLevelHeadBoard2(modifier = modifier) {
        BoxBarGameComposableHeadBoard2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        WookiemaniaComposableHeadBoard2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-78.0).dp,
                    y = (-31.0).dp
                )
            )
        )
        StarButtonComposableHeadBoard2(
            starButton = starButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 157.0.dp,
                    y = (-35.0).dp
                )
            )
        ) {
            BoxStarVectComposableHeadBoard2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            StarVectorComposableHeadBoard2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }

    }
}

@Composable
fun BoxBarGameComposableHeadBoard2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_box_bar_game),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(184.0.dp).boxAlign(
            alignment = Alignment.Center,
            offset = DpOffset(
                x = 0.0.dp,
                y = (-90.0).dp
            )
        )
    )
}
@Composable
fun WookiemaniaComposableHeadBoard2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 22.0.sp,
        fontFamily = rubikWetPaint,
        color = Color.Black,
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(182.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun BoxStarVectComposableHeadBoard2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun StarVectorComposableHeadBoard2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_star_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.139606475830078.dp,
                top = 2.809206008911133.dp,
                end = 2.1405410766601562.dp,
                bottom = 2.577146530151367.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun StarButtonComposableHeadBoard2(
    starButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = starButton).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun TopLevelHeadBoard2(
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
