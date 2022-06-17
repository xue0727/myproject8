package com.xue.com.xue.score

class Student(var name:String, var math:Int, var english:Int){
    init {
        println("Testing")
    }
    fun print() {
        println("$name\t$english\t$math\t${average()}")
    }
    fun average() = (english+math)/2
}

fun main(){
    val ruby = Student("Ruby",90,80)
    ruby.print()
    //println(ruby.name)
}