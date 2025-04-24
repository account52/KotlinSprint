package lesson5

fun main() {

    val name = "Zaphod"
    val password = "PanGalactic"

    println("Введите имя пользователя: ")
    val inputName = readln()

    if (inputName != name) {
        println("Вам необходимо зарегистрироваться в системе!")
        return
    }

    println("Введите пароль: ")
    val inputPassword = readln()

    if (inputPassword == password) {
        println("Добро пожаловать!")
    }

}