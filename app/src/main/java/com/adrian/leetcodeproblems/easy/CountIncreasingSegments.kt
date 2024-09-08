package com.adrian.leetcodeproblems.easy

class CountIncreasingSegments {

    fun countIncreasingSegments(yCoordinates: Array<Int>, k: Int): Int {
        // Write your code here
        var count = 0
        if (k == 1) {
            return yCoordinates.size
        }

        // (index, value)
        yCoordinates.forEachIndexed { index, _ ->
            if (isIncreasingSegmentFromI(yCoordinates, k , index)) {
                count++
            }
        }
        return count
    }

    private fun isIncreasingSegmentFromI(yCoordinates: Array<Int>, k: Int, i: Int): Boolean {
        if (i + (k -1) < yCoordinates.size) {
            var aux = i
            while (aux < i + (k - 1) && (aux + 1) < yCoordinates.size) {
                if (yCoordinates[aux] >= yCoordinates[aux + 1]) {
                    return false
                }
                aux++
            }
            return true
        }
        return false
    }

}