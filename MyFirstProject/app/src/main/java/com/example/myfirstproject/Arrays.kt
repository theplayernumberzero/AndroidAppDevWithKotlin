package com.example.myfirstproject

fun main(args: Array<String>) {
    var age = arrayOf(1,2,3)
    var carAndAge = arrayOf(1,"Mercedes",2,"Peugeot")   //Array can contain different data types

    println("First element of array: " + age[0])
    println("Second element of array: " + age.get(1))

    age.set(2,10)
    println("Third element of array: " + age.get(2))

    println("Size of array: " + age.size)
    println("Size of carAndAge array: " + carAndAge.size)
}