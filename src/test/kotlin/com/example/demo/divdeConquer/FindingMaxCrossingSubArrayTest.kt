package com.example.demo.divdeConquer

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindingMaxCrossingSubArrayTest {
    @Test
    fun `예제_테스트`() {
        // given
        val findingMaxCrossingSubArray = FindingMaxCrossingSubArray()
        // TODO 최대 구간은 18, 20, -7, 12 임.
        // TODO mid 는 7번: 18 임.
        // TODO size = 15
        val list = listOf(13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7)
        val low = 0
        val high = list.lastIndex
        val mid = (high + low) / 2
        // when
        val actual = findingMaxCrossingSubArray.solution(list, low, mid, high)
        // then
        assertEquals(43, actual)
    }
}

