interface Animal {
    fun eat()
    val numLegs : Int
}

class Dog: Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Dog eating loudly")
    }
}

class Cat : Animal {
    override val numLegs: Int = 4

    override fun eat() {
        println("Cat eating softly")
    }

    fun meow() {
        println("Meow")
    }

}

fun main(args: Array<String>) {
    val dog = Dog()
    var cat = Cat()

    dog.eat()
    cat.eat()
    cat.meow()
}