/**
 *
 */
fun main(args: Array<String>) {

    /**
     * Create a function named printItem that prints out a generic parameter.
     * Call the parameter "item"
     */

    // Your Solution Here
    fun<T> printItem(item: T) {
        println(item)
    }

    printItem("Hello Generics")
    printItem(1000)


    /**
     * Create a function named printList that takes a generic list as a parameter
     * and prints out each item
     */

    // Your Solution Here
    fun<T> printList(list: List<T>) {
        for (elem in list)
            println(elem)
    }

    val list1 = listOf("Hello", "A", "B", "C")
    val list2 = listOf(1,2,3,4,5)
    printList(list1)
    printList(list2)

}
