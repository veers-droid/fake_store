package com.example.e_commerceapp.ui.screens.wishlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerceapp.R
import com.example.e_commerceapp.ui.widgets.BottomBar
import com.example.e_commerceapp.ui.widgets.DefaultRoundedButton
import com.example.e_commerceapp.ui.widgets.TopBar


@Preview
@Composable
fun WishListScreen() {

    Scaffold (
        topBar = {TopBar.Main("Wishlist") { }},
        bottomBar = {BottomBar.Favourite()}
    ) { paddingValues ->
        LazyColumn (
            modifier = Modifier.fillMaxSize().padding(top = paddingValues.calculateTopPadding())
        ) {
            items(3) {
                WishListItem(
                    title = "“Awaken, My Love!”",
                    price = "19.99",
                    image = "",
                    {},
                    {}
                )
            }
        }
    }
}

@Composable
fun WishListItem (title : String, price : String, image : String, onAddToCart : () -> Unit, onDisLike : () -> Unit) {

    Row (
        modifier = Modifier.fillMaxWidth().background(color = Color(0x1000000D)).padding(bottom = 10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.preview_image),
            null,
            modifier = Modifier.height(80.dp).width(80.dp),
            contentScale = ContentScale.Inside)

        Column () {

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    title
                )

                IconButton(
                    onDisLike
                ) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        null,
                    )
                }
            }

            Text(
                "$$price"
            )

            DefaultRoundedButton(
                "Add to cart",
                modifier = Modifier.fillMaxWidth(),
                buttonColor = Color.White,
                textColor = Color.Black,
                onClick = onAddToCart
            )

        }
    }
}

