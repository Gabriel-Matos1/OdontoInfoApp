package com.example.odontoinfo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.odontoinfo.R
import com.example.odontoinfo.ui.theme.Button_Back_Foward_Color

@Composable
fun Button_Comeback(
    Button_Text: String,
    Button_Color: Color,
    onClickFunction: () -> Unit
) {
    Button(
        onClick = onClickFunction,
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Button_Color
        )
    ) {
        Icon(
            painter = painterResource(R.drawable.icon_arrow_back),
            contentDescription = null
        )

        Text(
            text = Button_Text,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun Button_Foward(
    Button_Text: String,
    Button_Color: Color,
    onClickFunction: () -> Unit
) {
    Button(
        onClick = onClickFunction,
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Button_Color
        )
    ) {
        Icon(
            painter = painterResource(R.drawable.icon_arrow_forward),
            contentDescription = null
        )

        Text(
            text = Button_Text,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    Column() {
    Button_Comeback(
        Button_Text = "Voltar",
        Button_Color = Button_Back_Foward_Color,
        onClickFunction = {}
    )


    Button_Foward(
        Button_Text = "Próximo",
        Button_Color = Button_Back_Foward_Color,
        onClickFunction = {}
    )

    }
}