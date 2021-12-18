package com.hyunjin.kotlinstudy

inline fun inlineFunc(
    str: String,
    crossinline lambda: (String) -> Unit,
) {
    val runnable = Runnable { lambda(str) }
    // 생략
}

fun main(args: Array<String>) {
    inlineFunc("Hello", ::println)
}


