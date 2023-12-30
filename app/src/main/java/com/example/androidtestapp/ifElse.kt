package com.example.androidtestapp

fun main() {
    ifMultiple()
}

fun ifBasico() {
    val name = "Zoilo"
    if (name == "Pepe") {
        println("IF")
    } else {
        println("name is $name")
    }
}

fun ifMultiple(){
    var age = 18
    var permission = false
    if(age >= 18 && permission){
        println("a tomar cerveza")
    } else{
        println("no puedo")
    }
}

fun ifAnidado() {
    val animal = "asd"
    if(animal== "Dog"){
        println("Es un perro")
    } else if (animal == "Cat"){
        println("es un gato")
    } else if (animal == "Bird"){
    println("es un pajaro")
} else{
    println("no es ninguno de los 3")
    }
}