package oop_00000107781_AngelaBenedictinSunny.week13
import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // bahaya kalo terjadi exception di sini, ananti write ga ke close

    writer.close()
    println("Proses penulisan unsafe selesai.")

}