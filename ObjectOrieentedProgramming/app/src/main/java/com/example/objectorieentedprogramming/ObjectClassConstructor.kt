package com.example.objectorieentedprogramming

fun main(args: Array<String>) {

    //Creating Object from class
    var myCar = Cars()
    myCar.name = "Peugeot"
    myCar.model = 2018

    var myCar2 = Cars()
    myCar2.name = "Porsche"
    myCar2.model = 2020

    println("My First Car Name: " + myCar.name)
    println("My First Car Model: " + myCar.model)

    println()

    println("My Second Car Name: " + myCar2.name)
    println("My Second Car Model: " + myCar2.model)

    println()

    var myNewCar = MyCars("Ford",2022)
    //println("My new car name is ${myNewCar.name}")
    //println("My new car model is ${myNewCar.model}")

    println()

    var mySecondCar = MyCars2("Mercedes", 2014)
    println("My new car name is ${mySecondCar.name}")
    println("My new car model is ${mySecondCar.model}")
}