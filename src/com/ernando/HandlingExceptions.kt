fun main() {
    println("Enter a number: ")
    val number = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    try {
        val result = number / 0
        println("The result is: $result")
    } catch (e: ArithmeticException) {
        println("You cannot divide a number by zero.")
    } finally {
        println("Finally block is always executed.")
    }
    println("Your number is: $number")
}