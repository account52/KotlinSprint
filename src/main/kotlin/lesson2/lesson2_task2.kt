package lesson2

fun main() {

    val salaryEmployee = 30000
    val salaryIntern = 20000
    val countEmployees = 50
    val countInterns = 30

    val sumEmployees = salaryEmployee * countEmployees
    val totalSum = sumEmployees + salaryIntern * countInterns
    val averageSum = totalSum / (countEmployees + countInterns)

    println(sumEmployees)
    println(totalSum)
    println(averageSum)

}