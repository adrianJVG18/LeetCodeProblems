package com.adrian.leetcodeproblems.easy

class FizzBuzz {

    fun fizzBuzz(n: Int): Unit {
        // Write your code here
        (1 .. n).forEach {
            if (it % 3 == 0 && it % 5 == 0) {
                println("FizzBuzz")
            } else if (it % 3 == 0) {
                println("Fizz")
            } else if (it % 5 == 0) {
                println("Buzz")
            } else {
                println(it)
            }
        }
    }


}