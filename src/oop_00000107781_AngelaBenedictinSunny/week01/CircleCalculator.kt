package oop_00000107781_AngelaBenedictinSunny.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area\n${checkSize(area)}")
}

fun checkSize(area: Double) = if(area>100) "This is a Big Circle" else "This is a Small Circle"
