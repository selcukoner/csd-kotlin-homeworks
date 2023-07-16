package com.selcukoner.homeworks.hw3

import com.selcukoner.denemeler.ders5.pow

fun main() = runIsHardyRamanujan()

private fun runIsHardyRamanujan()
{
    var a = 100_000
    println("Hardy-Ramanujan numbers less than $a")
    for (i in 0 .. a){
       isHardyRamanujan(i)
    }
}

private fun isHardyRamanujan(num:Int):Boolean
{
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    var firstPairFound = false
    outerLoop@
    for (i in 0..num){
        if(pow(i,3) >= num) break
        for(j in 0..num){
            if(pow(i,3) + pow(j,3) > num) break
            if(pow(i,3) + pow(j,3) == num && i != j ){
                firstPairFound = true
                a = i
                b = j
                break@outerLoop
            }
        }
    }
    if (!firstPairFound) return false

    var secondPairFound = false
    outerLoop@
    for(i in a+1..num){
        if(pow(i,3) >= num) break
        if (i == b) continue
        for(j in 0..num){
            if(pow(i,3) + pow(j,3) > num) break
            if(j == i || j == a || j ==b) continue
            if(pow(i,3) + pow(j,3) == num){
                secondPairFound = true
                c = i
                d = j
                break@outerLoop
            }
        }
    }
    if (firstPairFound && secondPairFound){
        println("$num = $a ^ 3 + $b ^ 3 = $c ^ 3 + $d ^ 3 ")
        return true
    }
    return false
}