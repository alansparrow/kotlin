/**
 *
 */
fun main(args: Array<String>) {
/*
 ### ARRAYS
 Use index(of:) to determine the position of the element "Dan" in players.
*/
    var players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")

    // Your solution here
    println("'Dan' position ${players.indexOf("Dan")}")

/*
  Write a for-in loop that prints the players' names and scores.
*/

    players = arrayOf("Anna", "Brian", "Craig", "Dan", "Donna", "Eli", "Franklin")
    val scores = arrayOf(2, 2, 8, 6, 1, 2, 1)
    // Your solution here
    val range = 0..(players.size - 1)
    for (i in range) {
        println("${players[i]} : ${scores[i]}")
    }

    players.forEachIndexed({index, player ->
        println("${index + 1}. $player : ${scores[index]}")
    })

}