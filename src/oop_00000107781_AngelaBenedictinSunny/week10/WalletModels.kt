package oop_00000107781_AngelaBenedictinSunny.week10

data class Coin( override val name : String, val balance: Double) : HasName
data class Transaction(val id: String, val amount: Double)