package com.example.aulapam_bispo.navigation

import androidx.compose.runtime.Composable
import com.example.aulapam_bispo.data.User
import com.example.aulapam_bispo.data.getUserData
import com.example.aulapam_bispo.ui.theme.screen.HomeScreen

@Composable
fun HomeRoute(userName: String){
    val user: User = getUserData(userName = userName)

    HomeScreen(user = user)
}