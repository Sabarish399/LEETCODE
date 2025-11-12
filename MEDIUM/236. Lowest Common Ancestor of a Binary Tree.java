// Problem: 236. Lowest Common Ancestor of a Binary Tree
// Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
//
// Approach:
// - Perform a post-order DFS traversal.
// - If the current node is null, or matches either `p` or `q`, return it.
// - Recursively search the left and right subtrees.
// - If both sides return non-null, the current node is the Lowest Common Ancestor (LCA).
// - If only one side is non-null, propagate that non-null node upwards.
// - The recursion naturally bubbles up the LCA without extra data structures.
//
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(h) — recursion stack, where h is the height of the tree.

class Solution 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q); 
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null) return right;
        else if(right == null )return left;
        else return root; 
    }
}
