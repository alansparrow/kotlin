/**
 *
 */
fun main(args: Array<String>) {
/*
 ### BASIC Functions

 Write a funtion named `printFullName` that takes two strings called `firstName` and `lastName`.
 The funtion should print out the full name defined as `firstName` + " " + `lastName`.
 Use it to print out your own full name using the parameter names.
 */

    // Your solution Here
    fun printFullName(firstName: String, lastName: String) {
        println("$firstName $lastName")
    }

    printFullName(firstName = "Fuzzy", lastName = "Rock")

/*
 Use the printFullName function without any parameter names.
 */

    // Your solution Here
    printFullName("Fuzzy", "Coder")

/*
Write a funtion named `calculateFullName` that returns the full name as a string.
Use it to store your own full name in a constant and then print it.
*/

    // Your solution Here
    fun calculateFullName(firstName: String, lastName: String) : String {
        val fullName = firstName + " " + lastName
        return fullName
    }

    val fullName = calculateFullName("Fuzzy", "Rock")
    println(fullName)

/*
 Create `calculateFullNameWithLength` to return a pair containing both the full name and the
 length of the name. You can find a string’s length by using the following
 syntax: `string.length`. Use this funtion to determine the length
 of your own full name. Then print out the result of the function.
 */

    // Your solution Here
    fun calculateFullNameWithLength(firstName : String, lastName: String) : Pair<String, Int> {
        val fullName = firstName + lastName
        val length = fullName.length

        return Pair(fullName, length)
    }

    println(calculateFullNameWithLength("Fuzzy", "Rock"))


}