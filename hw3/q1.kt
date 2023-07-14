package com.selcukoner.homeworks.hw3

fun main() = run()

private fun run()
{
    for (i in 100 .. 999){
        if (cond1(i) && cond2(i) && cond3(i) && cond4(i) && cond5(i) && cond6(i) && cond7(i))
            println(i)
    }
}

//number = abc
private fun cond1(num:Int) = reverseTheNumber(num) > num               // cba > abc
private fun cond2(num:Int) = isPrime(num)                              // is  abc prime
private fun cond3(num:Int) = isPrime(reverseTheNumber(num))            // is cba prime
private fun cond4(num:Int) = isPrime(num/10)                      // is ab prime
private fun cond5(num:Int) = isPrime(num % 100)                    // is bc prime
private fun cond6(num:Int) = isPrime(reverseTheNumber(num) / 10)  // is cb prime
private fun cond7(num:Int) = isPrime(reverseTheNumber(num) % 100) // is ba prime

private fun reverseTheNumber(num : Int): Int
{
    var temp = num
    var result: Int = 0

    while (temp != 0){ // 321
        result *= 10
        result += (temp % 10)

        temp /= 10
    }
    return result
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
