package lesson4

fun main() {

    val tablesBusyToday = 13
    val tablesBusyTomorrow = 9

    val availToday = tablesBusyToday < TOTAL_TABLES
    val availTomorrow = tablesBusyTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня: $availToday\nДоступность столиков на завтра: $availTomorrow")

}

const val TOTAL_TABLES = 13