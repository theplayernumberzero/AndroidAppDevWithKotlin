package com.example.myfirstproject

fun main(args: Array<String>) {
    println("Please enter 3 number: ")
    var number1 : Int = readLine()!!.toInt()
    var number2 : Int = readLine()!!.toInt()
    var number3 : Int = readLine()!!.toInt()

    if (number1 > number2){
        if (number1 > number3){
            print("$number1 is largest number")
        }else{
            print("$number3 is largest number")
        }
    }else{
        if (number2 > number3){
            print("$number2 is largest number")
        }else{
            print("$number3 is largest number")
        }
    }
}