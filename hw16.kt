/**
 * Given the Student data class below, create a StudentRegistry
 * singleton that has a list of students and can add and remove a
 * student from that list.
 *
 */
data class Student(val firstName: String, val lastName: String)

// Add the StudentRegistry class here

// Your Solution Here

object StudentRegistry {
    private val studentList = mutableListOf<Student>()

    fun addStudent(student: Student) {
        studentList.add(student)
    }

    fun removeStudent(student: Student) {
        studentList.remove(student)
    }

    fun print() {
        println(studentList)
    }
}

/**
 * Add 2 students to the registry and then print out the list
 */
// Add main function and print out the students



/**
 * Add 2 students to the registry and then print out the list
 */
fun main(args: Array<String>) {
    // Your Solution Here
    val s1 = Student("Alan", "Sparrow")
    val s2 = Student("James", "007")
    StudentRegistry.addStudent(s1)
    StudentRegistry.addStudent(s2)

    StudentRegistry.print()

    StudentRegistry.removeStudent(s1)
    StudentRegistry.print()
}