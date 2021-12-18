package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val arr = arrayOf("1", "12", "123")
    arr.find { it == "1" }?.let {
        println("A")
    }
    arr.find { it == "1234" }?.let {
        println("B")
    }
}

