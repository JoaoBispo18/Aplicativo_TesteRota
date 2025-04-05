package com.example.aulapam_bispo.navigation

import android.os.Build.USER
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.aulapam_bispo.ui.theme.screen.LoginScreen
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.LoginScreen.route){
        composable(route = Screens.LoginScreen.route){
            LoginScreen(navController = navController)
        }

        composable(route = Screens.HomeScreen.route, arguments = listOf(
            navArgument(USER){
                defaultValue = ""
                nullable = true
            }
        )){
            HomeRoute(userName = it.arguments?.getString(USER)?: "")
        }
    }
}