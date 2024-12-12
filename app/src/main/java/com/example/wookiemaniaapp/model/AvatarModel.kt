package com.example.wookiemaniaapp.model

/**
 * Define el modelo de datos para los avatares de cada perfil.
 * Se utiliza para gestionar esos avatares de los usuarios en la base de datos.
 */
data class AvatarModel(
    val id: String = "",
    val userId: String = "",
    val imageUrl: String = ""
)

