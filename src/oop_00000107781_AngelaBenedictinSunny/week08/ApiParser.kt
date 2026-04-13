package oop_00000107781_AngelaBenedictinSunny.week08

class ApiParser {
    fun parseProduct(rawJson : Map<String, Any?>) : Product? {
        var id : Any = ""
        var name : Any = ""
        try{
            id  = requireNotNull(rawJson["id"]) {"API invalid : missing ID"}
            name  = requireNotNull(rawJson["name"]) {"API invalid : missing name"}
       }catch(e : IllegalArgumentException){
           println("CRASH NPE!! Jangan gunakan !! secara sembarangan.")
       }
        val type : String = rawJson["type"] as? String ?: return null
        if(type == "ELECTRONIC"){
            val warranty : Int = rawJson["warranty"] as? Int ?: 12
            return Electronic(id.toString(), name.toString(), warranty)
        } else if(type == "CLOTHING"){
            val size : String = rawJson["size"] as? String ?: "All size"
            return Clothing(id.toString(), name.toString(), size)
        } else return null
    }

}