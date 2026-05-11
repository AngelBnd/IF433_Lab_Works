package oop_00000107781_AngelaBenedictinSunny.week12


class InsufficientFundsException(
    val amount : Double,
    val balance : Double
) : Exception("Attempted $amount, balance: $balance")