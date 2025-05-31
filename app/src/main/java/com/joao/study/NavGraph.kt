package com.joao.study

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joao.study.views.SignInScreen
import com.joao.study.views.SignUpScreen


@Composable
fun NavGraph(navController: NavHostController) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "sign_up"
    ) {
        composable("sign_up") {
            SignUpScreen(navController)
        }
        composable("sign_in") {
            SignInScreen(navController)
        }
    }
}