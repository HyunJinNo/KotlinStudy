package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    loop@ for (i in 0..5) {
        print("$i: ")
        for (j in 0..5) {
            print("$j ")
            if (j == 3) {
                println()
                continue@loop
            }
            print("${j + 10} ")
        }
        println()
    }
}

