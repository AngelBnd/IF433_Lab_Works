package oop_00000107781_AngelaBenedictinSunny.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // polymorphism collection: List yang berisit tipe Parent yaitu pegawai, tapi isinya objek Anak yaitu dosen dan admin
    val daftarPegawai : List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        // Pemanggilan runtime polymorphism
        pegawai.bekerja()

        //pegawai.mengajar()
        // error karena tipe referensinya itu pegawai (?)
        when(pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosem (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------")
    }
}