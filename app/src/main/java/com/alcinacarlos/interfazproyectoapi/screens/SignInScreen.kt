package com.alcinacarlos.interfazproyectoapi.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.alcinacarlos.interfazproyectoapi.components.signin.BodySignIn
import com.alcinacarlos.interfazproyectoapi.viewmodel.LoginViewModel

@Composable
fun SignInScreen(navController: NavController, loginViewModel: LoginViewModel) {
    BodySignIn(
        loginViewModel = loginViewModel,
        navController = navController
    )
}
