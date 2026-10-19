package com.example.odontoinfo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.odontoinfo.models.ItemMenu
import com.example.odontoinfo.ui.theme.CinzaMuitoClaro

@Composable
fun MenuItemsContainer(
    itens: List<ItemMenu>,
    onNavigate: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(CinzaMuitoClaro)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itens.forEach { itemMenu ->
            Button(
                onClick = {
                    onNavigate(itemMenu.Route_Item)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = itemMenu.Text_Item)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuItensContainerPreview() {
    val itensPreview = listOf(
        ItemMenu(
            Text_Item = "Página 3D",
            Route_Item = "Home3D"
        ),
        ItemMenu(
            Text_Item = "Informações",
            Route_Item = "ExplorarScreen"
        ),
        ItemMenu(
            Text_Item = "Quiz",
            Route_Item = "QuizHomeScreen"
        )
    )

    MenuItemsContainer(
        itens = itensPreview,
        onNavigate = {}
    )
}