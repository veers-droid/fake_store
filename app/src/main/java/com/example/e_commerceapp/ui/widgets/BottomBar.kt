package com.example.e_commerceapp.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp

class BottomBar {
    companion object {
        private val rowModifier = Modifier.fillMaxWidth().height(56.dp)
        @Composable
        fun Home() {
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
                IconButton({}) {
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
                        modifier = Modifier.alpha(0.3f)
                    )
                }
            }
        }

        @Composable
        fun Favourite() {
            Row (
                modifier = rowModifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton({}) {
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

                IconButton({}) {
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
            Row (
                modifier = rowModifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                IconButton({}) {
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