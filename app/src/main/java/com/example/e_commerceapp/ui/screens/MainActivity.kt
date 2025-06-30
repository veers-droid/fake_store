package com.example.e_commerceapp.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_commerceapp.R
import com.example.e_commerceapp.navigation.AppNavGraph
import com.example.e_commerceapp.ui.theme.ECommerceAppTheme
import com.example.e_commerceapp.ui.widgets.DefaultRoundedButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ECommerceAppTheme {
                val navController = rememberNavController()
                AppNavGraph(navController)
            }
        }
    }
}

@Composable
fun WelcomePage(navController: NavController) {
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

        DefaultRoundedButton(title = "Login", modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 15.dp)) { navController.navigate("login") }
    }
}

@Composable
fun LoginPage(navController: NavController) {
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize().padding(horizontal = 15.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button({},
            modifier = Modifier.align(alignment = Alignment.Start).padding( top = 15.dp),
            shape = RoundedCornerShape(5.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFFE8ECF4))
        ) {
            Image(painter = painterResource(R.drawable.back_arrow), contentDescription = null)
        }

        Column (modifier = Modifier.fillMaxSize().padding(horizontal = 5.dp), horizontalAlignment = Alignment.CenterHorizontally) {

            Text("Welcome back! Glad to see you, Again!", fontSize = 30.sp, modifier = Modifier.padding(top = 20.dp))

            OutlinedTextField(
                value = name,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
                label = { Text("Enter your name")},
                colors = OutlinedTextFieldDefaults.colors(focusedContainerColor = Color(0xFFE8ECF4), unfocusedContainerColor = Color(0xFFE8ECF4)),
                onValueChange =  { text ->
                name = text
            })

            PasswordField(password, modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) { pass ->
                password = pass
            }

            DefaultRoundedButton("Login", modifier = Modifier.fillMaxWidth().padding( top = 20.dp)) {
                navController.navigate("home")
            }
        }

    }
}

@Composable
fun PasswordField(
    password : String,
    modifier: Modifier = Modifier,
    onPasswordChanged : (String) -> Unit,
) {
    var passwordVisible by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = onPasswordChanged,
        modifier = modifier,
        colors = OutlinedTextFieldDefaults.colors(focusedContainerColor = Color(0xFFE8ECF4), unfocusedContainerColor = Color(0xFFE8ECF4)),
        label = { Text("Enter your password") },
        singleLine = true,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisible)
                Icons.Default.Visibility
            else
                Icons.Default.VisibilityOff

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = image, contentDescription = null)
            }
        }
    )

}
