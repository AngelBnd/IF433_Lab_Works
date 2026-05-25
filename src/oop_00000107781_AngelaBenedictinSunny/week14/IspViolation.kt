package oop_00000107781_AngelaBenedictinSunny.week14


//class yang mengimplementasi interface ini ga pake semuanya, jadi interfacenya kegemukan
interface MultifunctionDevice{
    fun print(doc : String)
    fun scan(doc : String) : String
    fun fax(doc : String)
}

class SimplePrinter : MultifunctionDevice{
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("NO scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("NO fax")
}