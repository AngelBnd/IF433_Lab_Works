package oop_00000107781_AngelaBenedictinSunny.week06

class SmartCCTV(override val id : String, override val name : String) : SmartDevice, Switchable, Recordable {
    override fun turnOff(){
        println("This SmartCCTV of id $id and name $name has turned OFF!")
    }

    override fun startRecord() {
        println("This SmartCCTV of id $id and name $name is starting to record!")
    }
    override fun turnOn(){
        println("This SmartCCTV of id $id and name $name has turned on!")
        startRecord()
    }

}