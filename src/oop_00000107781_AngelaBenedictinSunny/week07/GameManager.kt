package oop_00000107781_AngelaBenedictinSunny.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        if(!isGameRunning){
            println("Memulai game engine...")
            isGameRunning = true
        }
            else println("Game sudah berjalan! Mencegah instansiasi ganda")
    }
}