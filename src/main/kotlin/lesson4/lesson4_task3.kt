package lesson4

fun main() {

    val weatherToday = true
    val openTent = true
    val humidity = 20
    val season = "зима"

    val result = weatherToday && openTent && (humidity == FAVORABLE_HUMIDITY) && (season != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых: $result")

}

const val FAVORABLE_HUMIDITY = 20
const val BAD_SEASON = "зима"
