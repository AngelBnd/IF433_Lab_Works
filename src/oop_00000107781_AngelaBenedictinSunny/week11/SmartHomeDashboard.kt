package oop_00000107781_AngelaBenedictinSunny.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.apply{
        add(SmartDevice("Lampu Pintar", "Lighting", true, 12))
    }.also{
        println("Added ${it}");
    }
}