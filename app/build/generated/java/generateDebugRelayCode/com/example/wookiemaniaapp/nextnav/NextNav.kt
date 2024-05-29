package com.example.wookiemaniaapp.nextnav

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'next_nav'.
 * Generated code; do not edit directly
 */
@Composable
fun NextNav(
    modifier: Modifier = Modifier,
    nextButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        NavNextBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        NextIcon(
            nextButton = nextButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 122.0.dp,
                    y = -12.0.dp
                )
            )
        ) {
            NextVector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorNext5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorNext4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorNext3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorNext2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorNext1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 400, heightDp = 132)
@Composable
private fun NextNavPreview() {
    MaterialTheme {
        RelayContainer {
            NextNav(
                nextButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun NavNextBox(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_nav_next_box),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun NextVector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_next_vector1),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorNext5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_vector_next5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.038959503173828.dp,
                top = 13.888916015625.dp,
                end = 25.207876205444336.dp,
                bottom = 13.168476104736328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorNext4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_vector_next4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.037036895751953.dp,
                top = 13.888916015625.dp,
                end = 25.20594882965088.dp,
                bottom = 13.168476104736328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorNext3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_vector_next3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.654312133789062.dp,
                top = 13.888916015625.dp,
                end = 15.592525482177734.dp,
                bottom = 13.168476104736328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorNext2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_vector_next2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.652450561523438.dp,
                top = 13.888916015625.dp,
                end = 15.590533256530762.dp,
                bottom = 13.168476104736328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorNext1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_vector_next1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 34.25926208496094.dp,
                top = 13.888916015625.dp,
                end = 11.894583225250244.dp,
                bottom = 13.034164428710938.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun NextIcon(
    nextButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = nextButton).requiredWidth(50.0.dp).requiredHeight(50.0.dp)
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
