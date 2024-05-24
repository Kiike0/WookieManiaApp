package com.example.wookiemaniaapp.startgame

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
 * This composable was generated from the UI Package 'start_game'.
 * Generated code; do not edit directly
 */
@Composable
fun StartGame(
    modifier: Modifier = Modifier,
    invitadoButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        PlayNow(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -87.0.dp
                )
            )
        )
        Wookiemania(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = -144.5.dp
                )
            )
        )
        CajaLog(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = -28.5.dp
                )
            )
        )
        CajaReg(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 26.5.dp
                )
            )
        )
        IniciarSesiN(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -5.0.dp,
                    y = -29.0.dp
                )
            )
        )
        Registrarse(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -5.0.dp,
                    y = 26.0.dp
                )
            )
        )
        Invitado(
            invitadoButton = invitadoButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 282.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 393, heightDp = 584)
@Composable
private fun StartGamePreview() {
    MaterialTheme {
        RelayContainer {
            StartGame(
                invitadoButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun PlayNow(modifier: Modifier = Modifier) {
    RelayText(
        content = "Play Now!",
        fontSize = 32.0.sp,
        fontFamily = rubikMonoOne,
        height = 1.2380000352859497.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(393.0.dp)
    )
}

@Composable
fun Wookiemania(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 36.0.sp,
        fontFamily = rubikWetPaint,
        color = Color(
            alpha = 255,
            red = 255,
            green = 214,
            blue = 0
        ),
        height = 1.2000000762939453.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(279.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun CajaLog(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.start_game_caja_log),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun CajaReg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.start_game_caja_reg),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun IniciarSesiN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar Sesión",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(279.0.dp)
    )
}

@Composable
fun Registrarse(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(279.0.dp)
    )
}

@Composable
fun Invitado(
    invitadoButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Continúa como Invitado",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000762939453.em,
        fontWeight = FontWeight(700.0.toInt()),
        underline = true,
        maxLines = -1,
        modifier = modifier.tappable(onTap = invitadoButton).requiredWidth(393.0.dp)
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
