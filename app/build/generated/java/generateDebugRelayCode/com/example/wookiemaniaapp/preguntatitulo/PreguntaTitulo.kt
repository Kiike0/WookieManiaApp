package com.example.wookiemaniaapp.preguntatitulo

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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

/**
 * This composable was generated from the UI Package 'pregunta_titulo'.
 * Generated code; do not edit directly
 */
@Composable
fun PreguntaTitulo(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        BoxPregunta(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 72.5.dp
                )
            )
        )
        TituloPregunta(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -5.0.dp,
                    y = 70.5.dp
                )
            )
        )
        TextoPregunta(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -62.5.dp,
                    y = -41.0.dp
                )
            )
        )
        TextoElige(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -62.5.dp,
                    y = -145.0.dp
                )
            )
        )
        BoxCategoria(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -93.0.dp
                )
            )
        )
        Vectorflecha(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -127.0.dp,
                    y = -92.5.dp
                )
            )
        ) {
            Flecha2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Flecha(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.009248733520507812.dp,
                        y = 0.1710376739501953.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 312, heightDp = 313)
@Composable
private fun PreguntaTituloPreview() {
    MaterialTheme {
        RelayContainer {
            PreguntaTitulo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun BoxPregunta(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_titulo_box_pregunta),
        modifier = modifier.requiredWidth(311.0.dp).requiredHeight(168.0.dp)
    )
}

@Composable
fun TituloPregunta(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aqui tienes que poner la pregunta que quieres añadir",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(260.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun TextoPregunta(modifier: Modifier = Modifier) {
    RelayText(
        content = "Escribe la pregunta:",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(187.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun TextoElige(modifier: Modifier = Modifier) {
    RelayText(
        content = "Elige categoría:",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(187.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun BoxCategoria(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_titulo_box_categoria),
        modifier = modifier.requiredWidth(312.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Flecha2(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp))
}

@Composable
fun Flecha(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pregunta_titulo_flecha),
        modifier = modifier.requiredWidth(14.295711517333984.dp).requiredHeight(8.65530776977539.dp)
    )
}

@Composable
fun Vectorflecha(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
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
