/**
 *
 */
fun main(args: Array<String>) {
/*
 ### Lists
 Create a list with the following states that you have lived in:
 */

    // Your solution here
    val myCities = listOf("Da Nang", "Taipei", "Seoul", "Texas")
    println(myCities)
/*
Given a function to print out all states but the third one
*/

    // Your solution here
    fun printAllButThirdOne(list : List<String>) {
        var i = 0
        for (elem in list)
            if (i++ != 2) {
                println(elem)
            }
    }

    printAllButThirdOne(myCities)

}
