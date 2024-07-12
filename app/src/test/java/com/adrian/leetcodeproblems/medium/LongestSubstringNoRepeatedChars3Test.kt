package com.adrian.leetcodeproblems.medium

import org.junit.Test
import org.junit.Assert.*

class LongestSubstringNoRepeatedChars3Test {

    val solution = LongestSubstringNoRepeatedChars3()

    @Test
    fun `when s is abcabcbb then return 3`() {
        val s = "abcabcbb"

        val result = solution.lengthOfLongestSubstring(s)

        assertEquals(3, result)
    }

    @Test
    fun `when s is bbbbb then return 3`() {
        val s = "bbbbb"

        val result = solution.lengthOfLongestSubstring(s)

        assertEquals(1, result)
    }

    @Test
    fun `when s is pwwkew then return 3`() {
        val s = "pwwkew"

        val result = solution.lengthOfLongestSubstring(s)

        assertEquals(3, result)
    }
    //

    @Test
    fun `when s is jbpnbwwd then return 4`() {
        val s = "jbpnbwwd"

        val result = solution.lengthOfLongestSubstring(s)

        assertEquals(4, result)
    }

}