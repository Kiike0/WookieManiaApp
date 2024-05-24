package com.example.wookiemaniaapp.ui.components

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