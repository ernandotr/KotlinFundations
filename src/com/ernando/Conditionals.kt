fun main() {
    val x = 10
    val y = 9

    if (x > y) {
        println("X is greater than Y")
    } else if (x < y) {
        println("X is less than Y")
    } else {
        println("X is equal to Y")
    }

    var grade = "C"
    val result = when (grade) {
        "A","a" -> "Excellent!"
        "B","b" -> "Very Good!"
        "C","c" -> "Nice work!"
        "D","d" -> "OK!"
        "E","e" -> "Hmmm..."
        "F","f" -> "Better luck next time!"
        else -> "Invalid grade!"
    }
    println(result)
}