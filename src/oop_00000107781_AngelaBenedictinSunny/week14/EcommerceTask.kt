package oop_00000107781_AngelaBenedictinSunny.week14
import java.io.File

class BadOrderProcessor{
    // VIOLATION : Hardcoded FIle I/O (DIP), melakukan kalkulasi + I/O + Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        //VIOLATION: kaku kalau ada tipe customer atau diskon baru di masa depan (OCP)
        val finalPrice = when(customerType){
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.9
            else -> basePrice
        }

        println("Memproses pesanan $itemName sharga $finalPrice")

        //VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP : Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName anda telah dikonfirmasi!")
    }
}

interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService{
    fun sendNotification(title: String, message: String)
}

class CsvOrderRepository(val db : Database, val file : File) : OrderRepository{
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String){
        file.appendText("$itemName,$finalPrice,$customerType\n")

    }
}

class EmailNotifier : NotificationService{
    override fun sendNotification(title: String, message: String) {
        println(title)
        println(message)
    }
}

interface PricingStrategy {
    fun calculate(price: Double) : Double
}

class VipPricing : PricingStrategy{
    override fun calculate(price: Double) = (price * 0.9)
}

class RegularPricing : PricingStrategy{
    override fun calculate(price: Double) = (price)
}

class SafeOrderProcessor(private val repo : OrderRepository,private val notifier : NotificationService, private val pricingStrategy : PricingStrategy){
    fun processOrder(itemName : String, basePrice : Double, customerType: String){
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName sharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Notifikasi","Email terkirim : Pesanan $itemName Anda telah dikonfirmasi!")
    }
}





