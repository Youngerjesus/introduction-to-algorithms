package com.example.demo.divdeConquer.Longest_Substring_with_At_Least_K_Repeating_Characters

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun `예제_테스트_-1`() {
        //given
        val solution = Solution()
        val s = "a"
        val k = 1
        //when
        val actual = solution.longestSubstring(s, k)
        //then
        assertEquals(1, actual)
    }

    @Test
    fun `예제_테스트_0`() {
        //given
        val solution = Solution()
        val s = "cdfgfgfgfddz"
        val k = 3
        //when
        val actual = solution.longestSubstring(s, k)
        //then
        assertEquals(10, actual)
    }

    @Test
    fun `예제_테스트_1`() {
        //given
        val solution = Solution()
        val s = "aaabb"
        val k = 3
        //when
        val actual = solution.longestSubstring(s, k)
        //then
        assertEquals(3, actual)
    }

    @Test
    fun `예제_테스트_2`() {
        //given
        val solution = Solution()
        val s = "ababbc"
        val k = 2
        //when
        val actual = solution.longestSubstring(s, k)
        //then
        assertEquals(5, actual)
    }


    @Test
    fun `예제_테스트_3`() {
        //given
        val solution = Solution()
        val s = "bbaaacbd"
        val k = 3
        //when
        val actual = solution.longestSubstring(s, k)
        //then
        assertEquals(3, actual)
    }
}