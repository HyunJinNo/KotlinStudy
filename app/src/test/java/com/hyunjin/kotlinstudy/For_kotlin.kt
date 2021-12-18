package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val list = arrayListOf(10, 20, 30)
    for (num in list) {
        print("$num ")
    }
    println()

    for (i in list.indices) {
        print("${list[i]} ")
    }
    println()

    for ((index, value) in list.withIndex()) {
        println("index: $index, value: $value")
    }
}


