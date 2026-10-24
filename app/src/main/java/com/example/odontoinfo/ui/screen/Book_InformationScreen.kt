package com.example.odontoinfo.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Header
import com.example.odontoinfo.components.MenuItemsContainer
import com.example.odontoinfo.models.ItemMenu

@Composable
fun Book_InformationScreen(
    onBookInformationClick: () -> Unit
){

        val buttonList = listOf(
            ItemMenu(
                "Cards",
                "Book_CardScreen"
            ),
            ItemMenu(
                "tabelas gerais",
                "Book_Geral_Tables_ReferenceScreen"
            )
        )

        Column (modifier = Modifier.fillMaxSize()) {
            Header()

            MenuItemsContainer(
                itens = buttonList,
                onNavigate = {
                    onBookInformationClick()
                }
            )
        }
        //cards com informação de cada um
        //geral
}


@Preview(showBackground = true)
@Composable
fun Book_InformationScreenPreview(){
    Book_InformationScreen(
        onBookInformationClick = {}
    )
}