package VisibilityLesson;

open class Person {
    var firstName: String = "Sam"

    private var firstName1 : String = "Sam1"

    var firstName2 : String = "Sam2"
    private set

    protected var firstName3: String = "Sam3"

}

class Student : Person() {
    fun printStudentData() {
        println("firstName3: ${firstName3}")
    }
}


fun main(args : Array<String>) {
    var student = Student()
    student.printStudentData()
}