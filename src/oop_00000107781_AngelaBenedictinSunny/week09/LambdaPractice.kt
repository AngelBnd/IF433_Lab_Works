package oop_00000107781_AngelaBenedictinSunny.week09

fun main(){
    println("=== TEST LAMBDA ===")
    // syntax lambda eksplisit: {parameters -> body}
    val sumLambda = {a:Int, b:Int -> a+b}
    println("Hasil Sum: ${sumLambda(5,10)}")

    val squareImplicit:(Int) -> Int = {it*it}
    println("Hasil Sqaure: ${squareImplicit(4)}")
}