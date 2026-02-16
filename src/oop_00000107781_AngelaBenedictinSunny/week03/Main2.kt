package oop_00000107781_AngelaBenedictinSunny.week03

fun main(){
    val weaponYes = Weapon();
    weaponYes.damage = -50
    println(weaponYes.damage)
    weaponYes.damage = 9999
    println(weaponYes.damage)
    println(weaponYes.tier)

    val playerYes = Player("Momo");
//    player.xp = 20
    playerYes.addXp(50)
    playerYes.addXp(60)

}