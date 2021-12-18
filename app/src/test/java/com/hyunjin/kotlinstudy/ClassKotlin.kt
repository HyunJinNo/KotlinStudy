package com.hyunjin.kotlinstudy

enum class Week(val num: Int) {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    fun number() = num
}

fun main(args: Array<String>) {
    val sunday = Week.SUNDAY
    println(sunday)
    println(sunday.number())
}


