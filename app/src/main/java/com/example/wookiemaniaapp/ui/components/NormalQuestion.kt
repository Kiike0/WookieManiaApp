package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.example.wookiemaniaapp.ui.theme.ColorBoxNormalQuestion
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Es la funcion composable que muestra una pregunta del modo normal
 */
@Composable
fun NormalQuestion(
    textCategory: String = "",
    questionTitle: String = "",
    closeIcon: () -> Unit = {},
    saveIcon: () -> Unit = {},
    buttonTextAnswerA: () -> Unit = {},
    buttonTextAnswerB: () -> Unit = {},
    buttonTextAnswerC: () -> Unit = {},
    buttonTextAnswerD: () -> Unit = {},
    questionAnswer1: String = "",
    questionAnswer2: String = "",
    questionAnswer3: String = "",
    questionAnswer4: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(728.dp)
            .background(ColorBoxNormalQuestion),
        contentAlignment = Alignment.TopStart
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 37.dp)
                    .size(30.dp)
            ) {
                Spacer(modifier = Modifier.width(30.dp))
                CloseIconComposable(
                    onCloseIcon = closeIcon,
                    modifier = Modifier.padding(top = 7.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                TextCategoryComposable(
                    textCategory = textCategory
                )
            }
            TituloPreguntaComposable(
                questionTitle = questionTitle,
                modifier = Modifier.padding(start = 40.dp, top = 20.dp)
            )

            Button(
                onClick = { buttonTextAnswerA() }, // Ejecuta la función al hacer clic
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color.Black),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(500.dp, 50.dp)
            ) {
                Text(
                    text = "A. $questionAnswer1",
                    color = Color.Black,
                    fontSize = 18.0.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }
            Button(
                onClick = { buttonTextAnswerB() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color.Black),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(500.dp, 50.dp)
            ) {
                Text(
                    text = "B. $questionAnswer2",
                    color = Color.Black,
                    fontSize = 18.0.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }
            Button(
                onClick = { buttonTextAnswerC() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color.Black),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(500.dp, 50.dp)
            ) {
                Text(
                    text = "C. $questionAnswer3",
                    color = Color.Black,
                    fontSize = 18.0.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }
            Button(
                onClick = { buttonTextAnswerD() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color.Black),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(12.dp)
                    .size(500.dp, 50.dp)
            ) {
                Text(
                    text = "D. $questionAnswer4",
                    color = Color.Black,
                    fontSize = 18.0.sp,
                    fontFamily = firaSans,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                SaveComposable(
                    saveIcon = saveIcon,
                    modifier = Modifier.padding(end = 20.dp)
                ) {
                    VectorSaveComposable(modifier = Modifier)
                }
            }
        }
    }
}
@Composable
fun TituloPreguntaComposable(
    questionTitle: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier.size(330.dp, 240.dp)
    ){
        Image(
            painter = painterResource(R.drawable.question_question_random), // Reemplaza 'your_image' con tu recurso de imagen
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
            modifier = modifier.padding(top = 30.dp, end = 50.dp, bottom = 30.dp)
        )
    }

}

@Composable
fun TextCategoryComposable(
    textCategory: String
) {
    Text(
        text = textCategory,
        color = Color.Black,
        fontSize = 20.0.sp,
        fontFamily = firaSans,
        fontWeight = FontWeight.Bold
    )
}
@Composable
fun CloseIconComposable(
    onCloseIcon: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_close),
        modifier = modifier.tappable(onTap = onCloseIcon)
    )
}

@Composable
fun VectorSaveComposable(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.question_vector_save),
        modifier = modifier
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
        modifier = modifier
    )
}