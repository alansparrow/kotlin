package CompanionLesson;

class Student private constructor(){
    var firstName: String? = null
    var lastName: String? = null
    companion object {
        fun createStudent() : Student {
            return Student()
        }

        fun loadStudent(jsonText: String) : Student {
            val student = Student()
            student.firstName = "FirstName"
            student.lastName = "LastName"
            return student
        }
    }
}

fun main(args: Array<String>) {
    val student = Student.loadStudent("JSON Text")
}