package com.selcukoner.homeworks.hw2

import kotlin.math.abs

fun main() = runPrintDiamond()

fun runPrintDiamond()
{
    println("Enter a number n:")
    val n = readln().toInt()


    printDiamond(n)
    println()

    printDiamond2(n)
    println()
    printUpperTriangle(n)
    println()
    printLowerTriangle(n)
}

fun printDiamond(n : Int)
{
        for (row in 1..2*n-1){

            if(row <= n) {
                for (column in 1..2 * n - 1) {
                    if (column > n - row && column < n + row) print("*") else print(" ")
                }
                println()
            }else{
                for (column in 1..2 * n - 1) {
                    if (column > row -n  && column < 2*n-row%n) print("*") else print(" ")
                }
                println()
            }
        }
}
// distance to the point (0,0) <= n
fun printDiamond2(n: Int)
{
    for (row in -n+1 .. n-1){
        for(column in -n+1 ..n-1){
            if(abs(row) + abs(column) < n ) print("*") else print(" ")

        }
        println()
    }
}

fun printLowerTriangle(n: Int)
{
    for (row in 1..n){
        for (column in 1..2*n-1) {
            if (column > row && column < 2*n-row) print("*") else print(" ")
        }
        println()
    }

}


fun printUpperTriangle(n : Int)
{
    for (row in 1..n){
        for (column in 1 .. 2*n-1){
            if(column > n - row && column < n+row) print("*") else print(" ")
        }
        println()
    }
}