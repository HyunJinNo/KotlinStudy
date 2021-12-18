package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val number = try {
        print("입력: ")
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }

    println("입력한 값: $number")
}





fun getPositiveNumber(number: Int) {
    val num = if (number < 0) {
        throw IllegalArgumentException("입력받은 값: 음수")
    } else {
        println("입력받은 값: $number")
        number
    }
}

