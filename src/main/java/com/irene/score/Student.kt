package com.irene.score

class Student (var name:String,var  english:Int, var math:Int){
    init {
        fun print(){
            print("$name\t$english\t$math\t${getAverage()}")
        }
        fun getAverage() = (english+math)/2
    }
    fun main(){
        val stu = Student("jack",55,87)
        stu.print()
    }
}