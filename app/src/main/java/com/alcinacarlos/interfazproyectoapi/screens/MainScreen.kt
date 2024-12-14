package com.alcinacarlos.interfazproyectoapi.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.alcinacarlos.interfazproyectoapi.components.main.MainBody
import com.alcinacarlos.interfazproyectoapi.viewmodel.LoginViewModel

@Composable
fun MainScreen(navController: NavController, loginViewModel: LoginViewModel) {
    MainBody(loginViewModel)
}