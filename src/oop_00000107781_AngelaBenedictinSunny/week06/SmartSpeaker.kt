package oop_00000107781_AngelaBenedictinSunny.week06

class SmartSpeaker(override val id : String, override val name : String ): SmartDevice, Switchable {
    override fun turnOn() {
        println("this smartspeaker of id $id and name $name has turned ON!")
    }
    override fun turnOff() {
        println("this smartspeaker of id $id and name $name has turned OFF!")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
