package com.example.wookiemaniaapp.model

/**
 * Define el modelo de datos para un usuario.
 * Utilizado para gestionar la información de los usuarios en la base de datos.
 */
data class UserModel(
    val name: String,
    val surname: String,
    var userId: String,
    val email: String,
    val nickname: String,
    val totalAdded: Int,
    val trophiesNumber: Int,
    val achievements: ArrayList<String> = arrayListOf()
)