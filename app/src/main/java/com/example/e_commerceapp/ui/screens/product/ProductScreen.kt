package com.example.e_commerceapp.ui.screens.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.R
import com.example.e_commerceapp.ui.widgets.BottomBar
import com.example.e_commerceapp.ui.widgets.TopBar


@Preview
@Composable
fun ProductScreen() {

    val price by remember { mutableStateOf("79.99") }

    Scaffold (
        topBar = { TopBar.Product({}, {})},
        bottomBar = { BottomBar.Product(price) {

        } }
    ) { paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = paddingValues.calculateTopPadding(),
                    bottom = paddingValues.calculateBottomPadding()),
            verticalArrangement = Arrangement.Top
        ) {


            Image(
                painter = painterResource(R.drawable.preview_image),
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
                    .height(320.dp)
                    .weight(0.7f)
                    .background(color = Color(0x50888888))
            )
            Column (
                modifier = Modifier.fillMaxWidth().weight(0.3f).padding(horizontal = 15.dp)
            ) {
                Text(
                    "Xbox One Elite Series 2 Controller",
                    fontSize = 30.sp
                )
                Text(
                    "Gaming category",
                    fontSize = 24.sp,
                    modifier = Modifier.alpha(0.6f)
                )
            }


        }
    }


}