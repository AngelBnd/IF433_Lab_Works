package oop_00000107781_AngelaBenedictinSunny.week08

class NotificationService {
    fun sendEmail(emailAddress:  String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else println("user ${user.name} tidak memiliki email.")
    }

}