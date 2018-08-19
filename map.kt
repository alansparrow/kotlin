fun main(args : Array<String>) {
    var namesAndScores = mapOf("A" to 2, "B" to 3, "C" to 8)
    println(namesAndScores)

    println(namesAndScores["B"])
    println(namesAndScores["D"])
    println(namesAndScores.isEmpty())
    println(namesAndScores.count())

    val bobData = mutableMapOf("name" to "Bob", "profession" to "Card Player",
            "city" to "Oakland", "country" to "USA")

    println(bobData)

    bobData["profession"] = "Mailman"
    println(bobData)
    bobData.remove("city")
    println(bobData)

    for ((player, score) in namesAndScores) {
        println("$player : $score")
    }

    for (player in namesAndScores.keys) {
        println("$player : ${namesAndScores[player]}")
    }

}
