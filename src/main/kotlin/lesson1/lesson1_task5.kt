package lesson1

fun main() {

    val totalSeconds = 6480

    val secondsInHour = 3600
    val secondsInMinute = 60

    val hours = totalSeconds / secondsInHour
    val minutes = (6480 - hours * secondsInHour) / secondsInMinute
    val seconds = 6480 - hours * secondsInHour - minutes * secondsInMinute

    val strHours = hours.toString().padStart(2, '0')
    val strMinutes = minutes.toString().padStart(2, '0')
    val strSeconds = seconds.toString().padStart(2, '0')

    println("$strHours:$strMinutes:$strSeconds")

}