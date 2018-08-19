fun main(args : Array<String>) {
    val values = listOf(2,3,4,5,6,7,8,9)
    println(values.filter { it > 5 })

    val names = listOf("Sam", "Fred", "Samuel", "Alice")
    println(names.first { it.length > 5 })

    val cities = listOf("Los Angeles", "San Francisco", "New York", "San Antonio")
    println(cities.any { it == "San Antonio" })
    println(cities.all { it.length > 6 })


}