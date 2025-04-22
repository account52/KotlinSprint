package lesson3

fun main() {

    val str = "D2-D4;0"

    val listStr = str.split("-", ";")
    if (listStr.count() == 3) {
        val stepFrom = listStr[0]
        val stepTo = listStr[1]
        val stepNumber = listStr[2]

        println(stepFrom)
        println(stepTo)
        println(stepNumber)
    } else {
        println("Неверный формат входящих данных!")
    }

}