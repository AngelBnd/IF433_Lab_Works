package oop_00000107781_AngelaBenedictinSunny.week03

class Player (val username : String) {
    private var xp : Int = 0

    val level : Int
        get() = (xp/100) + 1

    fun addXp(amount : Int){
        if(amount < 0){
            println("Xp tidak boleh negatif!")
            return;
        }
        val levelBefore : Int = level
        xp += amount
        if(level > levelBefore){
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}