/**
 *
 */

fun main(args: Array<String>) {

    /**
     * Write a data class named Student with a firstName, lastName of type String
     * and a grade with a type Char
     */

    // Your solution here
    data class Student(val firstName: String, val lastName: String,
                       val grade: Char)

    /**
     * Create a variable named sam that is a student with the first name "Sam"
     * and a last name of Gamgee and a grade of 'A'
     */

    // Your solution here
    var sam = Student("Sam", "Gamgee", 'A')

    /**
     * Now make a copy of sam but with a grade of 'B'
     */

    // Your solution here
    var sam1 = sam.copy(grade = 'B')

    println(sam.toString())
    println(sam1.toString())
}