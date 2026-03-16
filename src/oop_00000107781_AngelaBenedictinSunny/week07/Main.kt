package oop_00000107781_AngelaBenedictinSunny.week07

fun main() {
//    println("=== TEST SINGLETON ===")
//    println("Status: ${DatabaseManager.connectionStatus}")
//    DatabaseManager.connect()
//
//    println("\n=== TEST COMPANION OBJECT ===")
//    val client = NetworkClient.createClient()
//    client.connect()

    println("\n===  TEST REGULAR CLASS ===")
    //Perubahan ke class DataUser, tadi tidak ganti
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 202)
    println("Hasil Copy : $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // error will appear because expression must be exhaustive
    val uiMessage = when(response){
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Tampilkan: ${response.message}"
    }
}