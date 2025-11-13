// Problem: 199. Binary Tree Right Side View
// Link: https://leetcode.com/problems/binary-tree-right-side-view/
// Approach: Perform a reverse preorder traversal (Right → Left). 
// For each level, if it's the first time reaching that depth, record the node's value. 
// This ensures we capture the rightmost node at each level.
// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of the tree (recursion stack)

class Solution 
{
    List<Integer> nodes = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) 
    {
        revPreOrder(root,0);
        return nodes;
    }
    public void revPreOrder(TreeNode root,int level)
    {
        if(root == null) return;
        if(nodes.size() == level) nodes.add(root.val);

        revPreOrder(root.right,level+1);
        revPreOrder(root.left,level+1);
    }
}
