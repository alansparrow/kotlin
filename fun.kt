fun main(args: Array<String>) {
    fun printMyName() {
        println("My name is Fuzzy Coder")
    }

    printMyName()

    fun printMultipleOfFive(value: Int) {
        println("$value * 5 = ${value * 5}")
    }

    printMultipleOfFive(10)

    fun printMultipleOf(multiplier : Int, addValue : Int) {
        println("$multiplier * $addValue = ${multiplier * addValue}")
    }

    printMultipleOf(5, 6)

    fun printMultipleOfTwo(multiplier : Int, value : Int = 1) {
        println("$multiplier * $value = ${multiplier * value}")
    }

    printMultipleOfTwo(5)

    fun multiply(number : Int, multiplier : Int) : Int {
        return number * multiplier
    }

    println(multiply(4, 2))

    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
        return Pair(number * factor, number / factor)
    }

    println("Multiple & Divide ${multiplyAndDivide(6, 3)}")

    

}