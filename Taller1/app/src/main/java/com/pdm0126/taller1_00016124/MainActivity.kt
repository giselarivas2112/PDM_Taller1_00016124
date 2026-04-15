package com.pdm0126.taller1_00016124

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.pdm0126.taller1_00016124.ui.theme.AndroidPediaByRivasTheme
import com.pdm0126.taller1_00016124.views.QuizScreen
import com.pdm0126.taller1_00016124.views.ResultScreen
import com.pdm0126.taller1_00016124.views.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AndroidPediaByRivasTheme {

                var screen by rememberSaveable { mutableStateOf("welcome") }
                var currentQuestionIndex by rememberSaveable { mutableIntStateOf(0) }
                var score by rememberSaveable { mutableIntStateOf(0) }

                when (screen) {

                    "welcome" -> WelcomeScreen(
                        alIniciarQuiz = {
                            screen = "quiz"
                        }
                    )

                    "quiz" -> QuizScreen(
                        questionIndex = currentQuestionIndex,
                        score = score,
                        alResponder = { esCorrecta ->
                            if (esCorrecta) score++
                        },
                        alSiguiente = {
                            if (currentQuestionIndex < 2) {
                                currentQuestionIndex++
                            } else {
                                screen = "result"
                            }
                        }
                    )

                    "result" -> ResultScreen(
                        score = score,
                        alReiniciar = {
                            score = 0
                            currentQuestionIndex = 0
                            screen = "welcome"
                        }
                    )
                }
            }
        }
    }
}