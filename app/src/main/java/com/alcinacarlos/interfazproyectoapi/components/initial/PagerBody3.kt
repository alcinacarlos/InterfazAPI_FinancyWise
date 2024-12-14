package com.alcinacarlos.interfazproyectoapi.components.initial


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.alcinacarlos.interfazproyectoapi.components.BackButton
import com.alcinacarlos.interfazproyectoapi.components.ImageInitial
import com.alcinacarlos.interfazproyectoapi.components.NextButton
import com.alcinacarlos.interfazproyectoapi.components.PageIndicator
import com.alcinacarlos.interfazproyectoapi.components.SkipButton
import kotlinx.coroutines.CoroutineScope

@Composable
fun PagerBody3(pagerState: PagerState, coroutineScope: CoroutineScope) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
    ) {
        SkipButton(pagerState, coroutineScope)
        TrackingCentered()
        BackButton(pagerState, coroutineScope)
        NextButton(pagerState, coroutineScope)
        PageIndicator(pagerState)
    }
}

@Composable
fun TrackingCentered() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImageInitial(R.drawable.tracking)
        TrackingText()
    }
}

@Composable
fun TrackingText() {
    Text(
        text = stringResource(R.string.tracking),
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = colorResource(R.color.white),
        modifier = Modifier.padding(top = 16.dp, start = 30.dp)
    )
}
