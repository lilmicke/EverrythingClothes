package com.example.everythingclothes.ui.theme.Screens.Welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.everythingclothes.R
import com.example.everythingclothes.ui.theme.EverythingClothesTheme

@Composable
fun WelcomeScreen(){
    Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            text = "Welcome to EverythingClothes"
        )
        Column(modifier = Modifier.padding(top = 70.dp)) {
            Image(modifier = Modifier,painter = painterResource(id = R.drawable.picthree), contentDescription = "My pic")
        }
    }


    Row(modifier = Modifier
        .padding(bottom = 20.dp)
        .fillMaxSize(),Arrangement.SpaceEvenly,Alignment.Bottom){

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign Up")
        }
        Button( onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview(){
EverythingClothesTheme {
    WelcomeScreen()
}



}