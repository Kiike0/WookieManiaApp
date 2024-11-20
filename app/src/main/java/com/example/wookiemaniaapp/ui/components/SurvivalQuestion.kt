package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.R
import com.example.wookiemaniaapp.question.firaSans
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

@Composable
fun TituloPreguntaComposableSurvival(
    questionTitle: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier.size(330.dp, 240.dp)
    ){
        Image(
            painter = painterResource(R.drawable.questionrandomblack), // Reemplaza 'your_image' con tu recurso de imagen
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        RelayText(
            content = questionTitle,
            fontSize = 18.0.sp,
            fontFamily = firaSans,
            height = 1.2.em,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight(600.0.toInt()),
            maxLines = 3,
            color = Color.White,
            modifier = modifier.padding(top = 30.dp, end = 50.dp, bottom = 30.dp)
        )
    }

}

@Composable
fun CloseIconComposableSurvival(
    onCloseIcon: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.closeiconsurvival),
        modifier = modifier.tappable(onTap = onCloseIcon)
    )
}

@Composable
fun VectorSaveComposableSurvival(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.saveiconsurvival),
        modifier = modifier
    )
}

@Composable
fun VectorHeartComposableSurvival(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.heartsurvival),
        modifier = modifier
    )
}

@Composable
fun SaveComposableSurvival(
    saveIcon: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
    )
}