package oop_00000107781_AngelaBenedictinSunny.week05

class CreditCard (accountName : String, val limit : Double, var usedAmount : Double = 0.0): PaymentMethod(accountName) {
    override fun processPayment(amount : Double){
        if((usedAmount + amount) < limit){
            usedAmount += amount
            println("cetak transaksi berhasil")
        } else {
            println("cetak transaksi ditolak")
        }
    }
}