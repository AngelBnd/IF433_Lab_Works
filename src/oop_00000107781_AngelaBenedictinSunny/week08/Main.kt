package oop_00000107781_AngelaBenedictinSunny.week08

fun main() {
    println("test safe calls & elvis")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("tujuan pengiriman: $destination")
}