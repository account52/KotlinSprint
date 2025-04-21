package lesson3

fun main() {

    val str = "D2-D4;0"

    val contains = str.contains("-")

    if (contains) {
        val newStr = str.replace("-", ";")
        val listStr = newStr.split(";")

        val stepFrom = listStr[0]
        val stepTo = listStr[1]
        val stepNumber = listStr[2]

        println(stepFrom)
        println(stepTo)
        println(stepNumber)

    } else {
        println("Неверный формат!")
    }
}