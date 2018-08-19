/**
 * Create a class named Course that takes a className String parameter
 * Add a private lateinit variable for the Teacher's name
 * Then create a setTecherName function that sets that variable
 */

// Your solution here

class Course(val className: String) {
    private lateinit var teacherName: String

    fun setTeacherName(teacherName: String) {
        this.teacherName = teacherName
    }

    fun printCourse() {
        if (this::teacherName.isInitialized)
            println("$className : $teacherName")
        else
            println("$className")
    }
}

/**
 * Add a main function, create a Course and set the teacher name
 */
fun main(args: Array<String>) {

// Your solution here
    val course = Course("Math")

    course.printCourse()
    course.setTeacherName("Smith")
    course.printCourse()



}