package ClassLesson;

class Person (
    var firstName: String,
    var lastName: String? = "Gameeee") {

    var fullName : String? = null

    init {
        println("Init 1")
        fullName = "$firstName $lastName"
    }

    init {
        println("Init 2")
    }
}

fun main(args: Array<String>) {
    val person = Person("Alan")
    val person1 = Person("Alan", "Sparrow")
    println("Person = ${person.firstName} ${person.lastName}")
    println("Person1 = ${person1.firstName} ${person1.lastName}")

    println(person.fullName)
    println(person1.fullName)
}
