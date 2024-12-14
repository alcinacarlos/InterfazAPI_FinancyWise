package com.alcinacarlos.interfazproyectoapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alcinacarlos.interfazproyectoapi.navigation.AppNavigation
import com.alcinacarlos.interfazproyectoapi.ui.theme.InterfazProyectoAPITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InterfazProyectoAPITheme {
                AppNavigation()
            }
        }
    }
}
