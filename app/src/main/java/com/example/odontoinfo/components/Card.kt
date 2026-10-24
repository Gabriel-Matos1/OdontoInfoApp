package com.example.odontoinfo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.odontoinfo.R
import com.example.odontoinfo.ui.theme.Branco
import com.example.odontoinfo.ui.theme.ScreenColors
import com.example.odontoinfo.ui.theme.TextOverBackgroundColors
import com.example.odontoinfo.ui.theme.Verde

@Composable
fun Card(
    Text_card: String,
    Color_Card: Color,
    Title_Card: String
) {
    Column(
        modifier = Modifier
            .width(220.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color_Card)
            .border(
                width = 2.dp,
                color = ScreenColors,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = Title_Card, textAlign = TextAlign.Center, color = TextOverBackgroundColors, modifier = Modifier.padding(bottom = 10.dp))

        Text(
            text = Text_card,
            color = TextOverBackgroundColors,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Card(
        Text_card = stringResource(R.string.icdas_carie_0),
        Color_Card = Verde,
        Title_Card = "Título"
    )
}
