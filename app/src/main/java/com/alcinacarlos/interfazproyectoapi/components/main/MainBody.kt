package com.alcinacarlos.interfazproyectoapi.components.main

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alcinacarlos.interfazproyectoapi.GastosEjemplo
import com.alcinacarlos.interfazproyectoapi.R
import com.alcinacarlos.interfazproyectoapi.model.NavigationItem
import com.alcinacarlos.interfazproyectoapi.viewmodel.LoginViewModel
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainBody(loginViewModel: LoginViewModel){
    val snackBarHostState = remember { SnackbarHostState() }
    val coroutineScope  = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = colorResource(R.color.principal8),
            ) {
                val navigationItems = listOf(
                    NavigationItem(
                        title = "Resumen",
                        selectedIcon = Icons.Default.Home,
                        unselectedIcon = Icons.Outlined.Home
                    ),
                    NavigationItem(
                        title = "Transacciones",
                        selectedIcon = Icons.Default.ShoppingBag,
                        unselectedIcon = Icons.Outlined.ShoppingBag
                    ),
                    NavigationItem(
                        title = "Perfil",
                        selectedIcon = Icons.Default.AccountCircle,
                        unselectedIcon = Icons.Outlined.AccountCircle
                    ),
                    NavigationItem(
                        title = "Sobre nosotros",
                        selectedIcon = Icons.Default.Info,
                        unselectedIcon = Icons.Outlined.Info
                    ),
                    NavigationItem(
                        title = "Ajustes",
                        selectedIcon = Icons.Default.Settings,
                        unselectedIcon = Icons.Outlined.Settings
                    )
                )
                Row(
                    modifier = Modifier
                        .width(230.dp)
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Menú",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                }

                HorizontalDivider(modifier = Modifier.width(235.dp), thickness = 1.dp)
                Spacer(modifier = Modifier.height(20.dp))
                navigationItems.forEachIndexed {index, item ->
                    NavigationDrawerItem(
                        label = {
                            Text(text = item.title)
                        },
                        selected = index == selectedItemIndex,
                        onClick = {
                            selectedItemIndex = index
                            coroutineScope.launch {
                                drawerState.close()
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == selectedItemIndex) {
                                    item.selectedIcon
                                } else item.unselectedIcon,
                                contentDescription = item.title
                            )
                        },
                        badge = {
                            item.badgeCount?.let {
                                Text(item.badgeCount.toString())
                            }
                        },
                        modifier = Modifier
                            .padding(horizontal = 10.dp, vertical = 3.dp)
                            .width(210.dp),
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = colorResource(R.color.principal2),
                            unselectedContainerColor = colorResource(R.color.principal4),
                            selectedTextColor = colorResource(R.color.black),
                            unselectedTextColor = colorResource(R.color.black),
                            unselectedIconColor = colorResource(R.color.black),
                            selectedIconColor = colorResource(R.color.black)
                        )
                    )
                }

            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            topBar = {
                MainTopAppBar {
                    coroutineScope.launch { drawerState.open() }
                }
            },
            bottomBar = { MainNavigationBar(index= selectedItemIndex ,onItemChanged = { selectedItemIndex = it }) },
            snackbarHost = {
                SnackbarHost(
                    hostState = snackBarHostState,
                    snackbar = {
                        Snackbar(
                            snackbarData = it,
                        )
                    }
                )
            }
        ) {
            SelectecScreen(selectedItemIndex, loginViewModel)
        }
    }
}

@Composable
fun SelectecScreen(selectedItemIndex:Int , loginViewModel:LoginViewModel){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 110.dp)
            .background(colorResource(R.color.background)),
        contentAlignment = Alignment.Center
    ) {
        when(selectedItemIndex){
            0 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Resumen", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "${loginViewModel.email.value}")
                    Text("/usuario/{id}")
                    Text("/gastos/{usuarioid}")
                    Text("/ingresos/{usuarioid}")
                    GastoList(GastosEjemplo.listaGastos)
                }
            }
            1 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Transacciones", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text("/usuario/{id}")
                    Text("/gastos/{usuarioid}")
                    Text("/ingresos/{usuarioid}")
                    GastoList(GastosEjemplo.listaGastos)
                }
            }
            2 -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Perfil", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "${loginViewModel.email.value}")
                    Text("/usuario/{id}")
                    Perfil(loginViewModel)
                }

            }
            3 -> {
                Column(
                    modifier = Modifier.padding(30.dp)
                ) {
                    Text(text = "Sobre Nosotros", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                    Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                }
            }
            4 -> {
                Text(text = "Ajustes", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}




