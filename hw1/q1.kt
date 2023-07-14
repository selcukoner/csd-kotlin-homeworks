package com.selcukoner.homeworks.hw1

/*
    Klavyeden alınan Int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve =
    sembolleriyle gösteriniz:
 */

fun main() = display()

fun display(){
    println("a:")
    val a= readln().toInt()
    println("b:")
    val b= readln().toInt()
    println("c:")
    val c= readln().toInt()

    val message = orderNumbers(a, b, c)
    println(message)
}

fun orderNumbers(a : Int ,b : Int , c: Int ):String{
    val min:Int
    val mid:Int
    val max:Int

    min  = findMin(a,b,c)
    mid  = findMid(a,b,c)
    max  = findMax(a,b,c)

    if(mid == min){
        if(mid == max){
            return "$min = $mid = $max "
        }else{
            return "$min = $mid < $max "
        }
    }else if(mid == max){
        return "$min < $mid = $max "

    }else{
        return "$min < $mid < $max "
    }
}

fun findMid(a : Int ,b : Int , c: Int):Int{
    val sum = a + b + c
    return sum - (findMin(a,b,c) + findMax(a,b,c))
}



fun findMax(a : Int ,b : Int , c: Int):Int{
    return if(a >= b && a >=c)
        a
    else if(b >= a && b >= c)
        b
    else
        c
}

fun findMin(a : Int ,b : Int , c: Int ):Int{
    return if(a <= b && a <=c)
        a
    else if(b <= a && b <= c)
        b
    else
        c
}