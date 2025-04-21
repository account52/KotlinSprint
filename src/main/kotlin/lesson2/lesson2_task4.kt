package lesson2

fun main() {

    val cristalOre = 7
    val ironOre = 11

    val buffCristalOre = cristalOre * BUFF_IN_PERCENT / HUNDRED_PERCENT
    val buffIronOre = ironOre * BUFF_IN_PERCENT / HUNDRED_PERCENT

    println("buff cristal ore: $buffCristalOre")
    println("buff iron ore: $buffIronOre")

}

const val BUFF_IN_PERCENT = 20
const val HUNDRED_PERCENT = 100