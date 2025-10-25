fun main(args: Array<String>) {
    val myNumber: Int = 100
    val myDecimal: Double = 1.00
    val myLongNumber: Long = 1000000004
    val myBoolean: Boolean = true
    val myChar: Char = 'a'
    val myString: String = "     Hello World"

    println(myNumber.toChar())
    println(myDecimal.toInt())
    println(myLongNumber.toChar())
    println(myBoolean.toString())
    println(myChar.code)
    println(myString)
    println(myString.length)
    println(myString[1])
    println(myString.uppercase())
    println(myString.lowercase())
    println(myString.trim())

}