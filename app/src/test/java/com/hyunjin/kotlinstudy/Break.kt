package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    loop@ for (i in 0..9) {
        print("$i: ")
        for (j in 0..9) {
            print("$j ")
            if (j == 5) {
                break@loop
            }
        }
        println()
    }
}

