package com.codenvy.example.kotlin

public val KotlinHelloString : String = "Hello from Kotlin!"

public fun getHelloStringFromJava() : String {
    return JavaHello.JavaHelloString!!;
}
