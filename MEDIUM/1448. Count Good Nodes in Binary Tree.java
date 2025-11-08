// Problem: 1448. Count Good Nodes in Binary Tree
// Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/
//
// Approach:
// - Traverse the tree using DFS, keeping track of the maximum value seen so far along the path.
// - A node is considered "good" if its value is greater than or equal to this maximum.
// - Update the count whenever a good node is found.
// - Recursively explore both left and right subtrees, updating the max value as needed.
//
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(h) — recursion stack, where h is the height of the tree.

class Solution 
{
        int count = 0;
    public int goodNodes(TreeNode root) 
    {
        find(root,root.val);
        return count;
    }

    public void find(TreeNode root,int maxValue)
    {
        if(root.val >= maxValue) 
        {
            count++;
            maxValue = root.val;
        }
        if(root.left != null) find(root.left,maxValue);
        if(root.right != null) find(root.right,maxValue);
    }
}
