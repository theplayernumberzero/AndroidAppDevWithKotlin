package com.example.objectorieentedprogramming

fun main(args: Array<String>) {

    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 350

    car.show()

    println()

    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Yamaha"
    motorcycle.maxSpeed = 180

    motorcycle.show()
}