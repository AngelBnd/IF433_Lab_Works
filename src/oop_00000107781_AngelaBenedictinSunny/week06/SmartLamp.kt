package oop_00000107781_AngelaBenedictinSunny.week06

class SmartLamp (override val id : String, override val name : String): SmartDevice, Switchable {
    override fun turnOn(){
        println("This smartlamp of id $id and name $name has turned on!")
    }

    override fun turnOff(){
        println("This smartlamp of id $id and name $name has turned OFF!")
    }
}