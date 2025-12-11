package com.adrian.leetcodeproblems.medium

import org.junit.Assert.assertEquals
import org.junit.Test

class IntToRomanTest {
    val subject = IntToRoman()

    @Test
    fun `return I when 1`() {
        assertEquals("I", subject.intToRoman(1))
    }

    @Test
    fun `return II when 2`() {
        assertEquals("II", subject.intToRoman(2))
    }

    @Test
    fun `return III when 3`() {
        assertEquals("III", subject.intToRoman(3))
    }

    @Test
    fun `return IV when 4`() {
        assertEquals("IV", subject.intToRoman(4))
    }

    @Test
    fun `return V when 5`() {
        assertEquals("V", subject.intToRoman(5))
    }

    @Test
    fun `return VI when 6`() {
        assertEquals("VI", subject.intToRoman(6))
    }

    @Test
    fun `return VII when 7`() {
        assertEquals("VII", subject.intToRoman(7))
    }

    @Test
    fun `return VIII when 8`() {
        assertEquals("VIII", subject.intToRoman(8))
    }

    @Test
    fun `return IX when 9`() {
        assertEquals("IX", subject.intToRoman(9))
    }

    @Test
    fun `return X when 10`() {
        assertEquals("X", subject.intToRoman(10))
    }

    @Test
    fun `return XI when 11`() {
        assertEquals("XI", subject.intToRoman(11))
    }

    @Test
    fun `return XIV when 14`() {
        assertEquals("XIV", subject.intToRoman(14))
    }

    @Test
    fun `return XV when 15`() {
        assertEquals("XV", subject.intToRoman(15))
    }

    @Test
    fun `return XIX when 19`() {
        assertEquals("XIX", subject.intToRoman(19))
    }

    @Test
    fun `return XX when 20`() {
        assertEquals("XX", subject.intToRoman(20))
    }

    @Test
    fun `return XXVII when 27`() {
        assertEquals("XXVII", subject.intToRoman(27))
    }

    @Test
    fun `return XL when 40`() {
        assertEquals("XL", subject.intToRoman(40))
    }

    @Test
    fun `return XLIV when 44`() {
        assertEquals("XLIV", subject.intToRoman(44))
    }

    @Test
    fun `return LVIII when 58`() {
        assertEquals("LVIII", subject.intToRoman(58))
    }

    @Test
    fun `return XC when 90`() {
        assertEquals("XC", subject.intToRoman(90))
    }

    @Test
    fun `return XCIX when 99`() {
        assertEquals("XCIX", subject.intToRoman(99))
    }

    @Test
    fun `return C when 100`() {
        assertEquals("C", subject.intToRoman(100))
    }

    @Test
    fun `return CD when 400`() {
        assertEquals("CD", subject.intToRoman(400))
    }

    @Test
    fun `return D when 500`() {
        assertEquals("D", subject.intToRoman(500))
    }

    @Test
    fun `return CM when 900`() {
        assertEquals("CM", subject.intToRoman(900))
    }

    @Test
    fun `return M when 1000`() {
        assertEquals("M", subject.intToRoman(1000))
    }

    @Test
    fun `return MCMXCIV when 1994`() {
        assertEquals("MCMXCIV", subject.intToRoman(1994))
    }

    @Test
    fun `return MM when 2000`() {
        assertEquals("MM", subject.intToRoman(2000))
    }

    @Test
    fun `return MMMCMXCIX when 3999`() {
        assertEquals("MMMCMXCIX", subject.intToRoman(3999))
    }
}