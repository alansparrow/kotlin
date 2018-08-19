fun main(args: Array<String>) {
    val names = listOf("A", "B", "C", "D")
    println(names)

    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)

    println(teamNames)

    teamNames.add("E")
    teamNames.add("F")

    println(teamNames)

    println(names[0])
    println(names.indexOf("C"))

    teamNames.remove("C")
    println(teamNames)

    for (name in teamNames) {
        println("Team Member: $name")
    }

}