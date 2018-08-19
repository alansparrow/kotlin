fun main(args: Array<String>) {
    val temperature = 37.5
    val count : Int = 5
    var name = "Sam"

    name = "Fred"

    fun calculateTemperature(celsius : Double) : Double {
        return 9/5 * celsius + 32
    }

    println("Temp = ${calculateTemperature(20.0)}")
    println("Temp = ${calculateTemperature(50.0)}")

    val intValue = "32".toInt()
    println("intValue = $intValue")

    val intString = 32.toString()
    println("intString = $intString")

    val fahrenheit = 32

    when (fahrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("getting colder")
        in 41..50 -> println("kind of cold")
        in 51..60 -> println("nippy")
        in 71..80 -> println("just right")
    }

    var nullableName : String? = null
    var length = nullableName?.length ?: -1
    println(length)

    nullableName = "Sam"
    length = nullableName?.length ?: -1
    println(length )
}