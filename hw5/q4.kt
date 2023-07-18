package com.selcukoner.homeworks.hw5

import kotlin.math.sqrt

fun main() = findPerfectNumberWithFourDigits()


private fun findPerfectNumberWithFourDigits(){
    for (i in 1000..9999){
        if(isPerfect(i)) println("$i is perfect number with 4 digits")
    }
}

private fun testIsPerfect()
{
    println("Enter number")
    println(isPerfect(readln().toInt()))
}
private fun isPerfect(x : Int) = (sumFactors(x) == x)

private fun sumFactors(num: Int):Int
{
    val sqrtVal = sqrt(num.toDouble()).toInt()
    var result =  1
    for(i in 2..sqrtVal){
        if (num % i == 0)
            result += if (i == num/i) i else i + num/i // makes sure square root added only once
    }

    return  result
}