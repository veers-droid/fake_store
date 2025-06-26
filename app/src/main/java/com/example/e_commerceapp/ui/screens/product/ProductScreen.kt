package com.example.e_commerceapp.ui.screens.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.e_commerceapp.R
import com.example.e_commerceapp.ui.widgets.DefaultRoundedButton


@Preview
@Composable
fun ProductScreen() {
    Column (
        modifier = Modifier.fillMaxSize(),
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = {}) {
                Icon(
                    Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "back"
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.Favorite,
                    contentDescription = "to Favourite"
                )
            }
        }

        Image(
            painter = painterResource(R.drawable.preview_image),
            contentDescription = null
        )

        Text("Controller")
        Text("Gaming category")

        Row {
            Column {
                Text("price")
                Text("$ 79.99")
            }

            DefaultRoundedButton (title = "Add to cart") {

            }
        }
    }



}