package oop_00000107781_AngelaBenedictinSunny.week08

fun main() {
    println("test safe calls & elvis")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("tujuan pengiriman: $destination")

    println("test let block")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPridce ?. let {
        price->
        val tax = price * 0.11
        "Transaksi Valid. HArga: Rp $price, Pajak Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di set!"
    println(receipt)
}