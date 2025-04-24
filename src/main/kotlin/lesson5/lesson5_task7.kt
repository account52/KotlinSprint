package lesson5

fun main() {

    println("Введите расстояние поездки в км:")
    val distance = readln().toFloat()

    println("Введите расход топлива на 100 км в литрах:")
    val fuelFlow = readln().toFloat()

    println("Введите цену за литр топлива:")
    val price = readln().toFloat()

    val totalFuel = (distance * fuelFlow) / 100
    val totalPrice = totalFuel * price

    println("Общее количество топлива для поездки: ${String.format("%.2f", totalFuel)}\n" +
            "Итоговая стоимость топлива для поездки: ${String.format("%.2f", totalPrice)}")

}