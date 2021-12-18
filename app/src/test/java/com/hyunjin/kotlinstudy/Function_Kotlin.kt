package com.hyunjin.kotlinstudy

import kotlin.math.exp

fun main(args: Array<String>) {
    val num = 2.1
    println(num.squared(2.5))
    println(num squared 2.5)
}

infix fun Double.squared(n: Double) = exp(n)




