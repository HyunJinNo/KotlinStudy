package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {

    val arr1 = Array<Array<Int>>(5) { Array<Int>(4) { it } }
    val arr2 = Array(5) { IntArray(4) }
    val arr3 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
    val arr4 = Array(2) { i -> IntArray(3) { it + (i * 3) + 1 } }
    for (row in arr1.indices) {
        for (col in arr1[0].indices) {
            print(arr1[row][col])
        }
        println()
    }
    println()
    for (row in arr2.indices) {
        for (col in arr2[0].indices) {
            print(arr2[row][col])
        }
        println()
    }
    println()
    for (row in arr3.indices) {
        for (col in arr3[0].indices) {
            print(arr3[row][col])
        }
        println()
    }
    println()
    for (row in arr4.indices) {
        for (col in arr4[0].indices) {
            print(arr4[row][col])
        }
        println()
    }


}