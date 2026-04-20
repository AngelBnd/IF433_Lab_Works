package oop_00000107781_AngelaBenedictinSunny.week09

fun main(){
    val tradeHistory = listOf<TradeLog>(TradeLog("ETHUSDT","Up",20, 20.0,"OPEN"),
        TradeLog("BTCUSDT","Up",30, -20.0,"OPEN"),
        TradeLog("ETHUSDT","DontKnow",50, 20.0,"CLOSED"),
        TradeLog("ETHUSDT","Ok",2, -20.0,"CLOSED"),
        TradeLog("BTCUSDT","Down",10, 20.0,"OPEN"))
}


// data class TradeLog(val pair: String, val position: String,
                //    val leverage: Int, val roe:Double, val status: String)
