package oop_00000107781_AngelaBenedictinSunny.week05

abstract class PaymentMethod(val accountName : String) {
    abstract fun processPayment(amount : Double)
}