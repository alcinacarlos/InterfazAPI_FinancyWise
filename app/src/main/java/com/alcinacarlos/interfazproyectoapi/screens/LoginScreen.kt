package com.alcinacarlos.interfazproyectoapi.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
