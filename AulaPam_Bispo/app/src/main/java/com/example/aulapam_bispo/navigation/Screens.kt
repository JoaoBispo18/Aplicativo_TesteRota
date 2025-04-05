package com.example.aulapam_bispo.navigation
import com.example.aulapam_bispo.navigation.Routes.HOME_ROUTE
import com.example.aulapam_bispo.navigation.Routes.LOGIN_ROUTE

sealed class Screens (val route: String){
    object LoginScreen: Screens(LOGIN_ROUTE)
    object HomeScreen: Screens(HOME_ROUTE)
}