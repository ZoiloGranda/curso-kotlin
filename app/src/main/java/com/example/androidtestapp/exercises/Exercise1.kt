package com.example.androidtestapp.exercises

fun main() {
    var morningNotification = 51
    var eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages >= 100) {
        println("100 o mas")
    } else {
        println("tienes $numberOfMessages notificaciones")
    }
}