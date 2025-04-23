package lesson5

fun main() {

    val range = 0..42
    val randomListNumbers = range.shuffled().take(3)

    println("Введите первое число от 0 до 42: ")
    val inputNumber1 = readln().toInt()

    println("Введите второе число от 0 до 42: ")
    val inputNumber2 = readln().toInt()

    println("Введите третье число от 0 до 42: ")
    val inputNumber3 = readln().toInt()

    val inputListNumbers: List<Int> = listOf(inputNumber1, inputNumber2, inputNumber3)

    val commonList = randomListNumbers.intersect(inputListNumbers).toList()
    val commonListSize = commonList.size

    when (commonListSize) {
        3 -> println("Поздравляем! Вы угадали три числа и выиграли Джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и выиграли крупный приз!")
        1 -> println("Вы угадали одно число. Утешительный приз ждет вас!")
        else -> println("Вы не угадали не одного числа!")
    }

    println("Выигрышные числа: $randomListNumbers")

}