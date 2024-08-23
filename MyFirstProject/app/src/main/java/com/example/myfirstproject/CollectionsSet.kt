package com.example.myfirstproject

fun main(args: Array<String>) {
    var mySetArray = setOf<Any>("Kotlin",1,1.2,'x',true,"Kotlin")
    println(mySetArray.size)    //Set hold unique elements. One element can't be on set again
    println(mySetArray.last())
}