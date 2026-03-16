package oop_00000107781_AngelaBenedictinSunny.week07

class GameExecutor {

}

fun processEvent(event: BattleState){
    val message = when(event){
        is BattleState.MonsterEncounter -> "Encountered a mosnter! You are dealing with ${event.monsterName}"
        is BattleState.LootDropped -> "You picked up an item! ${event.item.name} rarity ${event.item.rarity.name}"
        is BattleState.GameOver -> "GameOver! It's over because of ${event.reason}"
        is BattleState.SafeZone -> "You are in safe zone."
    }

    println(message)
}


