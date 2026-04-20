package oop_00000107781_AngelaBenedictinSunny.week09

fun main(){
    println("==== TEST LIST===")

    val frameworks : List<String> = listOf("Kotlin", "Java", "C++")
    // kalau pake .add() hasilnya error karena sifatnya immutable
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    print("Mutable List: $scores")

    println("\n===TEST===")
    val uniqueNumbers = setOf(1,2,2,3,3,4);
    println("Unique numbers (set: $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "userB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active users: $activeUsers")
}