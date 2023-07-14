package com.selcukoner.homeworks.hw3

fun main() = runIsSuperPrime()

private fun runIsSuperPrime()
{
    println("Enter a number to check if it is super prime:")
    var num  = readln().toInt()

    println(isSuperPrime(num))
}

//checks prime indexed primes
private fun isSuperPrime(num: Int):Boolean
{
    if (isPrime(num) == false)
        return false
    if(num == 2)
        return false

    var indexCounter = 1
    var temp =3

    while (temp <= num){
        if (isPrime(temp)) {
            indexCounter++

        }
        temp += 2
    }
    return isPrime(indexCounter)
}

private fun isPrime(num:Int):Boolean
{
    if (num <=1 )
        return false
    if(num % 2 == 0)
        return  num == 2
    if(num % 3 == 0)
        return  num == 3
    if(num % 5 == 0)
        return  num == 5
    if(num % 7 == 0)
        return  num == 7

    var i = 11
    while (i*i < num){
        if(num % i == 0){
            return false
        }
        i +=2
    }
    return true
}