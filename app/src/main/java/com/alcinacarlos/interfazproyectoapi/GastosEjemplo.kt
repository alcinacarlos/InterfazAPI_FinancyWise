package com.alcinacarlos.interfazproyectoapi

import com.alcinacarlos.interfazproyectoapi.model.Categoria
import com.alcinacarlos.interfazproyectoapi.model.Gasto
import java.time.LocalDate

object GastosEjemplo {
    val listaGastos = listOf(
        Gasto(150.0, LocalDate.of(2024, 12, 1), Categoria.ALIMENTACION, "Compra en supermercado"),
        Gasto(50.0, LocalDate.of(2024, 12, 2), Categoria.OCIO, "Entrada al cine"),
        Gasto(200.0, LocalDate.of(2024, 12, 5), Categoria.SALUD, "Consulta médica"),
        Gasto(75.0, LocalDate.of(2024, 12, 7), Categoria.REGALOS, "Regalo de cumpleaños"),
        Gasto(300.0, LocalDate.of(2024, 12, 10), Categoria.EDUCACION, "Curso online"),
        Gasto(25.0, LocalDate.of(2024, 12, 3), Categoria.OCIO, "Café con amigos"),
        Gasto(400.0, LocalDate.of(2024, 12, 15), Categoria.ALIMENTACION, "Compra mensual en supermercado"),
        Gasto(120.0, LocalDate.of(2024, 12, 8), Categoria.SALUD, "Medicamentos"),
        Gasto(60.0, LocalDate.of(2024, 12, 12), Categoria.REGALOS, "Decoración navideña"),
        Gasto(80.0, LocalDate.of(2024, 12, 14), Categoria.OCIO, "Cena en restaurante"),
        Gasto(250.0, LocalDate.of(2024, 12, 9), Categoria.EDUCACION, "Libros de texto"),
        Gasto(10.0, LocalDate.of(2024, 12, 4), Categoria.OCIO, "Helado"),
        Gasto(100.0, LocalDate.of(2024, 12, 11), Categoria.SALUD, "Examen médico"),
        Gasto(30.0, LocalDate.of(2024, 12, 6), Categoria.ALIMENTACION, "Desayuno en cafetería"),
        Gasto(500.0, LocalDate.of(2024, 12, 13), Categoria.ALIMENTACION, "Carne y pescado para Navidad"),
        Gasto(45.0, LocalDate.of(2024, 12, 16), Categoria.OCIO, "Boleto de teatro"),
        Gasto(150.0, LocalDate.of(2024, 12, 18), Categoria.REGALOS, "Regalo para los abuelos"),
        Gasto(35.0, LocalDate.of(2024, 12, 19), Categoria.OCIO, "Suscripción de streaming"),
        Gasto(300.0, LocalDate.of(2024, 12, 20), Categoria.EDUCACION, "Clases particulares"),
        Gasto(20.0, LocalDate.of(2024, 12, 21), Categoria.ALIMENTACION, "Merienda con amigos"),
        Gasto(15.0, LocalDate.of(2024, 12, 22), Categoria.OCIO, "Visita al museo"),
        Gasto(220.0, LocalDate.of(2024, 12, 23), Categoria.SALUD, "Terapia física"),
        Gasto(80.0, LocalDate.of(2024, 12, 24), Categoria.REGALOS, "Papel de regalo y tarjetas"),
        Gasto(300.0, LocalDate.of(2024, 12, 25), Categoria.ALIMENTACION, "Cena de Navidad"),
        Gasto(60.0, LocalDate.of(2024, 12, 26), Categoria.OCIO, "Día en la feria"),
        Gasto(400.0, LocalDate.of(2024, 12, 27), Categoria.EDUCACION, "Inscripción a un seminario"),
        Gasto(90.0, LocalDate.of(2024, 12, 28), Categoria.SALUD, "Chequeo odontológico"),
        Gasto(55.0, LocalDate.of(2024, 12, 29), Categoria.REGALOS, "Flores para una ocasión especial"),
        Gasto(250.0, LocalDate.of(2024, 12, 30), Categoria.OCIO, "Entradas para un concierto"),
        Gasto(180.0, LocalDate.of(2024, 12, 31), Categoria.ALIMENTACION, "Cena de fin de año")
    )
}