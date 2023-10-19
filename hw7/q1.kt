package com.selcukoner.`csd-homeworks`.hw7

import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
   simulateBingoGame()

}

private fun simulateBingoGame()
{
    var wonNumber = 0
    var numberOfGames =30_000
    for (i in 1..numberOfGames)
        if(runBingoGame())
            wonNumber++

    println(wonNumber / numberOfGames.toDouble())
}

private fun runBingoGame(): Boolean
{
    var numbers = getThreeNumbers()

    //isSumPrime(numbers) || isRangeGreaterThanMid(numbers) isSumLessThan150(numbers)
    if(isRangeGreaterThanMid(numbers))
        return true
    else
        return false
}

private fun isRangeGreaterThanMid(array: IntArray) : Boolean
{
    array.sort()

    return array[2] - array [0] > array [1]
}

private fun isSumPrime(array: IntArray): Boolean = isPrime(sumNumbers(array))

private fun isPrime(number:Int):Boolean
{
    if (number <= 1)
        return false

    if (number % 2 == 0)
        return number ==2
    if (number % 3 == 0)
        return number ==3
    if (number % 5 == 0)
        return number ==5
    if (number % 7 == 0)
        return number ==7

    var i = 11

    while (i*i <= number){
        if(number % i == 0)
            return false
        i += 2
    }

    return true
}

private fun sumNumbers(array: IntArray): Int
{
    var sum = 0
    for (number in array)
        sum += number

    return sum
}

private fun isSumLessThan150(array: IntArray): Boolean  = sumNumbers(array) < 150

private fun getThreeNumbers() : IntArray
{
    var rand = Random
    var numbersArray  =  IntArray(3)

    for (i in numbersArray.indices)
        numbersArray[i] = rand.nextInt(1,100)

    return numbersArray
}