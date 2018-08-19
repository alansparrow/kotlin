/**
 * Create a Shape interface with 2 integer properties named:
 * width, height.
 * Add a function named draw
 */

// Your Solution Here
interface Shape {
    val width: Int
    val height: Int

    fun draw()
}

/**
 * Create a Circle that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Circle(override val width: Int, override val height: Int) : Shape {
    override fun draw() {
        println("Draw circle")
    }

}

/**
 * Create a Line that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Line(override val width: Int, override val height: Int) : Shape {
    override fun draw() {
        println("Draw line")
    }

}

/**
 * Create a function named printShape that takes a shape and calls the draw method
 */
// Your Solution Here
fun printShape(shape: Shape) {
    shape.draw()
}

/**
 * Create a circle and a line and call printShape on both
 */
fun main(args: Array<String>) {
    // Your Solution Here
    val circle = Circle(10, 20)
    val line = Line(100, 200)

    printShape(circle)
    printShape(line)
}
