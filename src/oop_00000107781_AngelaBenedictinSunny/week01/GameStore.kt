package oop_00000107781_AngelaBenedictinSunny.week01

fun main() {
    val gameTitle: String
    val price: Int
}

fun calculateDiscount(price: Int) : Int = if(price > 500000) (price - (price * 0.2)).toInt() else (price - (price * 0.1)).toInt()