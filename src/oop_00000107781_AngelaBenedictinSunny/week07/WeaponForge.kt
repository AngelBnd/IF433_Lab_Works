package oop_00000107781_AngelaBenedictinSunny.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword() : Weapon{
            val itemHolder = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(itemHolder, 50)
        }
        fun forgeEpicSword() : Weapon{
            val itemHolder = GameItem("Pedang Mata Elang", 65, ItemRarity.EPIC)
            return Weapon(itemHolder, 60)
        }
    }
}