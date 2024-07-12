package com.adrian.leetcodeproblems.easy

import org.junit.Test
import org.junit.Assert.assertEquals

class RemoveDupsOnSortedArray26Test {

    private val solution = RemoveDupsOnSortedArray26()

    @Test
    fun `when _1, 1, 2_ then return _1, 2_`() {
        val nums = listOf(1, 1, 2).toIntArray()
        val result = nums.copyOfRange(0, nums.size-1)

        val k = solution.removeDuplicates(result)

        for (i in 0 until k) {
            assertEquals(nums[i], result[i])
        }
    }

}