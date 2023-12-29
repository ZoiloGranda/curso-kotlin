package com.example.androidtestapp

fun main() {
    variablesNumericas()
    showMyAge(currentAge = 33)
    add(firstNumber = 25, secondNumber = 25)
    showMyName(name = "Zoilo Granda")
    val myResta = restar(firstNumber = 10, secondNumber = 5)
    println(myResta)
    val charExample:Char ='Z'
    val charExample1:Char ='?'
    val stringExample: String = "zoilo granda"
    val stringExample2: String = "AAAAA"
    val stringExample3: String = "BBBBB"
    println(stringExample2+stringExample3)
    var stringConcatenada = "Hola me llamo $stringExample"
    println(stringConcatenada)
}

fun showMyName(name:String){
    println("my name is $name")
}

fun add(firstNumber: Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

fun restar(firstNumber: Int, secondNumber: Int):Int{
    return firstNumber - secondNumber
}

fun showMyAge(currentAge:Int){
    println("Tengo $currentAge años")
}

fun variablesNumericas(){
    val age:Int = 20
    var age2:Int = 20
    println(age2)
    age2 = 25
    println(age2)
    val example:Long = 9938238123
    val floatExample:Float=10.5F
    val doubleExample:Double = 29.1224
    println(age + age2)
    println(age - age2)
    println(age + example)
    var exampleSuma = age + example.toInt()
    println(exampleSuma)
}

fun variablesBoolean(){
    val booleanExample: Boolean = false
    println(booleanExample)
}