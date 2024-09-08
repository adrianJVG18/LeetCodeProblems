package com.adrian.leetcodeproblems.easy

import org.junit.Test

class FizzBuzzTest {

    private val testSubject = FizzBuzz()

    @Test
    fun test5() {
        println("test5")
        testSubject.fizzBuzz(5)
    }

    @Test
    fun test15() {
        println("test15")
        testSubject.fizzBuzz(15)
    }

    @Test
    fun test30() {
        println("test30")
        testSubject.fizzBuzz(30)
    }

}