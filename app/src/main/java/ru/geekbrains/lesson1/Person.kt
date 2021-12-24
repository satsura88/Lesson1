package ru.geekbrains.lesson1


open class Person(val name:String, var age:Int=25, var bio:String="", var bio2:String="") {
    init {
        //name = "initName"
        age = 30
    }
    fun foo(name:String):Int{
        return age
    }
}

class Student(var group:Int, name:String,age:Int):Person(name, age){

}

var test = "Test"

fun foo(name:String) = name