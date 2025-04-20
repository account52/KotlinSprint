package lesson2

fun main() {

    val timeStart = "9:23"
    val duration = 457

    val listPartsOfTime: List<String> = timeStart.split(":")
    val startHours = listPartsOfTime[0].toInt()
    val startMinutes = listPartsOfTime[1].toInt()

    val hoursOnWay = duration / MINUTES_IN_HOUR
    val minutesOnWay = duration - (hoursOnWay * MINUTES_IN_HOUR)

    var finishMinutes = startMinutes + minutesOnWay

    var finishHours = startHours + hoursOnWay

    if (finishMinutes >= MINUTES_IN_HOUR) {
        finishHours += 1
        finishMinutes -= MINUTES_IN_HOUR
    }

    val strHours = "%s".format(finishHours).padStart(2, '0')
    val strMinutes = "%s".format(finishMinutes).padStart(2, '0')

    println("finish time - $strHours:$strMinutes")

}

const val MINUTES_IN_HOUR = 60
