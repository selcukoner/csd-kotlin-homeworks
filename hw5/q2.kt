package com.selcukoner.homeworks.hw5

import kotlin.math.sqrt

fun main() = testSumFactors()

private fun testSumFactors()
{
    println("Enter number")
    println(sumFactorsFaster(readln().toInt()))
}

private fun sumFactors(num: Int):Int
{
    var result  = 1
    for (i in 2 .. num / 2){
        if (num % i == 0)
            result += i
    }
    return  result
}

private fun sumFactorsFaster(num: Int):Int
{
    val sqrtVal = sqrt(num.toDouble()).toInt()
    var result =  1
    for(i in 2..sqrtVal){
        if (num % i == 0)
            result += if (i == num/i) i else i + num/i // makes sure square root added only once
    }

    return  result
}