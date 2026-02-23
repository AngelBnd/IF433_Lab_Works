package oop_00000107781_AngelaBenedictinSunny.week04

fun main(){
    println("--- Testing vehicle ---");
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Toyota", 4, 20)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    // ini buat test kalo class class yang telah dibuat itu berjalan atau tidak
//    println("\n--- Employee Thing---")
//    val managerTest = Manager("Robert", 20000)
//    val bonusTest = managerTest.calculateBonus();
//    println(bonusTest)
}