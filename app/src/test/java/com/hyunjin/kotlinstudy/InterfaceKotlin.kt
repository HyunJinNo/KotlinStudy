package com.hyunjin.kotlinstudy

interface InterfaceKotlin {
    // 프로퍼티 선언
    val property: Int

    // 추상 메소드
    fun method1()

    // 구현된 메소드
    fun method2() {
        println("method2")
    }
}

class ImplementingClass(override val property: Int) : InterfaceKotlin {
    override fun method1() {
        println("method1")
    }

    override fun method2() {
        super.method2()
        super<InterfaceKotlin>.method2()
        println("클래스의 method2")
    }
}



