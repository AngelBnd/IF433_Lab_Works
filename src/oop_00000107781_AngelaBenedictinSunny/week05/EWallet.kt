package oop_00000107781_AngelaBenedictinSunny.week05

class EWallet(accountName : String, var balance : Double) : PaymentMethod(accountName) {
    override fun processPayment(amount : Double) {
        if (balance < amount) {
            println("Saldo tidak cukup")
        } else {
            balance -= amount
            println("Saldo cukup")
        }
    }

    fun topUp(amount : Double) {
        balance += amount
        println("saldo berhasil tambah sbyk $amount sekarang menjadi $balance")
    }
}