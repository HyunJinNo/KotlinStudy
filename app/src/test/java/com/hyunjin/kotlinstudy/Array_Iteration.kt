package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5)
    arr.forEach {
        println(it)
    }
    for (value in arr) {
        println(value)
    }
}

