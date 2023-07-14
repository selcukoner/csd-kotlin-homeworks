package com.selcukoner.homeworks.hw3

import kotlin.math.abs

fun main() = runIsPrimeX()


private fun runIsPrimeX(){
    println("Enter a number: ")
    var num = readln().toInt()
    println(isPrimeX(num))
}

private fun isPrimeX(num: Int): Boolean
{
    var temp = num
    while (temp > 9){
        if (!isPrime(temp))
            return false
        temp = sumDigits(temp)
    }
    return isPrime(temp)
}

private fun sumDigits(num: Int):Int
{
    var temp = num
    var sum =0
    while (temp != 0){
        sum += temp % 10
        temp /= 10
    }

    return abs(sum)
}

private fun isPrime(num:Int): Boolean
{
    if (num <= 1)
        return false
    if (num % 2 == 0)
        return num ==2
    if (num % 3 == 0)
        return num ==3
    if (num % 5 == 0)
        return num ==5
    if (num % 7 == 0)
        return num ==7

    var i = 11
    while (i * i < num){
        if (num % i == 0)
            return  false
        i +=2
    }

    return true
}