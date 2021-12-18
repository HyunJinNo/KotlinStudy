package com.hyunjin.kotlinstudy

val String?.len
    get() = this?.length ?: 0

fun main(args: Array<String>) {
    val str1: String? = "Kotlin"
    println(str1.len)

    val str2: String? = null
    println(str2.len)

    val str3: String = "Java"
    println(str3.len)
}



