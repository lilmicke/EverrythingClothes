package com.example.everythingclothes.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.everythingclothes.ui.theme.Screens.Home.HomeScreen


@Composable
fun AppNavHost(
    modifier : Modifier = Modifier,
    navController:NavHostController= rememberNavController(),
    startDestination:String= HOME_URL

){    NavHost(navController = navController
    ,modifier = Modifier
    ,startDestination = startDestination ){

    composable(HOME_URL){
        HomeScreen(navController = navController)
    }
    composable(ADD_PRODUCTS_URL){
        HomeScreen(navController = navController)
    }
    composable(VIEW_PRODUCTS_URL){
        HomeScreen(navController = navController)
    }
    composable(SIGNUP_URL){
        HomeScreen(navController = navController)
    }
    composable(LOGIN_URL){
        HomeScreen(navController = navController)
    }
}
}