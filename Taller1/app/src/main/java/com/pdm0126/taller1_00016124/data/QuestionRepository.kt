package com.pdm0126.taller1_00016124.data

import com.pdm0126.taller1_00016124.model.Question

val questionList = listOf(
    Question(
        id = 1,
        question = "¿Cuál fue el primer dispositivo con Android y qué características tenía?",
        options = listOf(
            "Samsung Galaxy S con solo pantalla táctil",
            "HTC Dream (T-Mobile G1) con pantalla táctil y teclado deslizable",
            "Motorola Droid con pantalla curva",
            "Nokia Lumia con teclado físico"
        ),
        correctAnswer = 1,
        funFact = "Sabías que: Android al inicio no fue creado para teléfonos, sino para cámaras digitales"
    ),
    Question(
        id = 2,
        question = "¿Qué característica importante se empezó a implementar desde las primeras versiones de Android como Cupcake y Donut?",
        options = listOf(
            "Reconocimiento facial",
            "Pantalla dividida",
            "Teclado en pantalla y soporte para más aplicaciones",
            "Modo oscuro"
        ),
        correctAnswer = 2,
        funFact = "Sabías que: Android 3.0 Honeycomb fue la única versión diseñada especialmente para tablets"
    ),
    Question(
        id = 3,
        question = "¿Qué cambió a partir de Android 10 en relación a los nombres de las versiones?",
        options = listOf(
            "Se empezaron a usar nombres de animales",
            "Se eliminaron las actualizaciones del sistema",
            "Se dejaron de usar nombres de dulces oficialmente",
            "Se usaron nombres de países"
        ),
        correctAnswer = 2,
        funFact = "Sabías que: Las primeras versiones (Android 1.0 y 1.1) no tenían nombre de dulce"
    )
)