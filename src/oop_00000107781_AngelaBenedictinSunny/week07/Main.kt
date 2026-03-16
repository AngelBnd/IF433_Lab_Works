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
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("TUGAS MANDIRI")
    GameManager.startGame()
    GameManager.startGame()

    // Item bisa diset null, suapaya kedepannya bisa dibikin item baru lagi yang custom. Kalau null, artinya sword yang dibikin itu defaultnya (Yang di modul)
    val firstWeapon = Weapon.forgeStarterSword(null);
    println("Senjata pertama telah dibuat!\n Nama : ${firstWeapon.item.name}\n Damage : ${firstWeapon.item.damage}\n Rarity : ${firstWeapon.item.rarity}\n Durability : ${firstWeapon.durability}")

    println("Player pergi ke Blacksmith buat upgrade ${firstWeapon.item.name}")
    println("Damage ditingkatkan menjadi 25!")
    val gameItemButUpgraded = firstWeapon.item.copy(damage=25)
    val upgradaedfirstWeapon = Weapon.forgeStarterSword(gameItemButUpgraded);
    println("Senjata telah diupgrade!\n Nama : ${upgradaedfirstWeapon.item.name}\n Damage : ${upgradaedfirstWeapon.item.damage}\n Rarity : ${upgradaedfirstWeapon.item.rarity}\n Durability : ${upgradaedfirstWeapon.durability}")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(gameItemButUpgraded))
    processEvent(BattleState.GameOver("Terkena jebakan racun, aw!"))



}