package oop_00000107781_AngelaBenedictinSunny.week14

interface DiscountStrategy{
    fun appy(price : Double) : Double
}

class StudentDiscount : DiscountStrategy{
    override fun appy(price : Double) : Double = price * 0.80
}

class MemberDiscount : DiscountStrategy{
    override fun appy(price : Double) : Double = price * 0.85
}