package oop_00000107781_AngelaBenedictinSunny.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja(){
        println("[$nama] sedang menyiapkan materi perkuliahan dan mereivisi RKPKS. ")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}