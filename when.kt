fun main(args: Array<String>) {
    val number = 10

    when (number) {
        0 -> println("Zero")
        10 -> println("Ten")
        else -> println("Non-Zero")
    }

    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("House pet")
        else -> println("Wild animal")
    }

    when (number) {
        in 1..9 -> println("Between 1 and 9")
        in 10..20 -> println("Between 10 and 20")
        else -> println("Some other number")
    }

    when {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }

    val testValue = 10
    val test = when {
        testValue < 10 -> "Less than 10"
        testValue > 10 -> "Greater than 10"
        else -> "is equal to 10"
    }
    println(test)
}