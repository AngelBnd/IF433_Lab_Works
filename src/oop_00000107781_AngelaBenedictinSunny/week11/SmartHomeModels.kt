package oop_00000107781_AngelaBenedictinSunny.week11

data class SmartDevice(var name: String, val category: String, var isOnline: Boolean = false, var powerLoad: Int = 0)
fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad Watt"
}