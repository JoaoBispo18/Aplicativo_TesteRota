package com.example.aulapam_bispo.ui.theme.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(user: User, navController: NavHostController){
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
        Text(text = "você esta na tela Home", modifier = Modifier.padding(16.dp))

        Text(
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "\"${user.bio}\"",
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Email: ${user.email}",
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 16.sp
        )

        Text(
            text = "Inicio: ${user.registerDate}",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp
        )

        Text(text = "Idade: ${user.age}", modifier = Modifier.padding(top = 4.dp), fontSize = 16.sp)

        }
    }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(
        navController = rememberNavController(),

    )
}
