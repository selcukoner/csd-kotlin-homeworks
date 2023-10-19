package com.selcukoner.`csd-homeworks`.hw6

import kotlin.random.Random

fun main() = runCrapsApp()

private fun runCrapsApp(){
    var numberOfWin: Int = 0
    var repetitionNumber = 100_000
    var random = Random
    for(i in 0.. repetitionNumber){
        if (playCrapsGame(random))
            numberOfWin++
    }

    println(numberOfWin / repetitionNumber.toDouble())
}

private fun playCrapsGame(random: Random) : Boolean
{
    var firstSum = rollTwoDices(random)

    when(firstSum){
        7,11   -> return true // wins
        2,3,12 -> return false // lose
        else   -> return rollForIndeterminate(firstSum, random)
    }
}

private fun rollForIndeterminate(sumToWin:Int, random: Random): Boolean
{
    while (true){
        var sum = rollTwoDices(random)

        if(sumToWin == sum) {
            return true
        }else if(sum == 7){
            return false
        }
    }
}
private fun rollTwoDices(random: Random) = random.nextInt(1,7) + random.nextInt(1,7)


