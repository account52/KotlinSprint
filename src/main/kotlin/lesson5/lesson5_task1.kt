package lesson5

fun main() {

    val number1 = 5
    val number2 = 12

    println("Введите сумму чисел $number1 и $number2")

    val inputNumber = readln().toInt()

    if (inputNumber == (number1 + number2)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}