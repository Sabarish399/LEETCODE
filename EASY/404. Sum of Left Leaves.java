// Problem: 404. Sum of Left Leaves
// Link: https://leetcode.com/problems/sum-of-left-leaves/
// Approach:
//   Perform a DFS traversal of the tree.
//   At each node, check if its left child exists and is a leaf
//   (both left and right are null). If so, add its value to the sum.
//   Recursively process both left and right subtrees.
// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of the tree (recursion stack)


class Solution 
{
    public int sumOfLeftLeaves(TreeNode root) 
    {
        int sum = 0;
        return dfs(root,sum);
    }
    static int dfs(TreeNode root,int sum)
    {
        if(root == null) return 0;
        sum = 0;
        if(root.left != null && root.left.left==null && root.left.right==null)
            sum += root.left.val;

        sum += dfs(root.left,sum);
        sum += dfs(root.right,sum);
        return sum;
    }
}
