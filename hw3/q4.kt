package com.selcukoner.homeworks.hw3

fun main() = runIsFactorian()
private fun runIsFactorian()
{
    var number = 1
    while (number < 100000){
        if(isFactorian(number))
            println("$number ")
        number++
    }
}
private fun isFactorian(number: Int): Boolean
{
    var temp = number
    var sumOfFactorialOfDigits = 0

    while (temp != 0){
        sumOfFactorialOfDigits += factorial(temp % 10)
        temp /= 10
    }
    return number == sumOfFactorialOfDigits;
}

private fun factorial(number:Int):Int
{
    var temp = number
    var multiplication = 1

    while (temp > 0){
        multiplication *= temp
        temp--;
    }
    return multiplication
}