package oop_00000107781_AngelaBenedictinSunny.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width : Int, var height : Int, var area : Double) : Shape {
    override fun area(): Int = width * height
}

class SafeSquare(var side : Int) : Shape{
    override fun area(): Int = side * side
}