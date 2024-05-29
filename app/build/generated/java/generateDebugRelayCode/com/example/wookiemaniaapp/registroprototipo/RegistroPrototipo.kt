package com.example.wookiemaniaapp.registroprototipo

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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'registro_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun RegistroPrototipo(
    modifier: Modifier = Modifier,
    volverAInicioBoton: () -> Unit = {},
    registrarseBoton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BoxAtras(
            volverAInicioBoton = volverAInicioBoton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxVolverAInicio(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            VolverTexto(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 1.0.dp
                    )
                )
            )
        }
        BoxRegistrarseButton(
            registrarseBoton = registrarseBoton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxRegistrarse(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Registrarse(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 1.0.dp
                    )
                )
            )
        }
        RectangleName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -186.5.dp
                )
            )
        )
        Nombre(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -111.5.dp,
                    y = -231.5.dp
                )
            )
        )
        RectApellidos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -106.5.dp
                )
            )
        )
        Apellidos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -102.0.dp,
                    y = -146.5.dp
                )
            )
        )
        RectUsername(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -26.5.dp
                )
            )
        )
        Username(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -70.5.dp,
                    y = -66.5.dp
                )
            )
        )
        RectangleCont(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 133.5.dp
                )
            )
        )
        ContraseA(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -99.0.dp,
                    y = 93.5.dp
                )
            )
        )
        RectEmail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 53.5.dp
                )
            )
        )
        Email(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -120.5.dp,
                    y = 13.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 299, heightDp = 482)
@Composable
private fun RegistroPrototipoPreview() {
    MaterialTheme {
        RelayContainer {
            RegistroPrototipo(
                volverAInicioBoton = {},
                registrarseBoton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxVolverAInicio(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_box_volver_ainicio),
        modifier = modifier.requiredWidth(134.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun VolverTexto(modifier: Modifier = Modifier) {
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
fun BoxAtras(
    volverAInicioBoton: () -> Unit,
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
                top = 434.0.dp,
                end = 165.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = volverAInicioBoton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BoxRegistrarse(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_box_registrarse),
        modifier = modifier.requiredWidth(134.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Registrarse(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
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
fun BoxRegistrarseButton(
    registrarseBoton: () -> Unit,
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
                top = 434.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = registrarseBoton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun RectangleName(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_rectangle_name),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Nombre(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nombre",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RectApellidos(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_rect_apellidos),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Apellidos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Apellido/s",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RectUsername(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_rect_username),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Username(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nombre de usuario",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RectangleCont(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_rectangle_cont),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun ContraseA(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contraseña",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun RectEmail(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.registro_prototipo_rect_email),
        modifier = modifier.requiredWidth(299.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Email(modifier: Modifier = Modifier) {
    RelayText(
        content = "Email",
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
