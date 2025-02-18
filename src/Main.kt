fun main() {
    var age: Int? = 25
    age = null
    println("Age: $age")

    var city: String? = "Kuwait"
    city = null

    val length = city?.length ?: 0
    println("City Length: $length")

    val validScore = 85.0
    val nullScore: Double? = null

    println("New score is valid input: ${addPoints(validScore)}")
    println("New score is null input: ${addPoints(nullScore)}")

}

fun addPoints(score: Double?): Double {
    return (score ?: 0.0) + 5.0
}

// new note