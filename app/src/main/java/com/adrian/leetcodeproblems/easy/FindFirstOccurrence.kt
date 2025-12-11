package com.adrian.leetcodeproblems.easy

class FindFirstOccurrence {

    /**
     * Given two strings needle and haystack, return the index of the first
     * occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */
    fun findFirst(haystack: String, needle: String): Int {
        haystack.forEachIndexed{ i, _ ->
            if (needle.length + i > haystack.length) {
                return -1
            }

            if (containedIn(haystack, needle, i)) {
                return i
            }
        }
        return -1
    }

    private fun containedIn(haystack: String, needle: String, from: Int): Boolean {
        needle.forEachIndexed{ i, _ ->
            if (haystack[from + i] != needle[i]) {
                return false
            }
        }
        return true
    }
}