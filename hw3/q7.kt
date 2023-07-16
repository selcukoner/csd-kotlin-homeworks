package com.selcukoner.homeworks.hw3

import kotlin.math.abs

fun main() = runIsDecimalHarshad()

private fun runIsDecimalHarshad()
{
    println("Enter a number to check if it is decimal Harshad")
    var num = readln().toInt()
    println("$num ${isDecimalHarshad(num)}")
}
private fun isDecimalHarshad(num : Int) = num > 0 && num % sumDigits(num) == 0

private fun sumDigits(num : Int):Int
{
    var temp = num
    var sum =  0
    while (temp != 0){
       sum += temp % 10
       temp /= 10
    }
    return  abs(sum)
}