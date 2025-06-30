package com.example.e_commerceapp.ui.screens.shoplist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.e_commerceapp.models.ShopItemResponse
import com.example.e_commerceapp.ui.widgets.BottomBar
import com.example.e_commerceapp.ui.widgets.TopBar


@Composable
fun ShopListScreen(navController: NavController) {
    val userName by remember { mutableStateOf("veers") }
    Scaffold (modifier = Modifier.fillMaxSize(), bottomBar = { BottomBar.Home() }, topBar = {TopBar.Main("Welcome, \n $userName") {

    }}) { paddingValues ->

        val goods = listOf(1, 2, 3)

        Column (
            modifier = Modifier.fillMaxSize().padding(horizontal = 15.dp)
                .padding(top = paddingValues.calculateTopPadding()),
        ) {

            Text("Fake Store", fontSize = 28.sp, modifier = Modifier.padding(top = 40.dp))

            LazyColumn (
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(goods.size) { index ->
                    ShopItem(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp).background(color = Color.Black.copy(alpha = 0.05f)),
                        item = ShopItemResponse("", "mockTitle", 12.0f, "mock description", "Mock category", "mock Image")
                    ) {

                    }
                }
            }
        }
    }
}

@Composable
fun ShopItem(
    modifier: Modifier = Modifier,
    item : ShopItemResponse,
    onLike : () -> Unit
) {
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            imageVector = Icons.Default.Image,
            contentDescription = null,
            modifier = Modifier.fillMaxHeight()
        )

        Column {
            Text(
                item.title
            )
            Text(
                item.subtitle
            )
            Text(
                "\$ ${item.price}",
            )
        }

        IconButton(
            onClick = onLike
        ) {
            Icon(Icons.Outlined.Favorite, null)
        }
    }
}


@Composable
fun IconTextButton(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFE8ECF4),
    onClick: () -> Unit,
) {
    Column {
        IconButton(
            onClick = onClick,
            modifier = modifier,
            colors = IconButtonDefaults.iconButtonColors(containerColor = backgroundColor)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black
            )
        }

        Text(
            text = text,
            color = Color.Black
        )
    }
}
