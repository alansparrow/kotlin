package InheritanceLession


fun main(args: Array<String>) {
    class Grade(var letter: Char, var points: Double, var credits: Double)

    open class Person(var firstName: String, var lastName: String)

    open class Student(firstName: String, lastName: String,
                  private var grades: ArrayList<Grade> = ArrayList()) : Person(firstName, lastName) {
        open fun recordGrade(grade: Grade) {
            grades.add(grade)
        }
    }

    val john = Person("Johny", "Appleseed")
    val jane = Student("Jane", "Appleseed")

    println(john.firstName)
    println(jane.firstName)

    val history = Grade('B', 9.0, 3.0)
    jane.recordGrade(history)

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName) {
        open var minimumPracticeTime = 2
    }

    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName) {
        override var minimumPracticeTime: Int
            get() {
                return super.minimumPracticeTime * 2
            }
            set(value) {
                super.minimumPracticeTime = value / 2
            }
    }

    fun phonebookName(person: Person) : String {
        return "${person.lastName}, ${person.firstName}"
    }

    val person = Person("Alan", "Sparrow")
    val oboePlayer = OboePlayer("Jane", "Applesee")

    println(phonebookName(person))
    println(phonebookName(oboePlayer))

    var hallMonitor = Student("Jull", "Bananapeel")

    hallMonitor = oboePlayer

    //(oboePlayer as? Student).minimumPracticeTime = 8;
    (oboePlayer as BandMember).minimumPracticeTime = 8;

    (hallMonitor as? BandMember)?.let {
        println("""This hall monitor is a band member and practices at least
${hallMonitor.minimumPracticeTime} hour per week.""")
    }

    fun afterClassActivity(student: Student) : String {
        return "Goes home"
    }

    fun afterClassActivity(student: BandMember) : String {
        return "Goes to practice!"
    }

    println(afterClassActivity(oboePlayer))
    println(afterClassActivity(oboePlayer as Student))

    class StudentAthlete(firstName: String, lastName: String) : Student(firstName, lastName) {
       private  var failedClasses = ArrayList<Grade>()

        override fun recordGrade(grade: Grade) {
            super.recordGrade(grade)
            if (grade.letter == 'F')
                failedClasses.add(grade)
        }

        var isEligible : Boolean = true
            get() {
                return failedClasses.size < 3
            }
    }

    var oboePlayer2 = OboePlayer("James", "Leonidas")
    oboePlayer2.minimumPracticeTime = 100
    println(oboePlayer2.minimumPracticeTime)

    println((oboePlayer2 as BandMember).minimumPracticeTime)
    var bandMember: BandMember = oboePlayer2
    println(bandMember.minimumPracticeTime)

    var subject1 = Grade('F', 3.0, 3.0)
    var subject2 = Grade('F', 3.0, 3.0)
    var subject3 = Grade('A', 3.0, 3.0)
    var subject4 = Grade('F', 3.0, 3.0)

    var altheleStudent = StudentAthlete("John", "Orangeseed")
    altheleStudent.recordGrade(subject1)
    println(altheleStudent.isEligible)

    altheleStudent.recordGrade(subject2)
    println(altheleStudent.isEligible)

    altheleStudent.recordGrade(subject3)
    println(altheleStudent.isEligible)

    altheleStudent.recordGrade(subject4)
    println(altheleStudent.isEligible)

}
