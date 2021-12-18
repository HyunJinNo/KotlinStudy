package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val value = 33

    when (value) {
        in 0..10 -> println("0 ~ 10 사이의 값")
        in 11..20 -> println("11 ~ 20 사이의 값")
        in 21..30 -> println("21 ~ 30 사이의 값")
        in 31..40 -> println("31 ~ 40 사이의 값")
        in 41..50 -> println("41 ~ 50 사이의 값")
        else -> println("0 미만 또는 50 초과")
    }
}

fun findType(value: Any) {
    val value1: Int
    val value2: Double
    val value3: Char
    val value4: String
    when (value) {
        is Int -> value1 = value
        is Double -> value2 = value
        is Char -> value3 = value
        is String -> value4 = value
        else -> {}
    }

    // (생략)
}


