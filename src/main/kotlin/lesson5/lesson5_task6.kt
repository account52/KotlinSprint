package lesson5

fun main() {

    println("Введите вес в кг:")
    val weight = readln().toDouble()

    println("Введите рост в см:")
    val height = readln().toFloat() / 100

    val bodyIndex = weight / (height * height)

    when {
        bodyIndex < LOWER_LIMIT -> println("Недостаточная масса тела")
        bodyIndex >= LOWER_LIMIT && bodyIndex < TRANSITIONAL_LIMIT -> println("Нормальная масса тела")
        bodyIndex >= TRANSITIONAL_LIMIT && bodyIndex < UPPER_LIMIT -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }

    println("Индекс массы тела: ${String.format("%.2f", bodyIndex)}")

}

const val LOWER_LIMIT = 18.5
const val TRANSITIONAL_LIMIT = 25
const val UPPER_LIMIT = 30