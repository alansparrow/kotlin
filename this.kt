package ThisLesson;

class Person {
    var firstName = "Person"
    var child = Child()

    fun setFirst(firstName: String) {
        this.firstName = firstName
    }

    inner class Child {
        var firstName = "Child"

        fun printParentage() {
            println("Child ${this@Child.firstName} with parent ${this@Person.firstName}")
        }
    }
}

fun main(args : Array<String>) {
    val person = Person()
    person.firstName = "Sam"
    person.child.firstName = "Suzzy"
    person.child.printParentage()
}