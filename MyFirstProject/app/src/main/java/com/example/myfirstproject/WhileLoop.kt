package com.example.myfirstproject

import kotlin.random.Random


fun main(args: Array<String>) {
    var i = 5
    while (i>0){
        //println(i)
        i--
    }

    //print("Enter a number for its factorial: ")
    //var factorialNumber : Int = readLine()!!.toInt()
    var temp = 1
    var fact = 1
    /*while (temp <= factorialNumber){
        fact *= temp
        temp++
    }*/
    //print("$factorialNumber! = $fact")

    val number = Random.nextInt(0,100)
    var guess : Int = -1
    println("Please enter a number between 0-100: ")

    while (2 > 1){
        guess = readLine()!!.toInt()
        if (guess == number){
            println("You find the number $number. CONGRATS!!")
            break
        }else if (guess < number){
            println("Increase")
        }else{
            println("Decrease")
        }
    }
}