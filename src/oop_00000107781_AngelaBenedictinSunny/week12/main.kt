package oop_00000107781_AngelaBenedictinSunny.week12

import javax.swing.text.NumberFormatter

fun main(){
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    // try lgsg mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try{
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException){
        -1
    }

    println("Hasil parsing: $result")

    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try{
        account.withdraw(150.0)
    } catch(e : InsufficientFundsException){
        println("Caught Domain Error: Uang tidak cukup. ${e.message}")
    } catch (e :IllegalArgumentException){
        println("Caught Argument Error: Input tidak valid. ${e.message}")
    } catch (e: Exception){
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    }
}