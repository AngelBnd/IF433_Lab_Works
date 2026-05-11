package oop_00000107781_AngelaBenedictinSunny.week12

fun dispenseKibble(requestedGram:Int, availableGram:Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if(isJammed){
        throw DispenserJamException();
    }

    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    } else {
        println("Kibble berhasil dikeluarkan!")
        return availableGram - requestedGram
    }
}

fun main(){
    var currentKibbleStock = 50

    try{
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e : DispenserJamException){
        println("${e.message}")
    } catch (e : FoodEmptyException){
        println("${e.message}")
    } catch (e : Exception){
        println("caught general error")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai")
    }

    runCatching{ dispenseKibble(requestedGram = 30,
        availableGram = 1000, isJammed = false) }
        .onSuccess {
            newStock -> currentKibbleStock = newStock
            println("makan sore sukses! sisa stok kibble: $currentKibbleStock gr.")
        }
}

