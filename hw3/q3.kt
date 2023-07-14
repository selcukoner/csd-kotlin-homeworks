package com.selcukoner.homeworks.hw3

import kotlin.math.abs

fun main() = runCalculateDigitalRoot()

private fun runCalculateDigitalRoot()
{
    println("Enter number")
    var num = readln().toInt()

    println("Digital root of $num: ${calculateDigitalRoot(num)}")
}

private fun calculateDigitalRoot(num:Int):Int
{
    var temp = num
    while (temp > 9){
        temp = sumDigits(temp)
    }
    return  temp
}

private fun sumDigits(num: Int):Int
{
    var temp = num
    var sum = 0
    while (temp != 0){
        sum += temp % 10
        temp /= 10
    }

    return abs(sum)
}
