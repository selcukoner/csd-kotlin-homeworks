package com.selcukoner.homeworks.hw5

fun main() = calculateEulerNumber()

private fun calculateEulerNumber()
{
    var result =0.0

    for (i in 0..10){
        result += 1.0/ factorial(i)
    }
    println(result)
}

private fun factorial(num : Int):Int
{
    var result = 1
    for(i in 2..num)
        result *=i

    return result
}