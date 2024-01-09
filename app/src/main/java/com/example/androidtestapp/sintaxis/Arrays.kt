package com.example.androidtestapp.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays.size)
    println(weekDays[4])
    weekDays[1]="Zoilo"
    println(weekDays[1])

    for (position in weekDays.indices){
        println(weekDays[position])
    }
    for((position,value) in weekDays.withIndex()){
        println("position $position es $value")
    }

    for (day in weekDays){
        println("day es $day")
    }
}