package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.wookiemaniaapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'next_nav'.
 * Generated code; do not edit directly
 */
@Composable
fun NextNav2(
    modifier: Modifier = Modifier
) {
    TopLevel2(modifier = modifier) {
        NavNextBox2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Composable
fun NavNextBox2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.next_nav_nav_next_box),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun TopLevel2(
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
