package oop_00000107781_AngelaBenedictinSunny.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>();

    fun add(item : T){
        items.add(item)
    }
    fun getAll() : List<T>{return items}
    fun <T : Any> search(wantedItem : T) : List<Coin>? {
        val coinValid = wantedItem as? Coin
        if(coinValid == null){
            return null
        } else {
            val foundItems = mutableListOf<Coin>()
            for(item in items){
                var(name, balance) = item as Coin
                if(name == coinValid.name){
                    foundItems.add(item)
                }
            }
            return foundItems;
        }


    }
}