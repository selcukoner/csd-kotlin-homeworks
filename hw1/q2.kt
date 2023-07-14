package com.selcukoner.homeworks.hw1
/*
    Parametresi ile aldığı Int türden 3(üç) sayıdan ortancasına geri dönen mid isimli fonksiyonu yazınız ve test
ediniz. Fonksiyon sayıların aynı olması durumunda da ortanca değere geri dönecektir. Örneğin sayılar 10, 10, 20
ise ortanca değer 10 olacaktır.
Açıklama: Üç tane sayının ortancası sayıların toplamından sayıların en küçüğünün ve en büyüğünün toplamını
çıkarmakla bulunabilir. Fonksiyon bu şekilde yazılmayacaktır. Yani fonksiyon içerisinde sayıların en büyüğünün
ve en küçüğünün bulunmasına gerek yoktur.
 */

fun main(){
    println("a")
    val a = readln().toInt()
    println("b")
    val b = readln().toInt()
    println("c")
    val c = readln().toInt()
    println(mid(a,b,c))
}

fun mid(a:Int , b:Int , c:Int ):Int
{
    return if(a <=b && a>=c || a <=c && a>=b)
                a
            else if(b <=a && b >=c || b <=c && b >=a)
                b
            else
                c
}