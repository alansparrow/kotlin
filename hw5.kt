/**
 *
 */

fun main(args: Array<String>) {
/*
 ### when STATEMENTS

 Write a when statement that takes an age as an integer and prints out the life stage related to
 that age. You can make up the life stages, or use my categorization as follows: 0-2 years,
 Infant; 3-12 years, Child; 13-19 years, Teenager; 20-39, Adult;40-60, Middle aged; 61+, Elderly.
 */
    val age = 27
    when (age) {
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        else -> println("Elderly")
    }


/*
 Write a when statement that takes a pair containing a string and an integer.
 The string is a name, and the integer is an age. Use the same cases that you used
 in the previous exercise and println out the name followed by the life stage.
 For example, for the author of these challenges, it would println out "Kevin is middle aged.".
 */
    val me = Pair("Fuzzy Rock", 27)
    when (me.second) {
        in 0..2 -> println("${me.first} is Infant")
        in 3..12 -> println("${me.first} is Child")
        in 20..39 -> println("${me.first} is Adult")
        in 40..60 -> println("${me.first} is Middle aged")
        else -> println("${me.first} is Elderly")
    }


/*
 * Write a when expression using the same when(myAge) as above but
 * set the result to personsAge and then print it.
 */
    val personsAge = when(age) {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 20..39 -> "Adult"
        in 40..60 -> "Middle aged"
        else -> "Elderly"
    }

    println(personsAge)
}
