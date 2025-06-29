package com.example.e_commerceapp.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class TopBar {
    companion object {
        @Composable
        fun Product(onBack : () -> Unit, onFavourite : () -> Unit) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = onBack) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "back"
                    )
                }

                IconButton(onClick = onFavourite) {
                    Icon(
                        Icons.Outlined.Favorite,
                        contentDescription = "to Favourite"
                    )
                }
            }
        }
    }
}