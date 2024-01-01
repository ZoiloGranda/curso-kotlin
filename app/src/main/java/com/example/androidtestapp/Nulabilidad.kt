package com.example.androidtestapp

fun main(){
    var name: String? = "zoilo"
    println(name?.get(0) ?: "es nulo")
}