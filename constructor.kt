package ConstructorLesson;

class Person(val firstName: String) {
    init {
        println("Init")
    }

    constructor(firstName: String, lastName: String) : this(firstName = firstName)
    constructor(fullName: String, age: Int) : this("")
}

class Person1 {
    init {
        println("Init")
    }

    constructor(firstName: String, lastName: String)
    constructor(fullName: String, age: Int)
}