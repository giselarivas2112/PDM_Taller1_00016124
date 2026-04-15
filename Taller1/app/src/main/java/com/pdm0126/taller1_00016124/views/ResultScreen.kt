package com.pdm0126.taller1_00016124.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResultScreen(score: Int, alReiniciar: () -> Unit) {

    val message = when(score) {
        3 -> "Excelenteee, sabes mucho :D"
        2 -> "Muy biennn"
        else -> "Hay que repasar un poquito, tu puedess"
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Obtuviste $score de 3")

        Text(message)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = alReiniciar) {
            Text("Reiniciar Quiz")
        }
    }
}