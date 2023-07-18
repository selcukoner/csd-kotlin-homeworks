package com.selcukoner.homeworks.hw5

import kotlin.math.sqrt

fun main() = runAreFriends()

private fun runAreFriends()
{
    for (i in 1000..9999){
        for (j in i..9999){
            if(areFriends(i,j))
                println("$i and $j are friends")
        }
    }

}
private fun areFriends(x : Int, y : Int) = (sumFactorsFaster(x) == y && sumFactorsFaster(y) ==x)

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

private fun sumFactors(num : Int): Int
{
    var result = 1

    for(i in 2 ..num / 2){
        if(num % i == 0)
            result += i
    }
    return result
}
