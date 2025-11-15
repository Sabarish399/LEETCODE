// Problem: 700. Search in a Binary Search Tree
// Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
// Approach: Use simple recursion. Compare the target value with the current node's value.
// Move left if target is smaller, right if larger. Return the node when matched.
// Time Complexity: O(h) – height of the BST
// Space Complexity: O(h) – recursion stack


class Solution 
{
    public TreeNode searchBST(TreeNode root, int val) 
    {
        if(root == null || root.val == val) return root;
        else if(val<root.val) return searchBST(root.left,val);
        return searchBST(root.right,val);
    }
}
