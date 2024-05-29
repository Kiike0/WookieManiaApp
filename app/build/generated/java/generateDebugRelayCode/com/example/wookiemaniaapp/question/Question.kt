package com.example.wookiemaniaapp.question

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
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'question'.
 * Generated code; do not edit directly
 */
@Composable
fun Question(
    modifier: Modifier = Modifier,
    textCategory: String = "",
    questionTitle: String = "",
    dislikeIcon: () -> Unit = {},
    likeIcon: () -> Unit = {},
    closeIcon: () -> Unit = {},
    saveIcon: () -> Unit = {},
    buttonTextAnswerA: () -> Unit = {},
    buttonTextAnswerB: () -> Unit = {},
    buttonTextAnswerC: () -> Unit = {},
    buttonTextAnswerD: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BoxQuestion(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        TeHaGustado(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -94.5.dp,
                    y = 313.5.dp
                )
            )
        )
        DislikeIcon(
            dislikeIcon = dislikeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 152.0.dp,
                    y = 318.0.dp
                )
            )
        ) {
            VectorDislike(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LikeIcon(
            likeIcon = likeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 93.0.dp,
                    y = 314.0.dp
                )
            )
        ) {
            VectorLike(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TextCategory(
            textCategory = textCategory,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 72.0.dp,
                    y = -319.5.dp
                )
            )
        )
        CloseIcon(
            closeIcon = closeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -156.0.dp,
                    y = -319.0.dp
                )
            )
        ) {
            VectorBoxClose(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorClose(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Save(
            saveIcon = saveIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 316.0.dp
                )
            )
        ) {
            VectorSave(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TitleDesign(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 48.0.dp,
                    y = 81.0.dp
                )
            )
        ) {
            QuestionRandom(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TituloPregunta(
                questionTitle = questionTitle,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -3.5.dp,
                        y = -14.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerA(
            buttonTextAnswerA = buttonTextAnswerA,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 315.0.dp
                )
            )
        ) {
            AnswerA(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaA(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerB(
            buttonTextAnswerB = buttonTextAnswerB,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 403.0.dp
                )
            )
        ) {
            AnswerB(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaB(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerC(
            buttonTextAnswerC = buttonTextAnswerC,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 491.0.dp
                )
            )
        ) {
            AnswerC(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaC(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerD(
            buttonTextAnswerD = buttonTextAnswerD,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 579.0.dp
                )
            )
        ) {
            AnswerD(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaD(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 393, heightDp = 731)
@Composable
private fun QuestionPreview() {
    MaterialTheme {
        RelayContainer {
            Question(
                dislikeIcon = {},
                likeIcon = {},
                textCategory = "Fantasía",
                closeIcon = {},
                saveIcon = {},
                buttonTextAnswerA = {},
                buttonTextAnswerB = {},
                buttonTextAnswerC = {},
                buttonTextAnswerD = {},
                questionTitle = "¿Cómo se llama la lechuza de Harry\nPotter?",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BoxQuestion(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_box_question),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(731.0.dp)
    )
}

@Composable
fun TeHaGustado(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Te ha gustado?",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(164.0.dp)
    )
}

@Composable
fun VectorDislike(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_dislike),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.375.dp,
                top = 4.375.dp,
                end = 3.558053970336914.dp,
                bottom = 4.375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DislikeIcon(
    dislikeIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = dislikeIcon).requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun VectorLike(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_like),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.375.dp,
                top = 4.375.dp,
                end = 3.5580520629882812.dp,
                bottom = 4.375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun LikeIcon(
    likeIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = likeIcon).requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun TextCategory(
    textCategory: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textCategory,
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(189.0.dp)
    )
}

@Composable
fun VectorBoxClose(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun VectorClose(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_close),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.66168212890625.dp,
                top = 5.66162109375.dp,
                end = 5.686336517333984.dp,
                bottom = 5.66168212890625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CloseIcon(
    closeIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = closeIcon).requiredWidth(33.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun VectorSave(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_save),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.375.dp,
                top = 3.28125.dp,
                end = 4.375.dp,
                bottom = 3.279895782470703.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Save(
    saveIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = saveIcon).requiredWidth(35.0.dp).requiredHeight(35.0.dp)
    )
}

@Composable
fun QuestionRandom(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.question_question_random),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(215.0.dp)
    )
}

@Composable
fun TituloPregunta(
    questionTitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = questionTitle,
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(229.0.dp).requiredHeight(122.0.dp)
    )
}

@Composable
fun TitleDesign(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(215.0.dp)
    )
}

@Composable
fun AnswerA(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_a),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaA(modifier: Modifier = Modifier) {
    RelayText(
        content = "A. Hedwig",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(288.0.dp)
    )
}

@Composable
fun ButtonTextAnswerA(
    buttonTextAnswerA: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = buttonTextAnswerA).requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun AnswerB(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_b),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaB(modifier: Modifier = Modifier) {
    RelayText(
        content = "B. Bethoven",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(288.0.dp)
    )
}

@Composable
fun ButtonTextAnswerB(
    buttonTextAnswerB: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = buttonTextAnswerB).requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun AnswerC(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_c),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaC(modifier: Modifier = Modifier) {
    RelayText(
        content = "C. Scabbers",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(288.0.dp)
    )
}

@Composable
fun ButtonTextAnswerC(
    buttonTextAnswerC: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = buttonTextAnswerC).requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun AnswerD(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_d),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaD(modifier: Modifier = Modifier) {
    RelayText(
        content = "D. Pluto",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(288.0.dp)
    )
}

@Composable
fun ButtonTextAnswerD(
    buttonTextAnswerD: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = buttonTextAnswerD).requiredWidth(344.0.dp).requiredHeight(63.0.dp)
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
