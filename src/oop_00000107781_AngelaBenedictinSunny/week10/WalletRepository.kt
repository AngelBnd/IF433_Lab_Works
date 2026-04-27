package oop_00000107781_AngelaBenedictinSunny.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>();

    fun add(item : T){}
    fun getAll() : List<T>{return items}
}