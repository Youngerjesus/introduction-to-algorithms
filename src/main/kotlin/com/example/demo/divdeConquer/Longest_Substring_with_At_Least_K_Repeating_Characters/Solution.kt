package com.example.demo.divdeConquer.Longest_Substring_with_At_Least_K_Repeating_Characters

class Solution {
    fun longestSubstring(s: String, k: Int): Int {
        return recursiveLongestSubString(s, k)
    }

    private fun recursiveLongestSubString(s: String, k: Int): Int {
        val frequencyMap = setFrequencyMap(s, k)

        if (frequencyMap.values.all { it >= k }) return s.length
        else if (frequencyMap.values.all { it < k }) return 0

        var start = 0
        var max = Int.MIN_VALUE
        for (i in s.indices) {
            if (frequencyMap.get(s[i])!! < k) {
                val currentSubString = recursiveLongestSubString(s.substring(start, i), k)
                max = Math.max(max, currentSubString)
                start = i + 1
            } else if (i == s.lastIndex) {
                val currentSubString = recursiveLongestSubString(s.substring(start..i), k)
                max = Math.max(max, currentSubString)
                start = i + 1
            }
        }

        return max
    }

    private fun setFrequencyMap(s: String, k: Int): MutableMap<Char, Int> {
        val frequencyMap = mutableMapOf<Char, Int>()

        s.forEach { frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1 }

        return frequencyMap
    }

    private fun bruteForce(s: String, k: Int): Int {
        var max = Int.MIN_VALUE

        for (i in s.indices) {
            for (j in i until s.length) {
                val current = isSatisfy(s.substring(i..j), k)
                if (current > max) max = current
            }
        }

        return max
    }

    private fun isSatisfy(s: String, k: Int): Int {
        val countMap = mutableMapOf<Char, Int>()

        s.forEach { countMap[it] = countMap.getOrDefault(it, 0) + 1 }

        return if (countMap.values.all { it >= k }) s.length else 0
    }
}