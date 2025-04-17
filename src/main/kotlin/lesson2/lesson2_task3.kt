package lesson2

fun main() {

    val timeStart = "9:23"
    val duration = 457

    val list: List<String> = timeStart.split(":")
    val startHours = list[0].toInt()
    val startMinutes = list[1].toInt()

    val hoursOnWay = duration / MINUTES_IN_HOUR
    val minutesOnWay = duration - (hoursOnWay * MINUTES_IN_HOUR)

    var finishMinutes = startMinutes + minutesOnWay

    var finishHours = startHours + hoursOnWay

    if (finishMinutes >= 60) {
        finishHours += 1
        finishMinutes -= 60
    }

    println("finish time - ${finishHours.toString().padStart(2, '0')}:${finishMinutes.toString().padStart(2, '0')}")
}

const val MINUTES_IN_HOUR = 60