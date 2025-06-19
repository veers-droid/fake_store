package com.example.e_commerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.ui.theme.ECommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ECommerceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    WelcomePage()
                }
            }
        }
    }
}

@Composable
fun WelcomePage() {
    Image(
        painter = painterResource(R.drawable.welcome_page_image),
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        Image(
            modifier = Modifier.padding(top = 100.dp),
            painter = painterResource(R.drawable.fingerprint),
            contentDescription = null,

            )
        Text(
            color = Color.Black,
            modifier = Modifier.padding(top = 20.dp),
            fontSize = 22.sp,
            text = "Fake Store")

        Button({

        },
            modifier = Modifier.padding(top = 30.dp),
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Login", color = Color.White)
        }
    }


}