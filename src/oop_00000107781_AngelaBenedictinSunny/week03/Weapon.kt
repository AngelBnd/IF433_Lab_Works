package oop_00000107781_AngelaBenedictinSunny.week03

class Weapon {
    private var name : String = ""

    var damage: Int = 0
        set(value){
            if(value < 0) {
                println("Damage tidak boleh negatif!")
            } else if(value > 1000){
                println("Damage tidak bisa di atas 1000, damage kini 1000")
                field = 1000
            } else {
                field = value
            }
        }

    val tier : String
        get(){
            if(damage>800){
                return "Legendary"
            } else if(damage>500){
                return "Epic"
            } else {
                return "Common"
            }
        }
}