package com.example.internal_exam_application

class Person(var name: String, var age: Int) {
    var id = 0
    constructor(id:Int, name:String, age:Int) : this(name,age){
        this.id = id
    }
}