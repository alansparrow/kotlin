/*
 ## CLASSES VS STRUCTURES

 Imagine you're writing a movie-viewing application in Kotlin.
 Users can create lists of movies and share those lists with other users.

 Create a `MovieList`  and a `MovieGoer` class

 - `MovieList` - Contains a genre String passed in the constructor
    and an array of movie titles set as a property.
    Create a `print` method that will print all the movies in the list.
 - `MovieGoer` - Add a method `addList(movieList)` which adds the given list
    to a map of `movieList` objects (using the `genre` as a key).
    Add a method `movieListFor(genre) : MovieList?`
    that will return the Nullable `MovieList` for the provided genre.
    Add a method 'addMovie'(genre, movie) that will add a movie to the given genre
 - Create `jane` and `john` users in main and have them create and share lists.
    Have both `jane` and `john` modify the same list and call `print` from both users.
    Are all the changes reflected?
*/
class MovieList(val genre: String) {
    private val movieTitles: MutableList<String> = mutableListOf()

    fun addMovie(movie: String) {
        if (!movieTitles.contains(movie))
            movieTitles.add(movie)
    }

    fun print() {
        movieTitles?.let { println(movieTitles) }
    }
}

class MovieGoer {
    private var favMovies: MutableMap<String, MovieList> = mutableMapOf()

    fun addGenre(genre: String) {
        if (!favMovies.containsKey(genre))
            favMovies[genre] = MovieList(genre)
    }

    fun addMovie(genre: String, movie: String) {
        if (!favMovies.containsKey(genre))
            addGenre(genre)

        favMovies[genre]?.addMovie(movie)
    }

    fun movieListFor(genre: String): MovieList? {
        return favMovies[genre]
    }
}


/*
 ### Challenge 2
Make movieList private and remove addList.
Add a method to MovieList to add a movie and make movies private
Create a new method in MovieGoer called addGenre that takes a genre and creates a new MovieList object.
Update MovieGoer.addMovie to use the MovieList's addMovie method and check to see if the MovieList
exists before trying to add
*/


// Your Solution Here

fun main(args: Array<String>) {


    // Test your classes here
    var jane = MovieGoer()
    var john = MovieGoer()

    jane.movieListFor("Action")?.print()
    jane.addMovie("Action", "Batman")
    jane.movieListFor("Action")?.print()
    jane.addMovie("Action", "Flash")
    jane.addMovie("Action", "Black Panther")
    jane.addMovie("Action", "Batman")
    jane.movieListFor("Action")?.print()

    john.movieListFor("Action")?.print()
    john.addMovie("Action", "Batman 2")
    john.movieListFor("Action")?.print()
    john.addMovie("Action", "Flash 2")
    john.addMovie("Action", "Black Panther 2")
    john.addMovie("Action", "Batman 2")
    john.movieListFor("Action")?.print()

    /*
    movieList1.movieTitles.add("Batman")
    movieList1.movieTitles.add("Black Panther")
    movieList1.movieTitles.add("Flash")


    movieList2.movieTitles.add("Nut")
    movieList2.movieTitles.add("Sassy Girl")
    movieList2.movieTitles.add("Fool")



    jane.movieListFor("action")?.print()
    jane.addList(movieList1)
    jane.movieListFor("action")?.print()

    john.movieListFor("comedy")?.print()
    john.addList(movieList2)
    john.movieListFor("comedy")?.print()
    john.addMovie("comedy", "Hello Sam")
    john.movieListFor("comedy")?.print()
    john.addMovie("fantasy", "Harry Potter")
    john.movieListFor("fantasy")?.print()
    john.addList(movieList1)
    john.movieListFor("action")?.print()
    john.addMovie("action", "Superman")
    john.movieListFor("action")?.print()
    jane.movieListFor("action")?.print()
 */
/*
 ### Challenge 3

 Your challenge here is to build a set of objects to support a t-shirt store.

 - `TShirt` - Represents a shirt style you can buy. Each `TShirt` has a size (Int), color(Int), price (Double)
 - `Address` - Represents a shipping address, containing the
    number, street, city, and zip code.
 - `ShoppingCart` - Holds a current order, which is composed of an list of `TShirt`
    that the `User` wants to buy, as well as a method to calculate the total cost.
    Additionally, there is an `Address` that represents where the order will be shipped.

 - `User` - A registered user of the t-shirt store app.
    A user has a name, email, and a `ShoppingCart` (below).
 */

    // Your Solution Here
    class TShirt(val size: Int, val color: Int, val price: Double) {}

    class Address(val number: String, val street: String, val city: String, val zipCode: String) {
        fun print(): String {
            val address = "'$number, $street, $city, $city, $zipCode'"
            return address
        }
    }

    class ShoppingCart(val listOfTShirt: MutableList<TShirt>) {
        var address: Address? = null
        constructor(listOfTShirt: MutableList<TShirt>, address: Address) : this(listOfTShirt) {
            this.address = address
        }

        fun calculateTotalCost(): Double {
            var totalCost: Double = 0.0
            for (elem in listOfTShirt)
                totalCost += elem.price

            return totalCost
        }
    }

    class User(var name: String, var email: String, var shoppingCart: ShoppingCart) {}

    var t1 = TShirt(50, 1, 200.0)
    var t2 = TShirt(60, 2, 210.0)
    var t3 = TShirt(30, 3, 230.0)
    var t4 = TShirt(80, 4, 300.0)
    var t5 = TShirt(70, 5, 500.0)
    var listOfTShirt = mutableListOf<TShirt>(t1,t2,t3,t4,t5)

    var address = Address("80", "Broadway", "New York", "123456")

    var shoppingCart = ShoppingCart(listOfTShirt, address)

    var user = User("Alan", "alansparrow@gmail.com", shoppingCart)

    println("${shoppingCart.calculateTotalCost()} worth of goods will be shipped to ${shoppingCart.address?.print()}")
    println("${user.name} : ${user.email}")
    println("${user.shoppingCart.calculateTotalCost()} : ${user.shoppingCart.address?.print()}")
}
