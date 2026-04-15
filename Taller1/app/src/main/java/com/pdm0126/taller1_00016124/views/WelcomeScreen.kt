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
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(alIniciarQuiz: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("AndroidPedia", fontSize = 28.sp)

        Text("¿Cuánto sabes de Android?")

        Text("Gisela Rivas - 00016124")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = alIniciarQuiz) {
            Text("Comenzar Quiz")
        }
    }
}