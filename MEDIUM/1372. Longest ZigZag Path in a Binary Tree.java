// Problem: 1372. Longest ZigZag Path in a Binary Tree
// Link: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
//
// Approach:
// - Use DFS to traverse the tree while tracking direction (left/right) and current path length.
// - Each recursive call either continues the zigzag or resets the count if the same direction repeats.
// - For each node, explore both left and right starting directions to find the maximum length.
// - Maintain a global `ans` variable to store the longest path found.
//
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(h) — recursion stack depth, where h is the tree height.

class Solution 
{
    private int ans = 0;
    public int longestZigZag(TreeNode root) 
    {
        dfs(root,true,0);
        dfs(root,false,0);
        return ans;
    }

    private void dfs(TreeNode root,boolean goLeft , int length)
    {
        if(root == null) return;

        ans = Math.max(ans,length);

        if(goLeft)
        {
            dfs(root.left,false,length+1);
            dfs(root.right,true,1);
        }
        else
        {
            dfs(root.right,true,length+1);
            dfs(root.left,false,1);
        }
    }
}
