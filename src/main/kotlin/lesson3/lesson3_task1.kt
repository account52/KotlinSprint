package lesson3

fun main() {

    val nameUser = "Артем"
    val morningGreeting = "Доброе утро!"
    val eveningGreeting = "Добрый вечер!"

    var greeting = "$morningGreeting $nameUser"
    println(greeting)

    greeting = "$eveningGreeting $nameUser"
    println(greeting)

}