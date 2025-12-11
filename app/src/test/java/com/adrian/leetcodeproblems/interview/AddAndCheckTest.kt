package com.adrian.leetcodeproblems.interview

import junit.framework.TestCase.assertEquals
import org.junit.Test


class AddAndCheckTest {

    val subject = AddAndCheck()

    @Test
    fun `add 2 and 3 check 5 return true`() {
        subject.add(2)
        subject.add(3)
        assertEquals(true, subject.check(5))
    }

    @Test
    fun `add 2 and 2 check 4 return true`() {
        subject.addM(2)
        subject.addM(2)
        assertEquals(true, subject.checkOptimized(4))
    }

    @Test
    fun `add 2 check 4 return true`() {
        subject.addM(2)
        assertEquals(false, subject.checkOptimized(4))
    }
}