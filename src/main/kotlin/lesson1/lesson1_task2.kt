package lesson1

fun main() {
    val totalOrders: Int = 75
    val textAfterBuy: String = """Спасибо за покупку!
        |Мы рады, что вы выбрали наш магазин! Надеемся, что наши товары принесут вам радость и удовлетворят все ваши ожидания.""".trimMargin()

    println(totalOrders)
    println(textAfterBuy)

    var countOfEmployees = 2000
    //println("countOfEmployees = $countOfEmployees")
    countOfEmployees -= 1
    println("countOfEmployees = $countOfEmployees")
}