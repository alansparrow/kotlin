enum class Direction {
    NORTH, SOUTH, WEST, EAST;

    fun printDirection() {
        println("I am going $this")
    }
}

enum class Color(var r: Int, var g: Int, var b: Int) {
    RED(255,0,0),
    YELLOW(255,255,0),
    GREEN(0,255, 0);
}

fun drive(direction: Direction) {
    when (direction) {
        Direction.NORTH -> println("Driving North")
        Direction.SOUTH -> println("Driving South")
        Direction.WEST -> println("Driving West")
        Direction.EAST -> println("Driving East")
    }
}

fun main(args : Array<String>) {
    drive(Direction.SOUTH)

    println(Direction.valueOf("NORTH"))
    println(Direction.SOUTH.ordinal)

    Direction.WEST.printDirection()

    println(Color.GREEN.g)
}
