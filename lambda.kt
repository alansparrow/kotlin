fun main(args : Array<String>) {
    val ints = listOf(2,3,4,5,6)
    println(ints.filter{ it > 4 })

    fun List<Int>.filter(operator: (Int) -> Boolean) {

    }

    val myStringList = listOf("Sam", "Suzzy", "Jessy", "Ray", "Kevin")
    val updatedList = myStringList.filter { it.length > 3 }.sortedBy { it }
    println(updatedList)


    fun handleInteger(myInt: Int, operation: (Int) -> Unit) {
        operation(myInt)
    }

    handleInteger(5, {println("My Result is ${it * 10}")})

    handleInteger(5, {myType -> println("My Result is ${myType * 10}")})

    handleInteger(5, {_ -> println("My Result is ${10}")})

    fun printResult(myInt : Int) {
        println("My Int is $myInt")
    }

    handleInteger(4, ::printResult)

}