fun main(args : Array<String>) {
    val range = 0..5
    val count = 10
    var sum = 0
    for (i in 1..count)
        sum += i
    println("sum = $sum")

    for (i in 0..count)
        println("Hodor!")

    for (i in 1..count)
        if (i % 2 != 0)
            println("$i is an odd number")

    for (i in 1..count) {
        println("Hello.")
        if (i == 3)
            continue
        println("Goodbye")
    }

    for (row in 1..3) {
        for (col in 1..3)
            print("$col")
        println()
    }

    outer@ for (row in 1..3) {
        for (col in 1..3) {
            if (row == 2 && col == 2) {
                println()
                continue@outer
            }
            print("$col")
        }
        println()
    }
}