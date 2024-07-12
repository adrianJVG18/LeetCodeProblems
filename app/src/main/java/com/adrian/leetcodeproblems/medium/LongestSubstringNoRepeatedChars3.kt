package com.adrian.leetcodeproblems.medium

class LongestSubstringNoRepeatedChars3 {

    /**
     * Given a string s, find the length of the longest
     * substring without repeating characters.
     *
     * Example 1:
     *
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     *
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     *
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        s.forEachIndexed { i, ci ->
            if (i + max >= s.length) {
                return max
            }
            val current = getLongestSubstring(s.substring(i)).length
            max = if (max < current) current else max
        }
        return max
    }

    private fun getLongestSubstring(s: String): String {
        val ocurrences = mutableSetOf<Char>()
        s.forEachIndexed { j, cj ->
            if (ocurrences.contains(cj)) {
                return s.substring(0, j)
            } else {
                ocurrences.add(cj)
            }
        }
        return s
    }

}