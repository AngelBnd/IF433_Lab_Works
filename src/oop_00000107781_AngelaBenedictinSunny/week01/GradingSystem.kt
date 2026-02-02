package oop_00000107781_AngelaBenedictinSunny.week01

class GradingSystem {
}

fun main(){
    val name = "John Thor"
    val score = 80

    println("Nama : $name, Nilai: $score")

    val grade = when(score){
        in 90 ..100 -> "A"
        in 80 ..89 -> "B"
        in 70 ..79 -> "C"
        else -> "D"
    }

    println("Grade kami : $grade")
}