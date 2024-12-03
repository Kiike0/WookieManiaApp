package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.rankingposition.firaSans
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'ranking_position'.
 * Generated code; do not edit directly
 */
@Composable
fun RankingPoints(
    modifier: Modifier = Modifier,
    username: String = "",
    points: String = "",
    boxToProfileButton: () -> Unit = {}
) {
    TopLevelPoints(modifier = modifier) {
        BoxButtonPoints(
            boxToProfileButton = boxToProfileButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        UsernamePoints(
            username = username,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -10.5.dp,
                    y = 0.0.dp
                )
            )
        )
        PointsPoints(
            points = points,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 120.0.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Composable
fun BoxButtonPoints(
    boxToProfileButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.ranking_position_box_button),
        modifier = modifier.tappable(onTap = boxToProfileButton).requiredWidth(348.0.dp).requiredHeight(57.0.dp)
    )
}

@Composable
fun UsernamePoints(
    username: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = username,
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(263.0.dp)
    )
}

@Composable
fun PointsPoints(
    points: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = points,
        fontSize = 16.0.sp,
        fontFamily = firaSans,
        height = 1.2000000476837158.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelPoints(
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
