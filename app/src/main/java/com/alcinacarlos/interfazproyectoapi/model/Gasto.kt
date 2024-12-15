package com.alcinacarlos.interfazproyectoapi.model

import java.time.LocalDate

data class Gasto(
    val monto:Double,
    val fecha: LocalDate,
    val categoria: Categoria,
    val comentario:String = ""
)
