package oop_00000107781_AngelaBenedictinSunny.week06


// fungsi ini devoupled, karena fungsinya tidak peduli kelas aslinya apa
// method merupakan properti dengan data type interface PaymentMethod, nanti fungsi yang mana yang dieksekusi itu tergantung dari jenis class yang dioper ke dalam fungsinya.
fun processCheckout(method: PaymentMethod, amount : Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // TUGAS MANDIRI
    println("MULAI TUGAS MANDIRI DARI SEKARANG")
    val sl = SmartLamp("sl1", "Ruang Tamu")
    val ss = SmartSpeaker("ss1", "Google Nest Dapur")
    val scctv = SmartCCTV("scctv1", "Ezviz Garasi")

    val hub = SmartHomeHub();
    hub.addDevice(sl);
    hub.addDevice(ss);
    hub.addDevice(scctv);

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

}