package com.hyunjin.kotlinstudy

class TwoValues(val left: Int, val right: Int) {
    operator fun contains(value: Int) = value >= left && value <= right
}

fun main(args: Array<String>) {
    val twoValues = TwoValues(10, 20)
    println(15 in twoValues)
    println(9 in twoValues)
    println(25 in twoValues)
}


