package oop_00000107781_AngelaBenedictinSunny.week10

interface HasName {
    val name: String
}

class WalletRepository<T> {
    private val items = mutableListOf<T>();

    fun add(item : T){
        items.add(item)
    }
    fun getAll() : List<T>{return items}
    fun search(wantedItem : String) : List<T>   {
            return items.filter {
                it is HasName && it.name.contains(wantedItem, ignoreCase = true)
            }
//        val coinValid = wantedItem as? Coin
//        if(coinValid == null){
//            return null
//        } else {
//            val foundItems = mutableListOf<Coin>()
//            for(item in items){
//                var(name, balance) = item as Coin
//                if(name == coinValid.name){
//                    foundItems.add(item)
//                }
//            }
//            return foundItems;
        }


    }
