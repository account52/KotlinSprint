package lesson2

fun main() {

    val cristalOre = 7
    val ironOre = 11

    val buffCristalOre = cristalOre * BUFF_IN_PERCENT / 100
    val buffIronOre = ironOre * BUFF_IN_PERCENT / 100

    println("buff cristal ore: $buffCristalOre")
    println("buff iron ore: $buffIronOre")

}

const val BUFF_IN_PERCENT = 20