// Problem: 450. Delete Node in a BST
// Link: https://leetcode.com/problems/delete-node-in-a-binary-search-tree/
// Approach: Standard BST deletion.
// 1. Search for the key recursively.
// 2. On finding the node:
//    - If it has one child, return that child.
//    - If it has two children, find the inorder successor (smallest in right subtree),
//      replace the node’s value with successor’s value, and delete successor recursively.
// Time Complexity: O(h) – height of the BST
// Space Complexity: O(h) – recursion stack



class Solution 
{
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root == null) return root;

        if(key < root.val) 
            root.left = deleteNode(root.left,key);
        else if(key > root.val)
            root.right = deleteNode(root.right,key);
        else 
        {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else
            {
                TreeNode temp = succ(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right,temp.val);
            }
        }
        return root;
    }
    TreeNode succ(TreeNode node)
    {
        while(node.left != null) node = node.left;
        return node;
    }
}
