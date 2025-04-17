package lesson2

fun main() {

    val salaryEmployee = 30000
    val salaryIntern = 20000

    val countEmployees = 50
    val countInterns = 30

    val sumEmployees = getSum(salaryEmployee, countEmployees)
    val totalSum = sumEmployees + getSum(salaryIntern, countInterns)
    val averageSum = totalSum / (countEmployees + countInterns)

    println(sumEmployees)
    println(totalSum)
    println(averageSum)


}

fun getSum(a: Int, b: Int): Int {

    return a * b
}