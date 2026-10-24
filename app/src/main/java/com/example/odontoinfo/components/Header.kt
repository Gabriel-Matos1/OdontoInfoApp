package com.example.odontoinfo.components

import android.R
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odontoinfo.ui.theme.CinzaClaro
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.res.stringResource
import com.example.odontoinfo.ui.theme.BackgroundColors
import com.example.odontoinfo.ui.theme.Verde

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(BackgroundColors),
        contentAlignment = Alignment.Center
    ) {/*
        Text(
            text = "OdontoInfo",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    blurRadius = 13f
                )
            )
        )*/

        Text_Title_Style(text_Title = stringResource(id = com.example.odontoinfo.R.string.app_name))
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}