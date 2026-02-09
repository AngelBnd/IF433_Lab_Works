package oop_00000107781_AngelaBenedictinSunny.week02

class Loan (
    val bookTitle : String,
    val borrower : String,
    val loanDuration : Int = 1

) {
    fun calculateFine(): Int{
        if(this.loanDuration > 3) {
            return (this.loanDuration - 3) * 2000
        } else {
            return 0
        }
    }

}