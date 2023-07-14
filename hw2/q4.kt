package com.selcukoner.homeworks.hw2

fun main() = runPrintPattern()

fun runPrintPattern()
{
    println("Enter height:")
    var height = readln().toInt()
    println("Enter width:")
    var width = readln().toInt()

    printPattern(height, width)
}

fun printPattern(height:Int, width:Int)
{
    var up:Boolean = true
    var upDownCounter =1

    for (row in 1..height){
        print("|")
        for (column in  1..width){
            if (upDownCounter == column) print("*") else print(" ")
        }
        println("|")

        if (upDownCounter == width) up = false
        if (upDownCounter == 1) up = true
        if (up) upDownCounter++ else upDownCounter--
    }
}