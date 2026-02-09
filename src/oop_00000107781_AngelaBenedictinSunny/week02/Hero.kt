package oop_00000107781_AngelaBenedictinSunny.week02

class Hero(
    val name: String,
    // Tadi aku lupa tambahin default argumentnya
    var hp: Int = 100,
    val baseDamage : Int
) {

    fun attack(targetName: String){
        println("$name menebas $targetName")
    }

    fun takeDamage(damage : Int){
        this.hp -= damage
        if(this.hp < 0) this.hp = 0
    }

    fun isALive() : Boolean{
        return this.hp > 0
    }

}
