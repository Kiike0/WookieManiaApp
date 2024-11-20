package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
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
fun NextNavSurvival(
    modifier: Modifier = Modifier,
    nextButton: () -> Unit = {}
) {
    Box(modifier = modifier.fillMaxWidth()) {
        NavNextBoxSurvival(
            modifier = Modifier.align(Alignment.Center)
        )
        NextIconSurvival(
            nextButton = nextButton,
            modifier = Modifier.align(Alignment.CenterEnd).padding(end = 30.dp)
        ) {
            NextVector1Survival(modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
fun NavNextBoxSurvival(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.toolbarsurv),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}


@Composable
fun NextVector1Survival(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.nexticonsurv),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun NextIconSurvival(
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
fun TopLevelSurvival(
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
