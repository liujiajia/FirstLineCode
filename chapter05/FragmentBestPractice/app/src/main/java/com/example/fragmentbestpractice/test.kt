package com.example.fragmentbestpractice

class InitOrderDemo(name: String) {

    val firstProperty = "First property: $name" . also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer blcok that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("hello")
}