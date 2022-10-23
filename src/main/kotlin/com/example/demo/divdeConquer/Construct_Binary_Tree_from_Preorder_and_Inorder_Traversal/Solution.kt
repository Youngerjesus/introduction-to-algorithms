package com.example.demo.divdeConquer.Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal

import java.util.*
import kotlin.math.min


class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return recursiveBuildTree(preorder, inorder)
    }

    private fun recursiveBuildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (inorder.isEmpty()) {
            return null
        }

        if (inorder.size == 1) {
            return TreeNode(inorder[0])
        }

        val currentRootNode = findCurrentRootNode(preorder, inorder)
        val currentNode = TreeNode(currentRootNode)
        val currentRootNodeIndex = inorder.indexOf(currentRootNode)
        val left = inorder.sliceArray(0 until currentRootNodeIndex)
        val leftNode = recursiveBuildTree(preorder, left)
        currentNode.left = leftNode

        if (currentRootNodeIndex != inorder.lastIndex) {
            val right = inorder.sliceArray(currentRootNodeIndex + 1..inorder.lastIndex)
            val rightNode = recursiveBuildTree(preorder, right)
            currentNode.right = rightNode
        }

        return currentNode
    }

    private fun findCurrentRootNode(preorder: IntArray, inorder: IntArray): Int {
        var minIndex = preorder.lastIndex

        inorder.forEachIndexed { index, number ->
            val rootIndex = preorder.indexOf(number)
            minIndex = Math.min(rootIndex, minIndex)
        }

        return preorder[minIndex]
    }
}

fun todo() {
    TODO("preOrder 를 통해서 subTree 들의 Root 를 발견할 수 있다.")
    TODO("inOrder 를 통해서 root 를 기점으로 subTree 를 나눌 수 있다.")

    TODO("root 를 찾는 로직을 어떻게 할 지")
    TODO("첫 루트는 알 수 있다. 다음 루트는 쪼개진 subTree 를 바탕으로 preOrder 에서 찾아야한다. 가장 첫 번쩨로 나오는 수임.")
    TODO("결과인 TreeNode 를 어떻게 만들 수 있을지.")
    TODO("recursion 을 통해서 만들 수 있지 않을까? left, right subTree 를 만들 때, TreeNode 를 같이 넘겨주는거지. 매개변수로.")


}
data class TreeNode(val `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}