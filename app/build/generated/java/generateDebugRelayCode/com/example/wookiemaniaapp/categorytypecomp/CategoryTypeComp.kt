package com.example.wookiemaniaapp.categorytypecomp

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
 * This composable was generated from the UI Package 'category_type_comp'.
 * Generated code; do not edit directly
 */
@Composable
fun CategoryTypeComp(
    modifier: Modifier = Modifier,
    categoryButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangulo2FondoNegro(
            categoryButton = categoryButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.28124237060546875.dp,
                    y = 0.0.dp
                )
            )
        )
        Rectangulo1Fondo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 20.036842346191406.dp
                )
            )
        )
        Terror(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 16.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 150, heightDp = 127)
@Composable
private fun CategoryTypeCompPreview() {
    MaterialTheme {
        RelayContainer {
            CategoryTypeComp(
                categoryButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangulo2FondoNegro(
    categoryButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.category_type_comp_rectangulo2fondo_negro),
        modifier = modifier.tappable(onTap = categoryButton).requiredWidth(149.43751525878906.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun Rectangulo1Fondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.category_type_comp_rectangulo1fondo),
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(86.92628479003906.dp)
    )
}

@Composable
fun Terror(modifier: Modifier = Modifier) {
    RelayText(
        content = "Terror",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 214,
            blue = 0
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(149.0.dp).requiredHeight(33.0.dp)
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
