package com.example.e_commerceapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.e_commerceapp.ui.screens.LoginPage
import com.example.e_commerceapp.ui.screens.WelcomePage
import com.example.e_commerceapp.ui.screens.cart.CartScreen
import com.example.e_commerceapp.ui.screens.product.ProductScreen
import com.example.e_commerceapp.ui.screens.shoplist.ShopListScreen
import com.example.e_commerceapp.ui.screens.wishlist.WishListScreen

@Composable
fun AppNavGraph(navController: NavHostController,) {

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