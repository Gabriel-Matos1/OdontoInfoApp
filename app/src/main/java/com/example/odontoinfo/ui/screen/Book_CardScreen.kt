package com.example.odontoinfo.ui.screen

import android.graphics.Paint
import android.preference.PreferenceActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Card

import com.example.odontoinfo.components.Header
import com.example.odontoinfo.ui.theme.CinzaClaro
import com.example.odontoinfo.ui.theme.Verde
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.odontoinfo.R
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.example.odontoinfo.components.Button_Comeback
import com.example.odontoinfo.components.Button_Foward
import com.example.odontoinfo.ui.theme.Button_Back_Foward_Color

@Composable
fun Carrosel_Cards() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val larguraCard = 280.dp
        val espacamento = 12.dp

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(espacamento),
            contentPadding = PaddingValues(
                start = ((maxWidth - larguraCard) / 2).coerceAtLeast(0.dp),
                end = 16.dp
            )
        ) {
            item {
                Card(
                    Text_card = stringResource(R.string.icdas_carie_0),
                    Color_Card = Verde,
                    Title_Card = "0"
                )
            }

            item {
                Card(
                    Text_card = "Conheça os diferentes níveis de cárie.",
                    Color_Card = Color.Red,
                    Title_Card = "Cáries"
                )
            }

            item {
                Card(
                    Text_card = "Entenda as condições restauradoras.",
                    Color_Card = CinzaClaro,
                    Title_Card = "Restaurações"
                )
            }
        }
    }
}
@Composable
fun Book_CardScreen(
    onClickMenuInformation: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Header()
        Carrosel_Cards()
        Button_Comeback("Voltar", Button_Back_Foward_Color,onClickMenuInformation )
        Button_Foward("Informações Unificadas", Button_Back_Foward_Color,onClickMenuInformation )
    }
}

@Preview(showBackground = true, widthDp = 280, heightDp = 400)
@Composable
fun Book_CardScreenPreview() {
    Book_CardScreen(
        onClickMenuInformation = {}
    )
}