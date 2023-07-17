package com.selcukoner.homeworks.hw4

fun main() = foo()

private fun foo(){
    var min = 0
    var max = 0
    var average = 0.0
    var counter = 0.0
    var sum = 0

    do {
        println("Do you want to enter a new value : 1(Yes), 0(No) ")
        var choice = readln().toInt()

        if (choice ==1){
            println("Enter a number between [0 - 100]")
            var num = readln().toInt()

            while(num > 100 || num < 0){
                println("You entered invalid value \n Enter a new value:")
                num = readln().toInt()
            }

            counter++
            if(counter == 1.0){
                min = num
                max = num
            }

            if (num <= min)
                min = num

            if(num >= max)
                max = num

            sum += num
            average = sum / counter

        }
    }while (choice == 1)

    println("You entered ${counter.toInt()} number of values")
    println("Max: $max")
    println("Min: $min")
    println("Average: $average")
}