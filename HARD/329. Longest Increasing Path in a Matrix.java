// Problem: 329. Longest Increasing Path in a Matrix
// Link: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
//
// Approach (DFS + Memoization):
// - Treat every cell as the starting point of a path.
// - Use DFS to find the longest increasing path starting from that cell.
// - Memoize the result in dp[][] so each cell is computed only once.
// - From each cell, move in 4 directions only if the adjacent value is greater.
// - The answer is the maximum path length among all starting cells.
//
// Time Complexity: O(m × n)
//     - Each cell is computed only once.
// Space Complexity: O(m × n)
//     - DP array + recursion stack.

class Solution 
{
    public int longestIncreasingPath(int[][] matrix) 
    {
        int row = matrix.length, col = matrix[0].length;

        int[][] dp = new int[row][col];
        int maxLen = 0;

        for(int r=0;r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(dp[r][c] == 0)
                    maxLen = Math.max(maxLen, dfs(matrix, dp, row, col, r, c));
            }
        }
        
        return maxLen;
    }

    int dfs(int[][] matrix, int[][] dp, int row, int col, int r, int c)
    {
        if(dp[r][c] != 0) return dp[r][c];
        
        int[][] diff = { {-1,0}, {0,1}, {1,0}, {0,-1} };

        int adjMax = 0;

        for(int i=0;i<diff.length;i++)
        {
            int adjRow = r+diff[i][0];
            int adjCol = c+diff[i][1];

            if(adjRow >= 0 && adjCol >=0 && adjRow < row && adjCol < col && matrix[adjRow][adjCol] > matrix[r][c])
            {
                adjMax = Math.max(adjMax,dfs(matrix, dp, row, col, adjRow, adjCol));
            }
        }
        dp[r][c] = 1+adjMax;

        return dp[r][c];
    }
}
