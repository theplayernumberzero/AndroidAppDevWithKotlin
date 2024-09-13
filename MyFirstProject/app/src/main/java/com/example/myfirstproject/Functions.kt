package com.example.myfirstproject

fun main(args: Array<String>) {
    print("Please enter first number: ")
    var number1 : Int = readLine()!!.toInt()
    print("Please enter second number: ")
    var number2 : Int = readLine()!!.toInt()

    show(number1, number2)

    var value : Int = add(number1, number2)
    println("$number1 + $number2 = $value")
}

fun show(num1: Int, num2: Int) : Unit { //If function Unit(void) you dont need to write function type
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int) : Int{
    var sum : Int = 0
    sum = num1 + num2
    return sum
}