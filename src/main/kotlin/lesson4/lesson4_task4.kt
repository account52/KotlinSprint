package lesson4

fun main() {

    val dayNumber = 5
    val doGroup1 = (dayNumber % 2 != 0)
    val doGroup2 = (dayNumber % 2 == 0)

    println("""Упражнения для рук:    $doGroup1
    |Упражнения для ног:    $doGroup2    
    |Упражнения для спины:  $doGroup2
    |Упражнения для пресса: $doGroup1
    """.trimMargin())

}