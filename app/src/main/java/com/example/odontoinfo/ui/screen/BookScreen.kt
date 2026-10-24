package com.example.odontoinfo.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Header
import com.example.odontoinfo.components.MenuItemsContainer
import com.example.odontoinfo.models.ItemMenu
import androidx.compose.foundation.layout.fillMaxSize
@Composable
fun BookScreen(
    onBookClick: () -> Unit
) {
    val buttonList = listOf(
        ItemMenu(
            "Classificação CDAS",
            "Book_InformationScreen"
        ),
        ItemMenu(
            "Artigos Relacionados",
            "Book_ReferenceScreen"
        )
    )

    Column (modifier = Modifier.fillMaxSize()) {
        Header()

        MenuItemsContainer(
            itens = buttonList,
            onNavigate = {
                onBookClick()
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BookScreenPreview() {
    BookScreen(
        onBookClick = {}
    )
}