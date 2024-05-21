package org.example.demo.locale

import java.text.NumberFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Convertimos LocalDateTime en una cadena de texto con un formato especifíco.
 * @return Devuelve una representación formateada en texto de la fecha y hora.
 * @since 1.0
 * @author Raúl Fernández, Javier Hernández, Samuel Cortés, Yahya El Hadri
 */

fun LocalDate.toDefaultDateTimeString():String{
    return DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault()).format(this)
}

/**
 * Convertimos un valor 'Double' en una cadena de texto formateada como una cantidad de dinero de dinero en la moneda indicada en el sistema.
 * @return Devuelve una representación formateada en texto del valor 'Double'.
 * @since 1.0
 * @author Raúl Fernández, Javier Hernández, Samuel Cortés, Yahya El Hadri
 */

fun Double.toDefaultMoneyString():String{
    return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(this)
}