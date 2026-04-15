package com.pdm0126.taller1_00016124.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pdm0126.taller1_00016124.model.questionList

@Composable
fun QuizScreen(
    questionIndex: Int,
    score: Int,
    alResponder: (Boolean) -> Unit,
    alSiguiente: () -> Unit
) {

    val question = questionList[questionIndex]

    var selectedIndex by remember(questionIndex) { mutableStateOf(-1) }
    var answered by remember(questionIndex) { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Pregunta ${questionIndex + 1} de 3")
        Text("Puntaje: $score / 3")

        Spacer(modifier = Modifier.height(20.dp))

        Text(question.question)

        Spacer(modifier = Modifier.height(20.dp))

        question.options.forEachIndexed { index, option ->

            val backgroundColor = if (answered) {
                if (index == question.correctAnswer) {
                    Color(0xFF4CAF50)
                } else if (index == selectedIndex) {
                    Color(0xFFF44336)
                } else {
                    Color.LightGray
                }
            } else {
                Color.LightGray
            }

            Button(
                onClick = {
                    if (!answered) {
                        selectedIndex = index
                        answered = true
                        alResponder(index == question.correctAnswer)
                    }
                },
                enabled = !answered,
                modifier = Modifier.fillMaxWidth().background(
                        color = backgroundColor,
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Text(option)
            }

            Spacer(modifier = Modifier.height(10.dp))
        }

        if (answered) {
            Text(question.funFact)

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    selectedIndex = -1
                    answered = false
                    alSiguiente()
                }
            ) {
                Text(if (questionIndex == 2) "Ver Resultado" else "Siguiente")
            }
        }
    }
}