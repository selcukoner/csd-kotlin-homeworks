package com.selcukoner.homeworks.hw3

fun main() = runPrintCollatz()

private fun runPrintCollatz()
{
    println("Enter a number")
    var n = readln().toInt()
    printCollatz(n)
}

private fun printCollatz(num : Int)
{
    var n  = num

    while (n != 1){
        if(n % 2 == 0){
            n /= 2
        }else{
            n = 3*n + 1
        }
        print("$n ")
    }
}