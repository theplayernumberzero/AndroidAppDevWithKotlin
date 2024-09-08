package com.example.myfirstproject

fun main(args: Array<String>) {
    print("Enter a number: ")
    var number : Int = readLine()!!.toInt()

    if (number % 2 == 0){
        print("$number is an even number")
    }else{
        print("$number is an odd number")
    }
}