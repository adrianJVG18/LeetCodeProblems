package com.adrian.leetcodeproblems.medium

import kotlin.io.path.Path

class IntToRoman {
    fun intToRoman(num: Int): String {
        var result = ""
        var power = 1

        while (num / power == 0) {
            result = "$result${getSymbol(num, power)}"
            power = power * 10
        }

        return result
    }

    private fun getSymbol(digit: Int, power: Int): String =
        when (digit) {
            1, 2, 3 -> {
                var symbol = ""
                (1..digit).forEach { _ ->
                    symbol = "${map[1*power]}$symbol"
                }
                symbol
            }
            4 -> {
                "${map[1*power]}${map[5*power]}"
            }
            5 -> {
                "${map[5*power]}"
            }
            6, 7, 8 -> {
                var symbol = "${map[5*power]}"
                (1..digit).forEach { _ ->
                    symbol = "$symbol${map[1*power]}"
                }
                symbol
            }
            else -> { // case 9
                "${map[1*power]}${map[1*(power+1)]}"
            }
        }


    private val map = hashMapOf<Int, String>(
        Pair(1, "I"),
        Pair(5, "V"),
        Pair(10, "X"),
        Pair(50, "L"),
        Pair(100, "C"),
        Pair(500, "D"),
        Pair(1000, "M")
    )


}