/**
 *
 */

fun main(args: Array<String>) {

/*
 ### Maps

 Create a Map with the following keys: name, profession, country, state, and city.
 For the values, put your own name, profession, country, state, and city.
 */

    // Your solution here
    var me = mutableMapOf("name" to "Fuzzy Rock", "profession" to "Software Engineer", "country" to "Viet Nam",
            "state" to "Central", "city" to "Da Nang")
    println(me)

/*
 You suddenly decide to move to Albuquerque.
 Update your city to Albuquerque, your state to New Mexico,
 and your country to USA.
 */

    // Your solution here
    me["city"] = "Albuquerque"
    me["state"] = "New Mexico"
    me["country"] = "USA"

    println(me)


/*
Given a Map in the above format, write a function that
prints a given player's city and state.
*/

    // Your solution here
    fun printMap(myMap : Map<String, String>) {
        val state = if (myMap.containsKey("state")) myMap["state"] else ""
        val city = if (myMap.containsKey("city")) myMap["city"] else ""
        println("$city, $state")
    }

    printMap(me);

}
