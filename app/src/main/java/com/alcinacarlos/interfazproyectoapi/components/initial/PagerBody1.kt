package com.alcinacarlos.interfazproyectoapi.components.initial


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alcinacarlos.interfazproyectoapi.R
import com.alcinacarlos.interfazproyectoapi.components.ImageInitial
import com.alcinacarlos.interfazproyectoapi.components.NextButton
import com.alcinacarlos.interfazproyectoapi.components.PageIndicator
import com.alcinacarlos.interfazproyectoapi.components.SkipButton
import kotlinx.coroutines.CoroutineScope

@Composable
fun PagerBody1(pagerState: PagerState, coroutineScope: CoroutineScope) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
    ) {
        SkipButton(pagerState, coroutineScope)
        ContentCentered()
        NextButton(pagerState, coroutineScope)
        PageIndicator(pagerState)
    }
}

@Composable
fun ContentCentered() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImageInitial(R.drawable.logo)
        WelcomeText()
        AppNameText()
    }
}

@Composable
fun WelcomeText() {
    Text(
        text = stringResource(R.string.welcome),
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = colorResource(R.color.white),
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable
fun AppNameText() {
    Row(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = colorResource(R.color.white)
        )
        Text(
            text = stringResource(R.string.app_name2),
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = colorResource(R.color.white)
        )
    }
}
