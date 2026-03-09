package oop_00000107781_AngelaBenedictinSunny.week06

interface Clickable {

    //Property di dlm interface tidak boleh pny backing dield
    // utk memperbaiki, jgn dikasih nilai default yg hrs disimpan
    val name : String

    //function without a body, implicitly abstract
    fun click()
}