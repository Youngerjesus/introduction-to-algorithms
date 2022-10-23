package com.example.demo.divdeConquer.Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun `예제_테스트_(1)`() {
        //given
        val preOrder = intArrayOf(3, 9, 1, 20, 15, 7)
        val inOrder = intArrayOf(1, 9, 3, 15, 20, 7)
        val solution = Solution()
        val expected = buildExpected_1()
        //when
        val actual = solution.buildTree(preOrder, inOrder)
        //then
        assertEquals(expected, actual)
    }

    private fun buildExpected_1(): TreeNode? {
        val result = TreeNode(3)
        result.left = TreeNode(9)
        result.right = TreeNode(20)
        result.left?.left = TreeNode(1)
        result.right?.left = TreeNode(15)
        result.right?.right = TreeNode(7)
        return result
    }

    @Test
    fun `예제_테스트_(2)`() {
        //given
        val preOrder = intArrayOf(3, 2, 1)
        val inOrder = intArrayOf(1, 2, 3)
        val solution = Solution()
        val expected = buildExpected_2()
        //when
        val actual = solution.buildTree(preOrder, inOrder)
        //then
        assertEquals(expected, actual)
    }

    private fun buildExpected_2(): TreeNode? {
        val result = TreeNode(3)
        result.left = TreeNode(2)
        result.left?.left = TreeNode(1)
        return result
    }

    @Test
    fun `예제_테스트_(3)`() {
        //given
        val preOrder = intArrayOf(3,9,20,15,7)
        val inOrder = intArrayOf(9,3,15,20,7)
        val solution = Solution()
        val expected = buildExpected_3()
        //when
        val actual = solution.buildTree(preOrder, inOrder)
        //then
        assertEquals(expected, actual)
    }

    private fun buildExpected_3(): TreeNode? {
        val result = TreeNode(3)
        result.left = TreeNode(9)
        result.right = TreeNode(20)
        result.right?.left = TreeNode(15)
        result.right?.right = TreeNode(7)
        return result
    }

    @Test
    fun `예제_테스트_(4)`() {
        //given
        val preOrder = intArrayOf(-1)
        val inOrder = intArrayOf(-1)
        val solution = Solution()
        val expected = buildExpected_4()
        //when
        val actual = solution.buildTree(preOrder, inOrder)
        //then
        assertEquals(expected, actual)
    }

    private fun buildExpected_4(): TreeNode? {
        val result = TreeNode(-1)
        return result
    }

    @Test
    fun `예제_테스트_(5)`() {
        //given
        val preOrder = intArrayOf(1, 2)
        val inOrder = intArrayOf(1, 2)
        val solution = Solution()
        val expected = buildExpected_5()
        //when
        val actual = solution.buildTree(preOrder, inOrder)
        //then
        assertEquals(expected, actual)
    }

    private fun buildExpected_5(): TreeNode? {
        val result = TreeNode(1)
        result.right = TreeNode(2)
        return result
    }
}