/**
 *
 */
fun main(args: Array<String>) {
/*
 ### MORE Nullables

 Using your `myFavoriteSong` variable from the previous challenge,
 use nullable safe calls and let to check if it contains a value.
 If it does, print out the value. If it doesn’t, print "I don’t have a favorite song."
 */

    // Your solution here
//    var myFavSong : String? = "Home"
    var myFavSong : String? = null

    myFavSong?.let { println("My fav song is $it") } ?: println("I don't have a fav song")


/*
 Write a function called `printNickname` that takes a Nullable String as a parameter.
 Use the `let` method to try to unwrap the nickname, and if it fails print an error
 and return. Otherwise, print the unwrapped nickname.
 */
    // Your solution here
    fun printNickname(nickname : String?) {
        nickname?.let { println("Nickname is $nickname") } ?: println("No nickname")
    }

    printNickname(null)
    printNickname("Fuzzy")


}