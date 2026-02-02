package oop_00000107781_AngelaBenedictinSunny.week01

fun main() {
    val gameTitle: String
    val price: Int
    var userNote : String? = null

    // initial price value
    price = 20000

    printReceipt(title = "Test", finalPrice = calculateDiscount(price), userNote = userNote)
}

fun calculateDiscount(price: Int) : Int = if(price > 500000) (price - (price * 0.2)).toInt() else (price - (price * 0.1)).toInt()
fun printReceipt(title: String, finalPrice: Int, userNote : String?) {
    println("RECEIPT : Judul $title dan harga final $finalPrice \nCatatan : ${userNote?: "Tidak ada catatan."} ")
}