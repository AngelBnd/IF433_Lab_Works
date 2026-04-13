package oop_00000107781_AngelaBenedictinSunny.week08

object DatabaseMock{
    fun findUser(id : Int) : UserProfile?{
        return if(id==1) UserProfile("TestUSer", "test@testemail.com") else null
    }
}

fun runMockUnitTest(){
    println("running unit test")
    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "1") {"Test failed! Initial is wrong."}
    println("Test Passed: Initial is T")
}