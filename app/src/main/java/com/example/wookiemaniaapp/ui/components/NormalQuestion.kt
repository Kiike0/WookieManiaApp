package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
