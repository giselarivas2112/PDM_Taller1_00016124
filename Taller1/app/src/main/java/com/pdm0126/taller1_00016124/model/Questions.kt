package com.pdm0126.taller1_00016124.model

data class Question(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctAnswer: Int,
    val funFact: String
)