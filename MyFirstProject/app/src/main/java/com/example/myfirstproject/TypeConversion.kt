package com.example.myfirstproject

fun main(args: Array<String>) {
    //No problem when you convert small data type to big data type
    //But when you convert big to small there will be data lose
    var x : Byte = 127
    var y : Int = x.toInt()
    y += 10
    var z : Double = y.toDouble()
    z += 10

    println(x)
    println(y)
    println(z)
}