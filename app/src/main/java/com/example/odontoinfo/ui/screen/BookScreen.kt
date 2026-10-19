package com.example.odontoinfo.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.odontoinfo.components.Header
import com.example.odontoinfo.components.MenuItemsContainer
import com.example.odontoinfo.models.ItemMenu

@Composable
fun BookScreen(
    onBookClick: () -> Unit
) {
    val buttonList = listOf(
        ItemMenu(
            "Ir para mais Informações",
            "MaisInformacoesScreen"
        ),
        ItemMenu(
            Text_Item = "texte",
            Route_Item = "texteScreen"
        )
    )

    Column {
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