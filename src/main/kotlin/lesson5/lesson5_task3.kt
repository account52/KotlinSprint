package lesson5

fun main() {

    val numberOne = 12
    val numberTwo = 35

    val arrayNumbers = arrayOf(numberOne, numberTwo)

    println("Введите первое число от 0 до 42: ")
    val inputNumberOne = readln().toInt()

    println("Введите второе число от 0 до 42: ")
    val inputNumberTwo = readln().toInt()

    if (arrayNumbers.contains(inputNumberOne) && arrayNumbers.contains(inputNumberTwo)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (arrayNumbers.contains(inputNumberOne) || arrayNumbers.contains(inputNumberTwo)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}