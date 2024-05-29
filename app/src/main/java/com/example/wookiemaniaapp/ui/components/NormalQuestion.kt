package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.question.firaSans
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
fun NormalQuestion(
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
    LevelNormalQuestion(modifier = modifier) {
        BoxQuestionComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = (-72.5).dp
                )
            )
        )
        TeHaGustadoComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-94.5).dp,
                    y = 233.5.dp
                )
            )
        )
        DislikeIconComposable(
            dislikeIcon = dislikeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 152.0.dp,
                    y = 238.0.dp
                )
            )
        ) {
            VectorDislikeComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LikeIconComposable(
            likeIcon = likeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 93.0.dp,
                    y = 234.0.dp
                )
            )
        ) {
            VectorLikeComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TextCategoryComposable(
            textCategory = textCategory,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 72.0.dp,
                    y = (-362.5).dp
                )
            )
        )
        CloseIconComposable(
            closeIcon = closeIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-156.0).dp,
                    y = (-362.0).dp
                )
            )
        ) {
            VectorBoxCloseComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorCloseComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        SaveComposable(
            saveIcon = saveIcon,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 236.0.dp
                )
            )
        ) {
            VectorSaveComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TitleDesignComposable(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 48.0.dp,
                    y = 71.0.dp
                )
            )
        ) {
            QuestionRandomComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = (-6.5).dp
                    )
                )
            )
            TituloPreguntaComposable(
                questionTitle = questionTitle,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = (-3.5).dp,
                        y = (-21.0).dp
                    )
                )
            )
        }
        ButtonTextAnswerAComposable(
            buttonTextAnswerA = buttonTextAnswerA,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 298.5.dp
                )
            )
        ) {
            AnswerAComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaAComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerBComposable(
            buttonTextAnswerB = buttonTextAnswerB,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 383.0.dp
                )
            )
        ) {
            AnswerBComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaBComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerCComposable(
            buttonTextAnswerC = buttonTextAnswerC,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 465.0.dp
                )
            )
        ) {
            AnswerCComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaCComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 4.0.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        ButtonTextAnswerDComposable(
            buttonTextAnswerD = buttonTextAnswerD,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 24.0.dp,
                    y = 543.0.dp
                )
            )
        ) {
            AnswerDComposable(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            RespuestaDComposable(
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
@Composable
fun BoxQuestionComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_box_question),
        modifier = modifier.requiredWidth(393.0.dp).requiredHeight(731.0.dp)
    )
}

@Composable
fun TeHaGustadoComposable(modifier: Modifier = Modifier) {
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
fun VectorDislikeComposable(modifier: Modifier = Modifier) {
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
fun DislikeIconComposable(
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
fun VectorLikeComposable(modifier: Modifier = Modifier) {
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
fun LikeIconComposable(
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
fun TextCategoryComposable(
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
fun VectorBoxCloseComposable(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun VectorCloseComposable(modifier: Modifier = Modifier) {
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
fun CloseIconComposable(
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
fun VectorSaveComposable(modifier: Modifier = Modifier) {
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
fun SaveComposable(
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
fun QuestionRandomComposable(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.question_question_random),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(215.0.dp)
    )
}

@Composable
fun TituloPreguntaComposable(
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
fun TitleDesignComposable(
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
fun AnswerAComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_a),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaAComposable(modifier: Modifier = Modifier) {
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
fun ButtonTextAnswerAComposable(
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
fun AnswerBComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_b),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaBComposable(modifier: Modifier = Modifier) {
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
fun ButtonTextAnswerBComposable(
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
fun AnswerCComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_c),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaCComposable(modifier: Modifier = Modifier) {
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
fun ButtonTextAnswerCComposable(
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
fun AnswerDComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_d),
        modifier = modifier.requiredWidth(344.0.dp).requiredHeight(63.0.dp)
    )
}

@Composable
fun RespuestaDComposable(modifier: Modifier = Modifier) {
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
fun ButtonTextAnswerDComposable(
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
fun LevelNormalQuestion(
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

/*
/**
 * This composable was generated from the UI Package 'question'.
 * Generated code; do not edit directly
 */
@Composable
fun NormalQuestion(modifier: Modifier = Modifier) {
    LevelQuestion(modifier = modifier) {
        BoxQuestionComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        AnswerAComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        AnswerBComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        AnswerCComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        AnswerDComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        QuestionRandomComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        TeHaGustadoComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        DislikeIconComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            VectorDislikeComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LikeIconComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            VectorLikeComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        TextCategoryComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CloseIconComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            VectorBoxCloseComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            VectorCloseComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        SaveComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            VectorSaveComposable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun BoxQuestionComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_box_question),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AnswerAComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_a),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 315.0.dp,
                end = 25.0.dp,
                bottom = 353.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AnswerBComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_b),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 403.0.dp,
                end = 25.0.dp,
                bottom = 265.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AnswerCComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_c),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 491.0.dp,
                end = 25.0.dp,
                bottom = 177.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AnswerDComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_answer_d),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 579.0.dp,
                end = 25.0.dp,
                bottom = 89.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun QuestionRandomComposable(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.question_question_random),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 48.0.dp,
                top = 81.0.dp,
                end = 49.0.dp,
                bottom = 435.0.dp
            )
        ).size(410.dp, 220.dp)
    )
}

@Composable
fun TeHaGustadoComposable(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Te ha gustado?",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 20.0.dp,
                top = 667.0.dp,
                end = 209.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorDislikeComposable(modifier: Modifier = Modifier) {
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
fun DislikeIconComposable(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 331.0.dp,
                top = 666.0.dp,
                end = 27.0.dp,
                bottom = 30.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorLikeComposable(modifier: Modifier = Modifier) {
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
fun LikeIconComposable(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 272.0.dp,
                top = 662.0.dp,
                end = 86.0.dp,
                bottom = 34.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextCategoryComposable(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aventura",
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 287.0.dp,
                top = 34.0.dp,
                end = 24.0.dp,
                bottom = 673.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorBoxCloseComposable(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun VectorCloseComposable(modifier: Modifier = Modifier) {
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
fun CloseIconComposable(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 30.0.dp,
                end = 336.0.dp,
                bottom = 668.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorSaveComposable(modifier: Modifier = Modifier) {
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
fun SaveComposable(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 206.0.dp,
                top = 664.0.dp,
                end = 152.0.dp,
                bottom = 32.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun LevelQuestion(
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
*/