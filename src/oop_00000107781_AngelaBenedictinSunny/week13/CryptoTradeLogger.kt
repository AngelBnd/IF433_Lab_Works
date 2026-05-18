package oop_00000107781_AngelaBenedictinSunny.week13
import java.io.File

data class TradeRecord(val id: Int, val symbol: String, val type : String, val margin : Double, val pnl : Double)

fun TradeRecord.toCsv() : String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String) : TradeRecord? {

//    val returnedObj = TradeRecord(splitted[0].toInt(), splitted[1], splitted[2], splitted[3].toDouble(), splitted[4].toDouble())
//
//    if(returnedObj != null){ return returnedObj } else return null
    try {
        val splitted = line.split(",")
        return TradeRecord(splitted[0].toInt(), splitted[1], splitted[2], splitted[3].toDouble(), splitted[4].toDouble())
    } catch ( e : Exception ) {
        println("(Log) Data Korup diabaikan: $line");
        return null;
    }
}

fun saveTrades(trades : List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach{
            println(it.toCsv());
        }
    }
}

fun loadTrades(path: String) : List<TradeRecord> {
    try{
        File(path).readLines().mapNotNull{ fromCsvTrade(it) }
    }
}

fun main(){
;
}