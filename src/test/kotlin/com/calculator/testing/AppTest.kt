package com.calculator.testing

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll

open class AppTest {
    companion object {
        @JvmStatic
        @BeforeAll
        fun setUp() {
            println("---------------BEFORE ALL---------------")
        }
        @JvmStatic
        @AfterAll
        fun tearDown() {
            println("---------------AFTER ALL---------------")
        }
    }
}