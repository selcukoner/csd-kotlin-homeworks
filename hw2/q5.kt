package com.selcukoner.homeworks.hw2
/*
    2’den büyük tüm çift sayılar iki asal sayının toplamı biçiminde yazılabilir (Goldbach teoremi). Klavyeden bir
    çift sayı alan ve bunu iki asal sayının toplamı biçiminde yazdıran programı yazınız. Örneğin:
    Sayı: 16
    11 + 5
 */
fun main() = runPrintGoldBack()

fun runPrintGoldBack()
{
    println("Enter number")
    var evenNumber: Int = readln().toInt()

    printGoldBach(evenNumber)
}

fun printGoldBach(EvenNumber : Int)
{

    var number1 =3


    if (EvenNumber == 4)  println("Number :4 = 2 + 2 ")

    while (number1 <= (EvenNumber)/2){
        if (isPrimeHW2(number1) && isPrimeHW2(EvenNumber - number1)){
            println("Number :$EvenNumber = $number1 + ${EvenNumber - number1} ")
            break
        }
        number1 += 2
    }

}

fun isPrimeHW2(number:Int):Boolean
{
    if (number <=1 ) return false

    if (number % 2 == 0)
        return number == 2

    if (number % 3 == 0)
        return number == 3

    if (number % 5 == 0)
        return number == 5

    if (number % 7 == 0)
        return number == 7

    var i = 11

    while (i * i < number){
        if (number % i == 0) return false

        i +=2
    }

    return true
}