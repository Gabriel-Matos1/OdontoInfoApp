package com.example.odontoinfo.components

import android.R
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.odontoinfo.models.ItemMenu
import com.example.odontoinfo.ui.theme.CinzaMuitoClaro

@Composable
fun MenuItemsContainer(
    itens: List<ItemMenu>,
    onNavigate: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 280.dp),
        modifier = modifier
            .fillMaxWidth()
            .background(color = CinzaMuitoClaro),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(itens) { itemMenu ->
            Button(
                onClick = {
                    onNavigate(itemMenu.Route_Item)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = Color.White),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black,

                ),
                border = BorderStroke(1.dp, Color.Red)
            ) {


                Text(text = itemMenu.Text_Item)
                }
        }
    }
}

@Preview(
    name = "Menu - Celular",
    showBackground = true,
    widthDp = 200,
    heightDp = 400

    /*
    * widthDp = 700,
    heightDp =1200
------
*     * widthDp = 1200,
    heightDp =1800

    * */
)
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