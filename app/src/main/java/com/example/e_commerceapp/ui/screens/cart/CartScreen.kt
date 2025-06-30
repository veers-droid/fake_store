package com.example.e_commerceapp.ui.screens.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSwipeToDismissBoxState
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
import com.example.e_commerceapp.ui.widgets.TopBar


@Preview
@Composable
fun CartScreen() {


    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { TopBar.Main("Cart") { } }, bottomBar = {BottomBar.ShoppingBag()}) { paddingValues ->


        LazyColumn (
            modifier = Modifier.fillMaxWidth().padding(top = paddingValues.calculateTopPadding()),
        ) {
            items(3) {
                CartItem(
                    "",
                    "“Awaken, My Love!”",
                    "19.99",
                    {},
                    {}
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartItem(
    image : String,
    name : String,
    price : String,
    onUpdateQuantity : () -> Unit,
    onRemove : () -> Unit
) {

    val dismissState = rememberSwipeToDismissBoxState(
    )

    SwipeToDismissBox(
        state = dismissState,
        modifier = Modifier.padding(top = 25.dp),
        backgroundContent = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .padding(horizontal = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                IconButton(
                    onClick = onRemove
                ) {
                    Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete",
                    tint = Color.White
                ) }
            }
        }
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.preview_image),
                null,
                modifier = Modifier.height(80.dp).width(80.dp),
                contentScale = ContentScale.Inside)
            Text(name)
            Text(price)
        }
    }
}

