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

    println("test safe casting")
    val mixedData : List<Any> = listOf(
        "Smartphone",
        15000,
        UserProfile("Andi", null),
        "Laptop",
        50000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks : ${it.uppercase()}")
        }
    }

    val someObject : Any = 100

    val safeString = someObject as? String?: "Uknown String"
    println("Hasil cast + fallback  : $safeString")
    // Main kt sudah dijalankan, berhasil

    println("test red button !!")
    val toxicData: String? = null
    try{
        val length = toxicData?.length
    }catch(e: NullPointerException){
        println("CRASH NPE!! Jangan gunakan !! secara sembarangan.")
    }

//    val apiResponse : Map<String, String?> = mapOf("Status" to "200", "token" to null)
//    try{
//        val token = requireNotNull(apiResponse["token"]){
//            "CRITICAL EXCEPTION: TOken otentikasi tidak ditemukan api server!"
//        }
//    }catch(e:IllegalStateException){
//        println(e.message)
//    }

    println("tedt java interop")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()

    val statusLength = javaResponse!!.length
    println("STatus dari java : $javaResponse (Length: $statusLength)")

    runMockUnitTest()


}