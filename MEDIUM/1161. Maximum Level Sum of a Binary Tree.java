// Problem: 1161. Maximum Level Sum of a Binary Tree
// Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
// Approach: Use DFS to accumulate the sum of node values at each depth. 
// Track the deepest level visited, then iterate over all levels to find which one has the highest sum.
// Time Complexity: O(n) – each node is visited once
// Space Complexity: O(h) – recursion depth (h = tree height)

class Solution 
{
    int totLevel;
    int[] sumAtLevels = new int[10000];

    public int maxLevelSum(TreeNode root) 
    {
        int ans = 0;
        int maxSum = Integer.MIN_VALUE;

        helper(root,0);

        for(int i=0;i<=totLevel;i++)
        {
            int currSum = sumAtLevels[i];
            
            if(currSum>maxSum)
            {
                maxSum = currSum;
                ans = i+1;
            }
        }
        System.gc();
        return ans;
    }
    public void helper(TreeNode root,int level)
    {
        if(root == null) return;

        sumAtLevels[level] += root.val;
        totLevel = Math.max(totLevel,level);

        helper(root.right,level+1);
        helper(root.left,level+1);
    }
}
