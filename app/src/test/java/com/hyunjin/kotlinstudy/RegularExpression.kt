package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val str = "a,b c d,e,f,g h i,j"
    val regex = Regex("[, ]+")
    for (value in str.split(regex)) {
        print("$value ")
    }
    println()
    for (value in str.split(",", " ")) {
        print("$value ")
    }
}


