package com.alcinacarlos.interfazproyectoapi.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.alcinacarlos.interfazproyectoapi.components.login.BodyLogin
import com.alcinacarlos.interfazproyectoapi.viewmodel.LoginViewModel

@Composable
fun LoginScreen(navController: NavController, loginViewModel: LoginViewModel) {
    BodyLogin(
        loginViewModel = loginViewModel,
        navController = navController
    )
}
