package oop_00000107781_AngelaBenedictinSunny.week14

class MySQLDatabase{
    fun query(sql : String) : List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase() // Ini hard coded, so it is tightly coupled!
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id = $id")
}