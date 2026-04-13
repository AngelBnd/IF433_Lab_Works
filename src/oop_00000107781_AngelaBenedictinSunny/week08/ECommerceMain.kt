package oop_00000107781_AngelaBenedictinSunny.week08

fun main() {
    val rawApiData : List <Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not an Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD"),
    )

    val apiParse = ApiParser();
    for(raw in rawApiData) {
        try {
            val returnedObj = apiParse.parseProduct(raw)
            returnedObj?.let{
                apiParse.checkout(returnedObj)
            }
        }catch (e : Exception) {

        }
    }
}