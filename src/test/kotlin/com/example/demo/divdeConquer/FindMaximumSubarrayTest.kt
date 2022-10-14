package com.example.demo.divdeConquer

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

internal class FindMaximumSubarrayTest {

    val findingMaximumSubarray = FindMaximumSubarray()

    @Test
    fun `예제_테스트`() {
        //given
        val list = listOf(13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7)
        val low = 0
        val high = list.lastIndex
        val expected = 43
        //when
        val actual = findingMaximumSubarray.solution(list, low, high)
        //then
        assertEquals(expected, actual)
    }
}
