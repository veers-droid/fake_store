package com.example.e_commerceapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.e_commerceapp.ui.screens.LoginPage
import com.example.e_commerceapp.ui.screens.WelcomePage
import com.example.e_commerceapp.ui.screens.cart.CartScreen
import com.example.e_commerceapp.ui.screens.product.ProductScreen
import com.example.e_commerceapp.ui.screens.shoplist.ShopListScreen
import com.example.e_commerceapp.ui.screens.wishlist.WishListScreen



val LocalNavController = staticCompositionLocalOf<NavHostController> {
    error("NavController not provided")
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    CompositionLocalProvider(LocalNavController provides navController) {
        NavHost(
            navController = navController,
            startDestination = "welcome"
        ) {
            composable("welcome") { WelcomePage() }
            composable("login") { LoginPage() }
            composable("home") { ShopListScreen() }
            composable("cart") { CartScreen() }
            composable("wishlist") { WishListScreen() }
            composable("product_details") { ProductScreen() }
        }
    }

}