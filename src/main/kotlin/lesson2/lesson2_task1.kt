package lesson2

fun main() {

    val totalStudents = 4
    val scoreStudent1 = 3
    val scoreStudent2 = 4
    val scoreStudent3 = 3
    val scoreStudent4 = 5
    val result = (scoreStudent1 + scoreStudent2 + scoreStudent3 + scoreStudent4) / totalStudents

    println(String.format("%.2f", result.toDouble()))

}
