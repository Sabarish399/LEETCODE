// Problem: 872. Leaf-Similar Trees
// Link: https://leetcode.com/problems/leaf-similar-trees/
//
// Approach:
// - Perform DFS traversal on both trees to collect the leaf node values into separate lists.
// - A leaf node is identified when both `left` and `right` children are null.
// - After collecting all leaf values for both trees, compare the two lists for equality.
// - If they match, the trees are leaf-similar.
//
// Time Complexity: O(n + m) — where n and m are the number of nodes in root1 and root2.
// Space Complexity: O(h1 + h2) — recursion stack depth, proportional to tree height.


class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        listOfLeaf(root1,list1);
        listOfLeaf(root2,list2);
        
        return list1.equals(list2);
    }
    public void listOfLeaf(TreeNode root,List<Integer> list)
    {
        if(root==null) return;
        if(root.left == null && root.right == null ) list.add(root.val);
        
        listOfLeaf(root.left,list);
        listOfLeaf(root.right,list);
    }
}
