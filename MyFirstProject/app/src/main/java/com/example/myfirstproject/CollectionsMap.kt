package com.example.myfirstproject

fun main(args: Array<String>) {
    //immutable = cant change (add, remove) later
    var ages = mapOf<String, Int>("Bahadir" to 23, "Meltem" to 13)
    println("---Immutable Map---")
    println("Age of Bahadir: ${ages["Bahadir"]}")

    //mutable => for both (set, map)
    var mutableAges = mutableMapOf<String, Int>("Bahadir" to 23, "Meltem" to 13)
    println("---Mutable Map---")
    mutableAges.put("Mehtap" ,19)
    println("Age of Mehtap: ${mutableAges["Mehtap"]}")
}