package com.example.everythingclothes.ui.theme.Screens.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.everythingclothes.navigation.ADD_PRODUCTS_URL
import com.example.everythingclothes.navigation.VIEW_PRODUCTS_URL


@Composable
fun HomeScreen(navController:NavController){
    Column(modifier = Modifier.fillMaxSize()) {
      Button(onClick = { navController.navigate(ADD_PRODUCTS_URL) }) {
         Text(text = "Add Products")
      }
        Button(onClick = { navController.navigate(VIEW_PRODUCTS_URL) }) {
         Text(text = "View Products")
        }
        
    }
}