package SetterGetterLesson;

class Person {
    val salutation = "Mr."
    var firstName: String? = null
    var lastName: String? = null
}

class Person1(var firstName: String? = null, var lastName: String? = null) {
    val salutation = "Mr."
    val fullName: String
    get() {
        return "$firstName $lastName"
    }

    var otherName: String = "123"
    private set
}

var itemList: ArrayList<String> = ArrayList<String>()
set(value) {
    field = value
}

fun main(args: Array<String>) {
    val person = Person1("Sam", "Smith")
    println("Person: ${person.firstName} ${person.lastName} ${person.fullName}")

    println(person.otherName)
}