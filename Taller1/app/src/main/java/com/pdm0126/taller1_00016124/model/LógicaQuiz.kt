package com.pdm0126.taller1_00016124.model


fun checkAnswer(
    selectedIndex: Int,
    correctAnswer: Int,
    onResult: (Boolean) -> Unit
) {
    val isCorrect = selectedIndex == correctAnswer
    onResult(isCorrect)
}