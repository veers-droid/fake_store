package com.example.e_commerceapp.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.navigation.LocalNavController

class BottomBar {
    companion object {
        private val rowModifier = Modifier.fillMaxWidth().height(56.dp)

        @Composable
        fun Product(price : String, onAddToCart : () -> Unit) {
            Row (
                modifier = Modifier.fillMaxWidth().height(80.dp).background(color = Color(0xFFFFE8B2)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(all = 15.dp)
                ) {
                    Text(
                        "price",
                        fontSize = 16.sp,
                        modifier = Modifier.align(Alignment.Start).padding(bottom = 5.dp).alpha(0.6f),
                    )
                    Text(
                        "$$price",
                        fontSize = 22.sp
                    )
                }

                DefaultRoundedButton (
                    title = "Add to cart",
                    modifier = Modifier.fillMaxWidth().padding(all = 5.dp),
                    onClick = onAddToCart
                )
            }
        }

        @Composable
        fun Home() {
            val navController = LocalNavController.current
            Row (
                modifier = rowModifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton({}) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        "Home",
                    )
                }
                IconButton({
                    navController.navigate("wishlist")
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Favorite,
                        "Favourite",
                        modifier = Modifier.alpha(0.3f)
                    )
                }
                IconButton({
                    navController.navigate("cart")
                }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingBag,
                        "Shopping Bag",
                        modifier = Modifier.alpha(0.3f)
                    )
                }
            }
        }

        @Composable
        fun Favourite() {
            val navController = LocalNavController.current
            Row (
                modifier = rowModifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton({
                    navController.navigate("home")
                }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        "Home",
                        modifier = Modifier.alpha(0.3f)
                    )
                }

                IconButton({}) {
                    Icon(
                        imageVector = Icons.Outlined.Favorite,
                        "Favourite",
                    )
                }

                IconButton({
                    navController.navigate("cart")
                }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingBag,
                        "Shopping Bag",
                        modifier = Modifier.alpha(0.3f)
                    )
                }

            }
        }

        @Composable
        fun ShoppingBag() {
            val navController = LocalNavController.current
            Row (
                modifier = rowModifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton({
                    navController.navigate("home")
                }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        "Home",
                        modifier = Modifier.alpha(0.3f)
                    )
                }

                IconButton({
                    navController.navigate("wishlist")
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Favorite,
                        "Favourite",
                        modifier = Modifier.alpha(0.3f)
                    )
                }

                IconButton({}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingBag,
                        "Shopping Bag",
                    )
                }

            }
        }
    }
}