package oop_00000107781_AngelaBenedictinSunny.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("ETH", 24.0))
    coinRepo.add(Coin("BTC", 22.0))
    coinRepo.add(Coin("USDT", 20.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("DASHBOARD COIN ${response.status}")
    for(coin in response.data){
        println("Name: ${coin.name} Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("2XS", 214.0))
    txRepo.add(Transaction("4XL", 224.0))
    txRepo.add(Transaction("5XS", 204.0))
}