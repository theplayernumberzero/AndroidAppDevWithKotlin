package com.example.myfirstproject

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('m')
    var myChar1 = 'b' in myCharRange
    var myChar2 = 'z' in myCharRange

    println(myCharRange)

    println("myCharRange has b: " + myChar1)
    println("myCharRange has z: " + myChar2)
}