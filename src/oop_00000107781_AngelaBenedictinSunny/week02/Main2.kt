package oop_00000107781_AngelaBenedictinSunny.week02

import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val peminjam = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var lamaPinjam = scanner.nextInt()

    if(lamaPinjam < 0) lamaPinjam  = 1;

    val loan = Loan(judul, peminjam, lamaPinjam)
    println(" judul : ${loan.bookTitle}, peminjam : ${loan.borrower}, lama pinjam : ${loan.loanDuration} ")
    println("brp byk denda : Rp ${loan.calculateFine()}")
}