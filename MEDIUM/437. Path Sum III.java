// Problem: 437. Path Sum III
// Link: https://leetcode.com/problems/path-sum-iii/
//
// Approach:
// - Use a recursive DFS approach to count all paths that sum to the target value.
// - The helper function `find()` checks all downward paths starting from the current node.
// - For each node, recursively explore all paths from its left and right subtrees as new starting points.
// - Paths can start and end at any node, as long as they follow parent-to-child links.
//
// Time Complexity: O(n²) in the worst case — for each node, a DFS may explore all subpaths.
// Space Complexity: O(h) — recursion stack, where h is the height of the tree.

class Solution 
{
    public int find(TreeNode root,long targetSum)
    {
        if(root == null) return 0;
        int count = 0;
        if(root.val == targetSum) count++;

        targetSum = targetSum - root.val;
        count += find(root.left,targetSum);
        count += find(root.right,targetSum);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) 
    {
        if(root == null) return 0;
        return find(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
