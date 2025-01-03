package com.alcinacarlos.interfazproyectoapi.components.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.alcinacarlos.interfazproyectoapi.R

@Composable
fun MainNavigationBar(
    onItemChanged: (Int) -> Unit,
    index: Int
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        NavigationBar(
            containerColor = colorResource(R.color.principal7)
        ) {
            NavigationBarItem(
                selected = index == 0,
                onClick = {
                    onItemChanged(0)
                },
                colors = colores(),
                icon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Home"
                    )
                },
                label = {
                    Text("Resumen")
                }
            )
            NavigationBarItem(
                selected = index == 1,
                onClick = {
                    onItemChanged(1)
                },
                colors = colores(),
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.ShoppingBag,
                        contentDescription = "Transacciones"
                    )
                },
                label = {
                    Text("Transacciones")
                }
            )
            NavigationBarItem(
                selected = index == 2,
                onClick = {
                    onItemChanged(2)
                },
                colors = colores(),
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.Person,
                        contentDescription = "Perfil"
                    )
                },
                label = {
                    Text("Perfil")
                }
            )
        }
    }
}

@Composable
private fun colores() = NavigationBarItemDefaults.colors(
    indicatorColor = colorResource(R.color.principal4),
    selectedIconColor = colorResource(R.color.white),
    unselectedIconColor = colorResource(R.color.principal3),
    unselectedTextColor = colorResource(R.color.white),
    selectedTextColor = colorResource(R.color.white)
)