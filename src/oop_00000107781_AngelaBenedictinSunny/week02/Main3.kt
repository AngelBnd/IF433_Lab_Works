package oop_00000107781_AngelaBenedictinSunny.week02
import java.util.Scanner
fun main() {
    var enemyHp = 100
    val scanner = Scanner(System.`in`)
    var menuInput = 0;

    println("halo selamat datang ke gamenya oop ini")
    print("Masukkan nama heronya :")
    val namaHeroInput = scanner.nextLine()

    print("Masukkan stat Damageny brp : ")
    val damageInput = scanner.nextInt()

    val hero = Hero(namaHeroInput, baseDamage = damageInput)

    while(hero.isALive() && enemyHp > 0){
        println("1. Serang, 2. Kabur")
        println("pilih :")
        menuInput = scanner.nextInt()

        if(menuInput == 1) {
            hero.attack("the enemy")
            enemyHp -= hero.baseDamage
            enemyHp = maxOf(0, enemyHp)
            println("sisa hp musuh : ${enemyHp} ")
            if(enemyHp >= 0) {
                hero.takeDamage((10..20).random())
                println("sisa hp hero: ${hero.hp}")
            } else break
        } else if(menuInput == 2) {
            println("${hero.name} telah kabur, bye bye!")
            break;
        } else {
            println("pilih yg benar ya, 1 atau 2 aj")
        }
    }

    if(menuInput!=2){
        if(hero.isALive() ) println("yg menang adalah ${hero.name} dgn sisa hp ${hero.hp}")
        else println("musuh telah menang gg dgn sisa health ${enemyHp}")
    } else {
        println("karena ${hero.name} kabur dgn sisa health ${hero.hp}, maka secara implisit dia kalah, yahhh :(")
    }

}