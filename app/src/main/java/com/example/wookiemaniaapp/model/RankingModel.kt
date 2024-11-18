package com.example.wookiemaniaapp.model

data class RankingModel(
    var idRanking: String = "", // ID del ranking
    val position: Int = 0,      // Posición en el ranking
    val nickname: String = "",  // Nickname del usuario
    var points: Int = 0         // Puntos del usuario
)