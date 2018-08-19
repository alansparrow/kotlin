/**
 *
 */
fun main(args: Array<String>) {
    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    // Your Solution Here
    val numberList = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    fun filterAndSum(list: List<Int>, operator: (Int) -> Boolean): Int {
        var sum = 0
        for (i in list)
            if (operator(i))
                sum += i
        return sum;
    }

    println(filterAndSum(numberList) { number: Int -> number > 5})

    println(numberList.filter { number: Int -> number > 5 }.sum())


    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val name: String, val age: Int)
    val sam = Person("Sam", 30)


    // Your Solution Here
    val (name, age) = sam
    println("$name : $age")

    fun destructNameAndAge(person: Person?, opt: (Person) -> Person): Person? {
        person?.let {
            return opt(it)
        } ?: return person
    }

    println(sam)
    println(destructNameAndAge(sam) { person: Person ->
        println("In lambda")
        var a = 10
        var b = 20
        val c = a + b + person.age
        Person(person.name + "_new", c)
    })



    /**
     * Print out the index and value of the map below
     */
    val names = mapOf<String, Int>("Join" to 32, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)

    // Your Solution Here
    for ((name, age) in names)
        println("$name : $age")

}