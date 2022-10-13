package com.example.demo.divdeConquer

class FindingMaxCrossingSubArray {
    fun solution(list: List<Int>, low: Int, mid: Int, high: Int): Int {
        var leftSum = Int.MIN_VALUE
        var sum = 0
        var maxLeft = mid
        for (i in mid downTo low) {
            sum += list[i]
            if (sum > leftSum) {
                leftSum = sum
                maxLeft = i
            }
        }

        var rightSum = Int.MIN_VALUE
        sum = 0
        var maxRight = mid
        for (i in mid + 1..high) {
            sum += list[i]
            if (sum > rightSum) {
                rightSum = sum
                maxRight = i
            }
        }

        sum = 0
        for (i in maxLeft..maxRight) {
            sum += list[i]
        }

        return sum
    }
}
