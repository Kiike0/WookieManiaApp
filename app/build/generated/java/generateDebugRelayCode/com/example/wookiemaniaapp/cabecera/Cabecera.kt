package com.example.wookiemaniaapp.cabecera

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
 * This composable was generated from the UI Package 'cabecera'.
 * Generated code; do not edit directly
 */
@Composable
fun Cabecera(
    modifier: Modifier = Modifier,
    rankingButton: () -> Unit = {},
    playButton: () -> Unit = {},
    survivalButton: () -> Unit = {},
    categoryButton: () -> Unit = {},
    starButton: () -> Unit = {},
    notifButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BoxBarGame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        RankingButton(
            rankingButton = rankingButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxRanking(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RankingIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = -0.5.dp
                    )
                )
            ) {
                VectorRanking(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        PlayButton(
            playButton = playButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxPlay(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            PlayIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.679107666015625.dp,
                        y = -0.5596694946289062.dp
                    )
                )
            ) {
                VectorPlay(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        SurvivalButton(
            survivalButton = survivalButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BoxSurvival(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            VectorSurvival(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0001678466796875.dp,
                        y = -1.1194305419921875.dp
                    )
                )
            ) {
                VectorSurv(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        CategoryButton(
            categoryButton = categoryButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            CajaCategory(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            VectorCategory(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 2.2462615966796875.dp,
                        y = -0.7537384033203125.dp
                    )
                )
            ) {
                VectorCateg(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Wookiemania(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -78.0.dp,
                    y = -31.0.dp
                )
            )
        )
        StarButton(
            starButton = starButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 108.0.dp,
                    y = -35.0.dp
                )
            )
        ) {
            BoxStarVect(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            StarVector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        NotifButton(
            notifButton = notifButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 157.0.dp,
                    y = -35.0.dp
                )
            )
        ) {
            VectorNotif(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 400, heightDp = 184)
@Composable
private fun CabeceraPreview() {
    MaterialTheme {
        RelayContainer {
            Cabecera(
                rankingButton = {},
                playButton = {},
                survivalButton = {},
                categoryButton = {},
                starButton = {},
                notifButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxBarGame(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_box_bar_game),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(184.0.dp)
    )
}

@Composable
fun BoxRanking(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_box_ranking),
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun VectorRanking(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_vector_ranking),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.3125.dp,
                top = 6.5625.dp,
                end = 1.3125.dp,
                bottom = 6.5625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun RankingIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun RankingButton(
    rankingButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 304.0.dp,
                top = 92.0.dp,
                end = 21.0.dp,
                bottom = 17.0.dp
            )
        ).tappable(onTap = rankingButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BoxPlay(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_box_play),
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun VectorPlay(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_vector_play),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.238922119140625.dp,
                top = 6.9261322021484375.dp,
                end = 9.235488891601562.dp,
                bottom = 6.926326751708984.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun PlayIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(49.25372314453125.dp).requiredHeight(49.25372314453125.dp)
    )
}

@Composable
fun PlayButton(
    playButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.0.dp,
                top = 92.0.dp,
                end = 305.0.dp,
                bottom = 17.0.dp
            )
        ).tappable(onTap = playButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BoxSurvival(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_box_survival),
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun VectorSurv(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_vector_surv),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.264923095703125.dp,
                top = 3.264923095703125.dp,
                end = 3.2649154663085938.dp,
                bottom = 3.2649192810058594.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorSurvival(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(39.179107666015625.dp).requiredHeight(39.179107666015625.dp)
    )
}

@Composable
fun SurvivalButton(
    survivalButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 115.0.dp,
                top = 92.0.dp,
                end = 210.0.dp,
                bottom = 17.0.dp
            )
        ).tappable(onTap = survivalButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaCategory(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_caja_category),
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun VectorCateg(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_vector_categ),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.4365692138671875.dp,
                top = 12.873130798339844.dp,
                end = 7.311870574951172.dp,
                bottom = 12.873130798339844.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorCategory(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(51.492523193359375.dp).requiredHeight(51.492523193359375.dp)
    )
}

@Composable
fun CategoryButton(
    categoryButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 209.0.dp,
                top = 92.0.dp,
                end = 116.0.dp,
                bottom = 17.0.dp
            )
        ).tappable(onTap = categoryButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Wookiemania(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 22.0.sp,
        fontFamily = rubikWetPaint,
        color = Color(
            alpha = 255,
            red = 255,
            green = 214,
            blue = 0
        ),
        height = 1.2000000762939453.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(182.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun BoxStarVect(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun StarVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_star_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.139606475830078.dp,
                top = 2.809206008911133.dp,
                end = 2.1405410766601562.dp,
                bottom = 2.577146530151367.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun StarButton(
    starButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = starButton).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun VectorNotif(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_vector_notif),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.8125.dp,
                top = 0.9375.dp,
                end = 2.8125.dp,
                bottom = 1.875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun NotifButton(
    notifButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = notifButton).requiredWidth(30.0.dp).requiredHeight(30.0.dp)
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
