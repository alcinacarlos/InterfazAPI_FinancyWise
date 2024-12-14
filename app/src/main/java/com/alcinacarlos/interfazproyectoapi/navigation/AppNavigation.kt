package com.alcinacarlos.interfazproyectoapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import com.alcinacarlos.interfazproyectoapi.screens.InitialScreen
import com.alcinacarlos.interfazproyectoapi.screens.LoginScreen
import com.alcinacarlos.interfazproyectoapi.screens.MainScreen
import com.alcinacarlos.interfazproyectoapi.screens.SignInScreen
import com.alcinacarlos.interfazproyectoapi.viewmodel.LoginViewModel


@Composable
fun AppNavigation(){
    val navControlador = rememberNavController()
    val loginViewModel = LoginViewModel()

    NavHost(navController = navControlador, startDestination = AppScreen.InitialScreen.route) {
        composable(AppScreen.InitialScreen.route){
            InitialScreen(navControlador)
        }

        composable(AppScreen.MainScreen.route){
            MainScreen(navControlador, loginViewModel)
        }

        composable(AppScreen.LoginScreen.route){
            LoginScreen(navControlador, loginViewModel)
        }

        composable(AppScreen.SingInScreen.route){
            SignInScreen(navControlador, loginViewModel)
        }

    }
}