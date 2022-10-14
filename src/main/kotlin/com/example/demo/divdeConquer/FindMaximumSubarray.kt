package com.example.demo.divdeConquer

class FindMaximumSubarray {
    private val findingMaxCrossingSubArray = FindingMaxCrossingSubArray()

    fun solution(list: List<Int>, low: Int, high: Int): Int {
        if (low == high) return list[low]

        val mid = (low + high) / 2

        val leftSum = solution(list, low, mid)
        val middleSum = findingMaxCrossingSubArray.solution(list, low, mid, high)
        val rightSum = solution(list, mid + 1, high)

        return Math.max(Math.max(leftSum, middleSum), rightSum)
    }
}