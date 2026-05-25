package oop_00000107781_AngelaBenedictinSunny.week14

interface Database {
    fun query(sql :String) : List <String>
}

class PostgresDatabase : Database {
    override fun query(sql :String) = listOf("pg_data1", "pg_data2");
}

class SafeUserDevice(private val db : Database) {
    fun getUser(id : Int) = db.query("SELECT * FROM users WHERE id = $id")
}