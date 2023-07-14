package com.selcukoner.homeworks.hw2

fun main() = runPrintDuration()

fun runPrintDuration()
{
    println("Enter duration in seconds:")
    val duration = readln().toLong()
    printDuration(duration)
}

fun printDuration(duration : Long)
{
    var temp = duration

    var seconds= temp % 60
    temp = temp /60
    var minutes = temp % 60
    temp = temp/60
    var hours =temp % 60

    if (hours != 0L)
        println("hours: $hours")
    if (minutes != 0L)
        println("minutes: $minutes")
    if (seconds != 0L)
        println("seconds: $seconds")

    return
}