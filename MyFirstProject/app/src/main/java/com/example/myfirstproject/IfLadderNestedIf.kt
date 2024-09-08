package com.example.myfirstproject

fun main(args: Array<String>) {
    print("Please enter your age: ")
    var age : Int = readLine()!!.toInt()

    if (age <= 13){
        print("You are a child")
    }else if (age <= 18){
        print("You are teenager")
    }else{
        if (age <= 65){
            print("You are an adult")
        }else{
            print("You are a senior")
        }

    }
}