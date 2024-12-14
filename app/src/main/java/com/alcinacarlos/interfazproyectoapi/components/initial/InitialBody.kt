package com.alcinacarlos.interfazproyectoapi.components.initial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alcinacarlos.interfazproyectoapi.R
import com.alcinacarlos.interfazproyectoapi.components.BackButton
import com.alcinacarlos.interfazproyectoapi.components.ImageInitial
import com.alcinacarlos.interfazproyectoapi.components.NextButton
import com.alcinacarlos.interfazproyectoapi.components.PageIndicator
import com.alcinacarlos.interfazproyectoapi.components.SkipButton
import com.alcinacarlos.interfazproyectoapi.navigation.AppScreen
import kotlinx.coroutines.CoroutineScope

@Composable
fun InitialBody(pagerState: PagerState, coroutineScope: CoroutineScope, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
    ) {
        BackButton(pagerState, coroutineScope)
        PageIndicator(pagerState)
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(100.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IntialCentered()
            LoginRegisterButtons(
                iniciarSesion = { navController.navigate(route = AppScreen.LoginScreen.route) },
                registrarse = { navController.navigate(route = AppScreen.SingInScreen.route) }
            )
        }
    }
}

@Composable
fun IntialCentered() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InitialText()
        ImageInitial(R.drawable.moneybag)
        Choose()
    }
}

@Composable
fun InitialText() {
    Text(
        text = stringResource(R.string.signinorlogin),
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = colorResource(R.color.white),
        modifier = Modifier.padding(top = 16.dp, start = 30.dp)
    )
}

@Composable()
fun Choose(){
    Text(
        text = stringResource(R.string.choose),
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = colorResource(R.color.white),
        modifier = Modifier.padding(top = 16.dp, start = 30.dp)
    )
}
@Composable
fun LoginRegisterButtons(iniciarSesion : () -> Unit, registrarse : () -> Unit) {
    Column(
        modifier = Modifier.padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Botón de Iniciar sesión
        Button(
            onClick = { iniciarSesion() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.principal5))
        ) {
            Text(
                text = "Iniciar sesión",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }

        // Botón de Registrarse
        Button(
            onClick = { registrarse() },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.principal5))
        ) {
            Text(
                text = "Registrarse",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
    }
}