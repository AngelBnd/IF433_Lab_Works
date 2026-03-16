package oop_00000107781_AngelaBenedictinSunny.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" // Shared constant, variable that will be shared among the instances

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL : $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect(){
        println("Conencting to $url...")
    }
}