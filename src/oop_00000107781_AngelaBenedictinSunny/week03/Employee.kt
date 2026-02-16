package oop_00000107781_AngelaBenedictinSunny.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            // Ini merupakan kesalahan fatal karena this.salary panggil setternya, jadi recursive.
            println("Mencoba set gaji ke : $value")
            this.salary = value
        }
}

