fun main(args: Array<String>) {
    val myName: String = "Ernando"
    val myByteNumber: Byte = -128 //-127 to 128 8 bits
    val myShortNumber: Short = 32_767 //-32768 to 32767 16 bits
    val myIntNumber: Int = 2_147_483_647 //-2147483648 to 2147483647 32 bits
    val myLongNumber: Long = Long.MAX_VALUE //-9223372036854775808 to 9223372036854775807 64 bits
    val myFloatNumber: Float = Float.MIN_VALUE // -3.4028235E38 to 3.4028235E38 32 bits
    val myDoubleNumber: Double = Double.MAX_VALUE // -4.9E-324 to 1.7976931348623157E308 64 bits
    val myBoolean: Boolean = true // true or false
    val myChar: Char = 'a' // single character

    println("My name is $myName and I'm $myLongNumber years old.")
    println("My float number is $myFloatNumber")
    println("My double number is $myDoubleNumber")
    println("My int number is $myIntNumber")
    println("My short number is $myShortNumber")
    println("My byte number is $myByteNumber")
    println("My boolean value is $myBoolean")
    println("My char is $myChar")
    var myNumber = 10
    println(myNumber++)
    println(++myNumber)

}