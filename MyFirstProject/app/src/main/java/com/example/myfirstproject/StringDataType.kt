package com.example.myfirstproject

fun main(args: Array<String>) {
    var a : String = "Hello Kotlin"
    var b : String = "Language"
    var age : Int = 23
    println(a + " " + b)
    println("Your age is: " + age)

    var x : String = "Kotlin"
    var i : Int = x.length
    var bo : Boolean = x.equals("Java")
    var t : String = "   server   "
    println("Length of 'Kotlin': " + i)
    println("Is kotlin equal java: " + bo)
    println(x.isEmpty())
    println(x.plus(" language"))
    println(x.lowercase())
    println(x.uppercase())
    println(x.plus(t.trim()))   //trim cut spaces on start and end
}