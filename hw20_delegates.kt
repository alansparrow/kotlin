package DelegatedHW;

import kotlin.properties.Delegates

/**
 * Copy the Course class you created in the lateinit challenge
 * and add a courseDescription String that is created with the lazy function
 * Have the returned string contain the className and the teacherName
 */
/**
 *  add a room String variable that is an Observable, has a "No Room" initial value
 *  and prints out the new value
 */
// Your solution here

data class Course(val className: String) {
    var room : String by Delegates.observable("No Room") {
        property, oldValue, newValue ->
        println("Changed: $newValue")
    }
    val courseDesc : String by lazy {
        println("lazy")
        "$className $teacherName"
    }
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
 * Add a main function, create a Course and set the teacher name,
 * room and print out the courseDescription
 */
fun main(args: Array<String>) {
// Your solution here

    var course = Course("History")
    course.setTeacherName("Ms Nancy")
    course.room = "Room 9"

    println(course.courseDesc)
    println(course.courseDesc)

    println("course is ${course}")

}