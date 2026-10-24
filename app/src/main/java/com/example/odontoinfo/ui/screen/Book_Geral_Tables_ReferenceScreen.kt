package com.example.odontoinfo.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odontoinfo.R
import androidx.compose.foundation.layout.height
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Button_Comeback
import com.example.odontoinfo.components.Button_Foward
import com.example.odontoinfo.components.Header
import com.example.odontoinfo.ui.theme.Button_Back_Foward_Color

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!REVISAR INTEIRAMENTE
private data class CodigoIcdas(
    val codigo: Int,
    val descricaoRes: Int
)

@Composable
fun TabelaIcdasScreen(
    OnClickBackInformation: () -> Unit,
    onClickNextCards: () -> Unit

) {

    val restauracoes = listOf(
        CodigoIcdas(0, R.string.icdas_restauracao_0),
        CodigoIcdas(1, R.string.icdas_restauracao_1),
        CodigoIcdas(2, R.string.icdas_restauracao_2),
        CodigoIcdas(3, R.string.icdas_restauracao_3),
        CodigoIcdas(4, R.string.icdas_restauracao_4),
        CodigoIcdas(5, R.string.icdas_restauracao_5),
        CodigoIcdas(6, R.string.icdas_restauracao_6),
        CodigoIcdas(7, R.string.icdas_restauracao_7),
        CodigoIcdas(8, R.string.icdas_restauracao_8)
    )

    val caries = listOf(
        CodigoIcdas(0, R.string.icdas_carie_0),
        CodigoIcdas(1, R.string.icdas_carie_1),
        CodigoIcdas(2, R.string.icdas_carie_2),
        CodigoIcdas(3, R.string.icdas_carie_3),
        CodigoIcdas(4, R.string.icdas_carie_4),
        CodigoIcdas(5, R.string.icdas_carie_5),
        CodigoIcdas(6, R.string.icdas_carie_6)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F8FA))
    ) {

        Header()

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {

            Text(
                text = "Classificação ICDAS",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF252525)
            )

            TabelaIcdas(
                titulo = "Primeiro código",
                subtitulo = "Condição restauradora",
                codigos = restauracoes
            )

            TabelaIcdas(
                titulo = "Segundo código",
                subtitulo = "Severidade da cárie",
                codigos = caries
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button_Comeback("Voltar", Button_Back_Foward_Color, OnClickBackInformation)
            Button_Foward("CARDS", Button_Back_Foward_Color, OnClickBackInformation)
        }
    }
}


@Composable
private fun TabelaIcdas(
    titulo: String,
    subtitulo: String,
    codigos: List<CodigoIcdas>
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF252525)
            )

            Text(
                text = subtitulo,
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF666666)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0xFFE0E0E0),
                    shape = RoundedCornerShape(10.dp)
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {

            // Cabeçalho da tabela
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE8F5E9))
                    .padding(vertical = 12.dp, horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Código",
                    modifier = Modifier.width(72.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF2E7D32)
                )

                Text(
                    text = "Descrição",
                    modifier = Modifier.weight(1f),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFF2E7D32)
                )
            }

            codigos.forEachIndexed { index, item ->

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            if (index % 2 == 0) {
                                Color.White
                            } else {
                                Color(0xFFF7F9F7)
                            }
                        )
                        .padding(
                            horizontal = 12.dp,
                            vertical = 14.dp
                        ),
                    verticalAlignment = Alignment.Top
                ) {

                    Text(
                        text = item.codigo.toString(),
                        modifier = Modifier.width(72.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF2E7D32)
                    )

                    Text(
                        text = stringResource(item.descricaoRes),
                        modifier = Modifier.weight(1f),
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        color = Color(0xFF333333)
                    )
                }

                if (index < codigos.lastIndex) {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = Color(0xFFEAEAEA)
                    ) {
                        androidx.compose.foundation.layout.Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(1.dp)
                        )
                    }
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun TableScreenPreview(){
    TabelaIcdasScreen(OnClickBackInformation = {}, onClickNextCards = {})

}