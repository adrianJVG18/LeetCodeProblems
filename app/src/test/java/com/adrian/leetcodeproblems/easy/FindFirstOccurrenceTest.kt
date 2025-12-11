package com.adrian.leetcodeproblems.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class FindFirstOccurrenceTest {

    val subject = FindFirstOccurrence()

    @Test
    fun `haystack aaaa, needle a, response should be 0`() {
        val response = subject.findFirst("aaaa", "a")

        assertEquals(0, response)
    }

    @Test
    fun `haystack aaaa, needle b, response should be -1`() {
        val response = subject.findFirst("aaaa", "b")

        assertEquals(-1, response)
    }

    @Test
    fun `haystack aaaab, needle b, response should be 4`() {
        val response = subject.findFirst("aaaab", "b")

        assertEquals(4, response)
    }

    @Test
    fun `haystack sadbutsad, needle sad, response should be 0`() {
        val response = subject.findFirst("sadbutsad", "sad")

        assertEquals(0, response)
    }

    @Test
    fun `haystack leetcode, needle leeto, response should be -1`() {
        val response = subject.findFirst("leetcode", "leeto")

        assertEquals(0, response)
    }

    @Test
    fun `haystack leetcode, needle codee, response should be -1`() {
        val response = subject.findFirst("leetcode", "codee")

        assertEquals(-1, response)
    }
}