// Problem: 104. Maximum Depth of Binary Tree
// Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Approach:
// - The task is to find the maximum depth (or height) of a binary tree.
// - Use a **recursive DFS (Depth-First Search)** approach.
// - For each node:
//     • Recursively compute the maximum depth of its left and right subtrees.
//     • The depth of the current node is `1 + max(leftDepth, rightDepth)`.
// - The base case is when the node is `null`, in which case the depth is 0.
//
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(h) — where h is the height of the tree (due to recursion stack).

class Solution 
{
    public int maxDepth(TreeNode root) 
    {
        if(root==null) return 0;

        int max = Math.max(maxDepth(root.left),maxDepth(root.right))+1;

        return max;
    }
}
