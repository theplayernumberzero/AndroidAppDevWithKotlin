package com.example.myfirstproject

fun main(args: Array<String>) {
    //For Loop
    for (number in 1..10){
        //println(number)
    }

    var sum : Int = 0
    for (x in 0..5){
        sum += x
    }
    //print(sum)

    var evenSum : Int = 0
    for (i in 0..10){
        if (i%2 == 0){
            evenSum += i
        }
    }
    //print(evenSum)

    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (y in myNumberArray){
        //println(y)
    }

    for (z in 0..(myNumberArray.size)-1){
        //println("myNumberArray[$z] = ${myNumberArray[z]}")
    }

    for (z in myNumberArray.indices){
        //println("myNumberArray[$z] = ${myNumberArray[z]}")
    }

    //For Each
    var myNumberArray2 = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    myNumberArray2.forEach {
        println(it)
    }
}