package com.selcukoner.homeworks.hw2

fun main() = runPrintPrimeFactors()

fun runPrintPrimeFactors()
{
    println("Enter number to find Prime Factors")
    val number = readln().toInt()

    printPrimeFactors(number)

}

fun printPrimeFactors(number : Int)
{
    var temp = number

    var i = 1
    while (i++ < temp ){
            while (isPrime(i) && temp % i == 0 ){
                print("$i ")
                temp /=i
            }
    }
}

fun isPrime(number: Int ):Boolean
{
    if (number <= 1)
        return false

    if (number % 2 == 0 )
        return number == 2

    if (number % 3 == 0)
        return number == 3

    if(number % 5 == 0)
        return number == 5

    if(number % 7 == 0)
        return number == 7

    var i = 11

    while (i*i < number){
        if (number % i == 0)
            return false

        i += 2
    }

    return true
}