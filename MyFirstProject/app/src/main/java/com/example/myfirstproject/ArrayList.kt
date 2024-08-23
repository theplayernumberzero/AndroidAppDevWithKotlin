package com.example.myfirstproject

fun main(args: Array<String>) {
    var age = arrayListOf<Int>()
    age.add(10)
    age.add(20)
    age.add(30)

    //age.removeAt(2)   arrayden eleman silme
    println("First element of array: ${age[0]}")
    println("Second element of array: ${age[1]}")
    println("Third element of array: ${age[2]}")

    println("*****************")
    var cars = arrayListOf<String>("Opel", "BMW")
    cars.add("Audi")
    cars.add("Renault")

    println("First element of array: ${cars[0]}")
    println("Second element of array: ${cars[1]}")
    println("Third element of array: ${cars[2]}")
    println("Fourth element of array: ${cars[3]}")

    println("******************")
    var myMixArrayList = arrayListOf<Any>()
    myMixArrayList.add("Ford")
    myMixArrayList.add(58)
    myMixArrayList.add(2.5)
    myMixArrayList.add(false)
    myMixArrayList.add('X')

    println("First element of array: ${myMixArrayList[0]}")
    println("Second element of array: ${myMixArrayList[1]}")
    println("Third element of array: ${myMixArrayList[2]}")
    println("Fourth element of array: ${myMixArrayList[3]}")
    println("Fifth element of array: ${myMixArrayList[4]}")
}