package com.example.odontoinfo.ui.screen


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Header

@Composable
fun QuizHomeScreen(
    onQuizHomeClick: () -> Unit
) {
    Column {
        Header()
        Text("\n\nQuiz")
        Button(onClick = onQuizHomeClick) {
            Text("Quiz rápido")
        }

        Text("\nRacking de tentativas")
        Button(onClick = onQuizHomeClick) {
            Text("Ir para página Ramcking de tentativas")
        }
        Text("\nSessão quiz por tempo")
        Button(onClick = onQuizHomeClick){
            Text("Ir quiz por tempo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizHomeScreenPreview() {
    QuizHomeScreen(
        onQuizHomeClick = {}
    )
}