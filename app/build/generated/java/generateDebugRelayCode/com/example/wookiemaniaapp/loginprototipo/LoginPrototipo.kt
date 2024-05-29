package com.example.wookiemaniaapp.loginprototipo

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
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
 * This composable was generated from the UI Package 'login_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginPrototipo(
    modifier: Modifier = Modifier,
    backToStartButton: () -> Unit = {},
    accessButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BotonAtras(
            backToStartButton = backToStartButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxAtras(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            VolverText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 1.0.dp
                    )
                )
            )
        }
        Wookiemania(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = -94.5.dp
                )
            )
        )
        TextField1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -18.5.dp
                )
            )
        )
        TextField2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 36.5.dp
                )
            )
        )
        BotonAcceder(
            accessButton = accessButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BotonBoxAcc(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Acceder(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 1.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 299, heightDp = 242)
@Composable
private fun LoginPrototipoPreview() {
    MaterialTheme {
        RelayContainer {
            LoginPrototipo(
                backToStartButton = {},
                accessButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxAtras(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_prototipo_box_atras),
        modifier = modifier.requiredWidth(134.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun VolverText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Volver",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(133.0.dp)
    )
}

@Composable
fun BotonAtras(
    backToStartButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 194.0.dp,
                end = 165.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = backToStartButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Wookiemania(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 36.0.sp,
        fontFamily = rubikWetPaint,
        height = 1.2000000762939453.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(279.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun TextField1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_prototipo_text_field1),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun TextField2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_prototipo_text_field2),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun BotonBoxAcc(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_prototipo_boton_box_acc),
        modifier = modifier.requiredWidth(134.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Acceder(modifier: Modifier = Modifier) {
    RelayText(
        content = "Acceder",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 214,
            blue = 0
        ),
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(134.0.dp)
    )
}

@Composable
fun BotonAcceder(
    accessButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 165.0.dp,
                top = 194.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = accessButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
