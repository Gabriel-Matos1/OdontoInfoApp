package com.example.odontoinfo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odontoinfo.ui.theme.TextOverBackgroundColors

@Composable
fun Text_Title_Style(
    text_Title: String
){
    Text(text = text_Title, fontStyle = FontStyle.Italic, fontSize = 25.sp, modifier = Modifier.padding(start = 15.dp, top =0.dp), color = TextOverBackgroundColors,
        fontWeight = FontWeight.Bold)
}


@Composable
fun Text_SubTitle_Style(
    text_SubTitle: String
){
    Text(text = "\n"+text_SubTitle+"\n", fontStyle = FontStyle.Italic, fontSize = 18.sp, modifier = Modifier.padding(start = 15.dp), fontWeight = FontWeight.Bold)
}


@Composable
fun Text_Normal_Style(
    text_normal: String
){
    Text(text = text_normal, fontStyle = FontStyle.Italic, fontSize = 10.sp, modifier = Modifier.padding(start = 10.dp))
}


@Preview(showBackground = true)
@Composable
fun LettersPreview(){
    Column() {
    Text_Title_Style("Titulosssss")
    Text_SubTitle_Style("SubTituloo")
    Text_Normal_Style("Texto normalll")
    }
    }
