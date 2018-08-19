/**
 *
 */
fun main(args: Array<String>) {
/* Pairs and Triples

 Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
 */
    val timePoint = Pair(3, 26)
    println("date = $timePoint")

/*
 In one line, read the day and month values into two constants.
 */
    val (day, month) = timePoint
    println("day = $day, month = $month")


/*
 Now create a Triple using the month, day and year */
    val dayOfMonth = Triple(26, 3, 1991)

    println("dayOfMonth = $dayOfMonth")

}