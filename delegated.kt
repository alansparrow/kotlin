package DelegatedLesson;

import kotlin.properties.Delegates

data class Course(var className: String) {
    var room : String by Delegates.observable("No Room") {
        property, oldValue, newValue ->
        println("""[Property $property
            |Old value is $oldValue
            |New value is $newValue]""".trimMargin())
    }
}

data class Course1(val map: Map<String, Any?>) {
    val room: String by map
    val teacher: String by map
}

val scienceSource: Course by lazy {
    println("lazy")
    Course("Science")
}


fun main(args: Array<String>) {
    println(scienceSource.room)
    scienceSource.room = "11B"
    println(scienceSource.room)

    val course1 = Course1(mapOf("room" to "Room 1", "teacher" to "Ms. Pretty"))
    println("${course1.room} : ${course1.teacher}")
}