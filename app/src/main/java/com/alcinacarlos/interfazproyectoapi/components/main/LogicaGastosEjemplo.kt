package com.alcinacarlos.interfazproyectoapi.components.main


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.alcinacarlos.interfazproyectoapi.model.Gasto

@Composable
fun GastoList(gastos: List<Gasto>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(gastos) { gasto ->
            GastoItem(gasto)
            HorizontalDivider()
        }
    }
}

@Composable
fun GastoItem(gasto: Gasto) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Image(
            painter = painterResource(id = gasto.categoria.icon),
            contentDescription = gasto.categoria.name,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "${gasto.categoria.name}: \$${gasto.monto}",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = gasto.fecha.toString(),
                style = MaterialTheme.typography.bodySmall
            )
            if (gasto.comentario.isNotEmpty()) {
                Text(
                    text = gasto.comentario,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}