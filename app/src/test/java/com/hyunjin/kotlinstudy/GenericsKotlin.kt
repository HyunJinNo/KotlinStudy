package com.hyunjin.kotlinstudy

class MyType<in T>


open class A
class B : A()

fun method(x: MyType<B>) {
    println("method")
}

fun main(args: Array<String>) {
    val a = MyType<A>()
    val b = MyType<B>()
    method(a)
    method(b)
}

