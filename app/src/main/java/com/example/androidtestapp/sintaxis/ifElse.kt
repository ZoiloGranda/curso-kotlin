package com.example.androidtestapp.sintaxis

fun main() {
    getMonth(5)
    getTrimestre(9)
    getSemestre(1)
    result(10)
}

fun result(value:Any){
    when(value){
        is Int -> println("int $value")
        is String -> println("es string $value")
        is Boolean -> println("un boolean $value")
    }
}


fun getSemestre(month:Int){
    when(month){
        in 1..6 -> println("primero")
        in 7..12 -> println("segundo")
        !in 1..12 -> println("no valido")
    }
}

fun getTrimestre(month:Int){
    when(month){
        1,2,3 -> println("primero")
        4,5,6 -> println("segundo")
        7,8,9 -> println("tercero")
        10,11,12 -> println("cuarto")
        else -> println("no valido")
    }
}

fun getMonth(month:Int){
when(month){
    1 -> println("enero")
    2 -> println("febrero")
    3 -> println("marzo")
    4 -> println("abril")
    5 -> println("mayo")
    6 -> println("junio")
    7 -> println("julio")
    8 -> println("ago")
    9 -> println("sep")
    10 -> println("oct")
    11-> println("nov")
    12 -> println("dic")
    else -> println("no valido")
}
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