package com.example.wookiemaniaapp.cabeceratipo2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * This composable was generated from the UI Package 'cabecera_tipo2'.
 * Generated code; do not edit directly
 */
@Composable
fun CabeceraTipo2(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        CajaInterrogantes(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Interrogantes(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Interrogante10(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -4.0.dp,
                        y = -2.0.dp
                    )
                )
            )
            Interrogante9(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 56.5.dp,
                        y = 28.5.dp
                    )
                )
            )
            Interrogante8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 97.0.dp,
                        y = -28.0.dp
                    )
                )
            )
            Interrogante7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 118.5.dp,
                        y = 35.0.dp
                    )
                )
            )
            Interrogante6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -123.0.dp,
                        y = 13.0.dp
                    )
                )
            )
            Interrogante5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = 8.0.dp
                    )
                )
            )
            Interrogante4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -76.0.dp,
                        y = -35.5.dp
                    )
                )
            )
            Interrogante3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -171.5.dp,
                        y = -31.5.dp
                    )
                )
            )
            Interrogante2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -178.0.dp,
                        y = 31.5.dp
                    )
                )
            )
            Interrogante1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -66.0.dp,
                        y = 27.5.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 400, heightDp = 184)
@Composable
private fun CabeceraTipo2Preview() {
    MaterialTheme {
        RelayContainer {
            CabeceraTipo2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun CajaInterrogantes(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_tipo2_caja_interrogantes),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(184.0.dp)
    )
}

@Composable
fun Interrogante10(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(107.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Interrogante9(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(64.0.dp).requiredHeight(67.0.dp)
    )
}

@Composable
fun Interrogante8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(53.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun Interrogante7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Interrogante6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun Interrogante5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(63.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun Interrogante4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(37.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Interrogante3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(37.0.dp)
    )
}

@Composable
fun Interrogante2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(37.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Interrogante1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cabecera_tipo2_interrogante10),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(47.0.dp).requiredHeight(73.0.dp)
    )
}

@Composable
fun Interrogantes(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 34.0.dp,
                end = 6.0.dp,
                bottom = 22.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 13.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
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
