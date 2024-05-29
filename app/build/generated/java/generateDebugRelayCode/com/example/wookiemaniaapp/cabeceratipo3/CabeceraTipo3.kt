package com.example.wookiemaniaapp.cabeceratipo3

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
 * This composable was generated from the UI Package 'cabecera_tipo3'.
 * Generated code; do not edit directly
 */
@Composable
fun CabeceraTipo3(
    modifier: Modifier = Modifier,
    screenText: String = "",
    backButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BoxScreenType(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        ScreenText(
            screenText = screenText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -32.0.dp,
                    y = 8.5.dp
                )
            )
        )
        BackIcon(
            backButton = backButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -163.0.dp,
                    y = 0.5.dp
                )
            )
        ) {
            VectorBack2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 400, heightDp = 101)
@Composable
private fun CabeceraTipo3Preview() {
    MaterialTheme {
        RelayContainer {
            CabeceraTipo3(
                screenText = "Creación",
                backButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxScreenType(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_tipo3_box_screen_type),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(101.0.dp)
    )
}

@Composable
fun ScreenText(
    screenText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = screenText,
        fontSize = 22.0.sp,
        fontFamily = firaSans,
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(182.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun VectorBack2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_tipo3_vector_back2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.0.dp,
                top = 6.2484130859375.dp,
                end = 5.000003814697266.dp,
                bottom = 6.250019073486328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BackIcon(
    backButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = backButton).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
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
