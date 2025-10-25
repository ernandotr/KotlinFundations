fun main(args: Array<String>) {
    val myName: String = "Ernando"
    val myLongNumber: Long = 123_456_789_100_111_123
    val myFloatNumber: Float = 123.45f
    val myDoubleNumber: Double = 123.456789
    val myShortNumber: Short = 123
    val myByteNumber: Byte = 123
    val myBoolean: Boolean = true
    val myChar: Char = 'a'
    println("My name is $myName and I'm $myLongNumber years old.")
    println("My float number is $myFloatNumber")
    println("My double number is $myDoubleNumber")
    println("My short number is $myShortNumber")
    println("My byte number is $myByteNumber")
    println("My boolean value is $myBoolean")
    println("My char is $myChar")
    var myNumber = 10
    println(myNumber++)
    println(++myNumber)

}