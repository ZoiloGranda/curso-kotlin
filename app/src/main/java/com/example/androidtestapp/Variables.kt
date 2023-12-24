package com.example.androidtestapp

fun main() {
    val age:Int = 20
    var age2:Int = 20
    println(age2)
    age2 = 25
    println(age2)
    val example:Long = 9938238123
    val floatExample:Float=10.5F
    val doubleExample:Double = 29.1224
    val charExample:Char ='Z'
    val charExample1:Char ='?'
    val stringExample: String = "zoilo granda"
    val stringExample2: String = "AAAAA"
    val stringExample3: String = "BBBBB"
    val booleanExample: Boolean = false
    println(age + age2)
    println(age - age2)
    println(age + example)
    var exampleSuma = age + example.toInt()
    println(exampleSuma)
    println(stringExample2+stringExample3)
    var stringConcatenada = "Hola me llamo $stringExample"
    println(stringConcatenada)

}