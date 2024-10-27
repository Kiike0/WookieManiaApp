package com.example.wookiemaniaapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wookiemaniaapp.loginprototipo.firaSans
import com.example.wookiemaniaapp.loginprototipo.rubikWetPaint
import com.example.wookiemaniaapp.ui.theme.ColorApp
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'login_prototipo'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginComposable(
    modifier: Modifier = Modifier,
    backToStartButton: () -> Unit = {},
    accessButton: () -> Unit = {}
) {
    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Centra horizontalmente el contenido
        verticalArrangement = Arrangement.Center){
        WookiemaniaCustom(
            modifier = Modifier
            )
        Spacer(modifier = Modifier.height(20.dp))
        TextField1Custom(
            modifier = Modifier
            )
        Spacer(modifier = Modifier.height(20.dp))
        TextField2Custom(
            modifier = Modifier

        )
        Spacer(modifier = Modifier.height(40.dp))
        Row {
            BotonVolver(
                backToStartButton = backToStartButton,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(20.dp))
            BotonAcceder(
                accessButton = accessButton,
                modifier = Modifier
            )

        }

    }

}
@Composable
fun BotonAcceder(
    accessButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { /* Acción del botón */ },
        modifier = Modifier
            .defaultMinSize(minWidth = 150.dp, minHeight = 50.dp),  // Ajusta el tamaño mínimo si es necesario
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,       // Fondo negro
            contentColor = ColorApp       // Texto amarillo
        ),
        border = BorderStroke(4.dp, Color.Black),
        shape = RoundedCornerShape(8.dp)       // Bordes redondeados
    ) {
        Text(text = "Acceder",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans
        )
    }
}
@Composable
fun BotonVolver(
    backToStartButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = backToStartButton,
        modifier = Modifier
            .defaultMinSize(minWidth = 150.dp, minHeight = 50.dp),  // Ajusta el tamaño mínimo si es necesario
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,  // Fondo transparente
            contentColor = Color.Black           // Color del texto
        ),
        border = BorderStroke(4.dp, Color.Black),  // Borde negro
        shape = RoundedCornerShape(8.dp)           // Bordes redondeados
    ) {
        Text(text = "Volver",
            fontSize = 20.sp,               // Tamaño de fuente más grande
            fontWeight = FontWeight.Bold,
            fontFamily = firaSans
    )
    }
}

@Composable
fun WookiemaniaCustom(modifier: Modifier = Modifier) {
    RelayText(
        content = "Wookiemania",
        fontSize = 36.0.sp,
        fontFamily = rubikWetPaint,
        height = 1.2000000762939453.em,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(279.0.dp)
            .requiredHeight(53.0.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField1Custom(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }
    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa un email correctamente") }, // Texto de marcador
        label = { Text("Email") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField2Custom(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = userInput,
        onValueChange = { userInput = it },
        modifier = Modifier
            .width(350.dp)
            .height(70.dp) // Controla la altura total del campo
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .border(
                BorderStroke(3.dp, Color.Black), // Borde negro personalizado
                shape = MaterialTheme.shapes.medium
            ),
        placeholder = { Text("Ingresa la contraseña correctamente") }, // Texto de marcador
        label = { Text("Contraseña") },
        maxLines = 1,
        minLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Borde original invisible
            focusedBorderColor = Color.Transparent // Borde original invisible al enfocarse
        )
    )
}

/*
/**
 * Composable del relay modificado del Relay para adaptarlo a las características de la aplicación
 * Representa al logueo del usuario
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginComposable(
    modifier: Modifier = Modifier,
    onAccessButton: () -> Unit = {},
    onCreateButton: () -> Unit = {},
    accessUserViewModel: UserViewModel
) {
    TopLevelMod(modifier = modifier) {
        RectangleTitleImgMod(
            rectangleImg = painterResource(R.drawable.acceso_usuario_rectangle_img),
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 3.5.dp,
                    y = (-173.0).dp
                )
            )
        )
        OutlinedTextField(
            value = accessUserViewModel.email,
            onValueChange = { accessUserViewModel.changeEmail(it) },
            label = { CustomizedText(customizedText = "Email") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = (-44.5).dp
                    )
                )
                .clip(RoundedCornerShape(25.dp))
                .background(BackGroundAccessBox)
                .width(330.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
            ),
            textStyle = LocalTextStyle.current.copy(color = Color.White)
        )
        OutlinedTextField(
            value = accessUserViewModel.password,
            onValueChange = { accessUserViewModel.changePassword(it) },
            label = { CustomizedText(customizedText = "Contraseña") },
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 26.5.dp
                    )
                )
                .clip(RoundedCornerShape(25.dp))
                .background(BackGroundAccessBox)
                .width(330.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            textStyle = LocalTextStyle.current.copy(color = Color.White),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )
        TextDescriptionMod(
            textDescription = "Si no tienes cuenta debes crear una para acceder",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = (-0.5).dp,
                    y = 88.5.dp
                )
            )
        )
        CreateButtonMod(
            onCreateButton = onCreateButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.5.dp,
                    y = 160.dp
                )
            )
        )
        CreateTextMod(
            createText = "Crear Cuenta",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.0.dp,
                    y = 160.dp
                )
            )
        )
        AccessButtonRectangleMod(
            onAccessButton = onAccessButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.5.dp,
                    y = 240.dp
                )
            )
        )
        AccessTextMod(
            accessText = "Acceder",
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.0.dp,
                    y = 240.dp
                )
            )
        )
    }
}
@Composable
fun CreateButtonMod(
    onCreateButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_create_button),
        modifier = modifier.tappable(onTap = onCreateButton).requiredWidth(230.0.dp).requiredHeight(58.0.dp)
    )
}

@Composable
fun CreateTextMod(
    createText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = createText,
        fontSize = 20.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun AccessButtonRectangleMod(
    onAccessButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.acceso_usuario_access_button_rectangle),
        modifier = modifier
            .tappable(onTap = onAccessButton)
            .requiredWidth(230.0.dp)
            .requiredHeight(58.0.dp)
    )
}

@Composable
fun AccessTextMod(
    accessText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = accessText,
        fontSize = 20.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TextDescriptionMod(
    textDescription: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textDescription,
        fontSize = 15.0.sp,
        fontFamily = tomorrow,
        color = Color(
            alpha = 255,
            red = 151,
            green = 168,
            blue = 183
        ),
        height = 1.2.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(300.0.dp)
    )
}

@Composable
fun RectangleTitleImgMod(
    rectangleImg: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = rectangleImg,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(270.0.dp)
            .requiredHeight(153.0.dp)
    )
}

@Composable
fun TopLevelMod(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
 */