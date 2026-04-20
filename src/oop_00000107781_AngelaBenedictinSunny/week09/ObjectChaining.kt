package oop_00000107781_AngelaBenedictinSunny.week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Andi", 3.2),
        Student("BUDI", 3.9),
        Student("CITRA", 2.8),
        Student("DEWI", 3.7),
    )

    println("===HONOR STUDENTS PIPELINE===")

    val honorNames = students
        .filter{it.gpa >= 3.5}
        .sortedBy{it.name}
        .map{it.name.uppercase()}

    honorNames.forEach { println("Honor Roll: $it") }
}