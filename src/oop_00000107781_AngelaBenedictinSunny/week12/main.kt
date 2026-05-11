package oop_00000107781_AngelaBenedictinSunny.week12

import javax.swing.text.NumberFormatter

fun main(){
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    val result: Int = try{
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException){
        -1
    }

    println("Hasil parsing: $result")
}