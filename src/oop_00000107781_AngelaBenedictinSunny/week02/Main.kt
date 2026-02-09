package oop_00000107781_AngelaBenedictinSunny.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter ):")
    val nim = scanner.next()

    scanner.nextLine()


    if(nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti di sini untuk mahasiswa inim tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi objek karena data sudah aman
        val sl = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}