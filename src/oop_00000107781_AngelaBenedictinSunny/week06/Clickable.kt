package oop_00000107781_AngelaBenedictinSunny.week06

interface Clickable {

    //Property di dlm interface tidak boleh pny backing dield
    val name : String = "Tombol Rahasia"

    //function without a body, implicitly abstract
    fun click()
}