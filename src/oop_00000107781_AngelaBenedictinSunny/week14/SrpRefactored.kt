package oop_00000107781_AngelaBenedictinSunny.week14

class UserValidator{
    fun validate(user : User) : Boolean = user.email.contains("@") && user.age >= 18
}

class userRepository{
    fun save(user: User){
        println("Saving user: ${user.name} to Database")
    }
}