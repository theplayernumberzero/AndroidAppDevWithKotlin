package com.example.objectorieentedprogramming

//Secondary constructor
class MyCars2 {

    var name : String? = null
    var model : Int? = null
        private set //only encapsulate to set method

    constructor(name : String?, model : Int?){
        this.name = name
        this.model = model
    }

}