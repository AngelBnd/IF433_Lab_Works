package oop_00000107781_AngelaBenedictinSunny.week05

fun main() {
    val ewally : PaymentMethod = EWallet("Lalala", 50000.0)
    val credity : PaymentMethod = CreditCard("Hehehe", 100000.0, 0.0)

    val listyaya : List<PaymentMethod> = listOf(ewally, credity)

    for (ya in listyaya){
        // ya.processPayment(75000.0)
        when(ya){
            is EWallet ->{
                ya.topUp(50000.0)
            }
            is CreditCard ->{
                ya.processPayment(75000.0)
            }
        }
    }

    //Sebelumnya, aku salah kasih commit message lagi, maafkan ko
}