package com.example.odontoinfo.ui.screen


import android.content.ClipData
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Header
import com.example.odontoinfo.components.MenuItemsContainer
import com.example.odontoinfo.components.Text_SubTitle_Style
import com.example.odontoinfo.models.ItemMenu
import com.example.odontoinfo.ui.screen.BookScreen
import androidx.compose.ui.res.stringResource
import com.example.odontoinfo.R

@Composable
fun HomeScreen(
    onHomeClick: () -> Unit,
    onBookClick: () -> Unit,
    onQuizHomeClick: () -> Unit
) {

    val Button_session_3D = listOf(
        ItemMenu(Text_Item = "Conjuntos Completos", "ConjuntoCompletoScreen"),
        ItemMenu("DentesUnitarios", "DentesUnitariosScreen")
    )
    val Button_Session_information = listOf(
        ItemMenu(Text_Item = "InformaçãoSobre CDAS", "CDAS_Screen"),
        ItemMenu(Text_Item = "Informação sobre Caries Geral", Route_Item = "InfoCariesGeralScreen")
    )
    val Button_Session_Quiz = listOf(
        ItemMenu(Text_Item = "Quiz Rapido", "QuizFastScreen"),
        ItemMenu(Text_Item = "Quiz Por Tempo Definido", Route_Item = "QuizTimeScreen")
    )
    Column(modifier = Modifier.fillMaxWidth()) {
        Header()
        Text_SubTitle_Style(stringResource(R.string.sessao_3D))
        MenuItemsContainer(Button_session_3D, onNavigate = {})
        Text_SubTitle_Style(stringResource(R.string.sessao_Book))
        MenuItemsContainer(Button_Session_information, onNavigate = {})
        Text_SubTitle_Style(stringResource(R.string.sessao_Quiz))
        MenuItemsContainer(Button_Session_Quiz, onNavigate = {})
    }
}

@Preview(showBackground = true, widthDp = 800)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        onHomeClick = {},
        onBookClick = {},
        onQuizHomeClick = {}
    )
}