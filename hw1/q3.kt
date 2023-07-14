package com.selcukoner.homeworks.hw1
/*
    Parametresi ile aldığı Int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli
fonksiyonu yazınız ve test ediniz. Fonksiyon pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır)
döndürecektir.
Açıklama: Math sınıfının veya Kotlin kütüphanesinin signum fonksiyonları kullanılmayacaktır.
 */

fun main(){
    println(signum(0))
}


fun signum(number: Int):Int{
    return if(number > 0 )
                1
            else if(number < 0)
                -1
            else
                0

}