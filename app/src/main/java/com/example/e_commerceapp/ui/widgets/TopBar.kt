package com.example.e_commerceapp.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.ui.screens.shoplist.IconTextButton

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

        @Composable
        fun Main(
            title : String,
            onLogOut : () -> Unit
        ) {
            Row (
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp).padding(horizontal = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(title, fontSize = 32.sp)
                IconTextButton(icon = Icons.AutoMirrored.Filled.Logout, backgroundColor = Color(0xFFffe7b5), text = "Log out", onClick = onLogOut)
            }
        }
    }
}