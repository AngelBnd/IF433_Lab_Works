package oop_00000107781_AngelaBenedictinSunny.week06

// override value bisa di primary constructor
// class button implementasi interface clickable
class Button(override val name : String) : Clickable {
    override fun click(){
        println("Tombol '$name' berhaisl diklik!" )
    }  }