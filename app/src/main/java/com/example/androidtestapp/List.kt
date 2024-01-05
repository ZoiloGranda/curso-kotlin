package com.example.androidtestapp

fun main() {
    //inmutableList()
    mutableList()
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add("ZoiloDay")
    println(weekDays)
    weekDays.add(0, "PrimerDay")
    println(weekDays)
    if (weekDays.isEmpty()) {

    } else {
        weekDays.forEach { println(it) }
    }
    for (item in weekDays){
        println(" un item $item")
    }
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly)
    println(readOnly.last())
    println(readOnly.first())
    val example = readOnly.filter { it.contains("a") }
    println(example)
    readOnly.forEach { weekDay -> println(weekDay) }
}