package oop_00000107781_AngelaBenedictinSunny.week05

class MathHelper {

    fun hitungLuas(sisi : Int): Int{
        return sisi * sisi;
    }

    fun hitungLuas(panjang: Int, lebar:Int) : Int{
        return panjang * lebar;
    }

    fun hitungLuas(jariJari : Double) : Int{
        return (3.14 * jariJari * jariJari).toInt()
    }

}