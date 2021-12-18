package com.hyunjin.kotlinstudy

// "Hello, World!"을 출력하는 프로그램
fun main(args: Array<String>) {
    println("Hello, World!")
    val condition = true
    val condition2 = true

    if (condition) {
        // condition 이 true 일 때만 실행되는 코드
    } else {
        // condition 이  false 일 때만 실행되는 코드
    }

    // 코틀린
    val value = if (condition) {
        println("조건식이 참입니다.")
        10
    } else if (condition2) {
        println("첫 번째 조건식은 거짓이고, 두 번째 조건식은 참입니다.")
        20
    } else {
        println("모든 조건식이 거짓입니다.")
        30
    }


}

fun max(a: Int, b: Int) = if (a > b) a else b


