package oop_00000107781_AngelaBenedictinSunny.week13
import java.io.File
import java.io.FileNotFoundException

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
            out.println(it.toCsv());
        }
    }
}

fun loadTrades(path: String) : List<TradeRecord> {
    try{
        return File(path).readLines().mapNotNull{ fromCsvTrade(it) }
    } catch ( e : FileNotFoundException) {
        println("(Log) Data Korup diabaikan: $path");
        return listOf()
    }
    // revisi
}

fun main(){

    val mockTrades = listOf(
        TradeRecord(
            id = 1,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 1500.0,
            pnl = 320.5
        ),
        TradeRecord(
            id = 2,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 2000.0,
            pnl = -120.75
        ),
        TradeRecord(
            id = 3,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 1000.0,
            pnl = 540.0
        ),
        TradeRecord(
            id = 4,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 800.0,
            pnl = 210.3
        ),
        TradeRecord(
            id = 5,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 1200.0,
            pnl = -95.4
        ),
        TradeRecord(
            id = 6,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 950.0,
            pnl = 430.8
        )
    )

   saveTrades(mockTrades, "crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    println("loadedData: $loadedData")

    val totalPnl = loadedData.sumOf{it.pnl}

    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}