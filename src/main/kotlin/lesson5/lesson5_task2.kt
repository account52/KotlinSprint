package lesson5

import java.time.LocalDate

fun main() {

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()

    val currentYear = LocalDate.now().year
    val userAge = currentYear - birthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться назад на главный экран"
    }

    println(resultText)
}

const val AGE_OF_MAJORITY = 18
