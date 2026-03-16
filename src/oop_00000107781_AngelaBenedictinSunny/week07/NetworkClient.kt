package oop_00000107781_AngelaBenedictinSunny.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Conencting to $url...")
    }
}