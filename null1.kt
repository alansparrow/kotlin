fun main(args : Array<String>) {
    var result : Int? = 30
    println(result)
    //println(result + 1)
    val newResult = result?.plus(5)
    println(newResult)

    var x : Int? = null
    if (x != null) {
        x += 1
    }

    println(result!! + 1)

    var authorName : String? = "Fuzzy"
    var authorAge : Int? = 30

    var unwrappedAuthorName = authorName!!
    println("Author is $unwrappedAuthorName")

    authorName = null
    if (authorName != null) {
        println("Author is ${authorName!!}")
    } else {
        println("No author")
    }

    authorName = "Rock"
    authorName?.let {
        name -> println("Author is $name")
    }

    authorName = null
    authorName?.let {
        name -> println("Author is $name")
    }

    authorName = "Coder"
    authorName?.let { println("Author is $it") }

    var nullableInt : Int? = 10
    var mustHaveResult = nullableInt ?: 0

    println(mustHaveResult)

    nullableInt = null
    mustHaveResult = nullableInt ?: 0

    println(mustHaveResult)

}