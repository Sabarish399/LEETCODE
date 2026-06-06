// Problem: 1572. Matrix Diagonal Sum
// Link: https://leetcode.com/problems/matrix-diagonal-sum/
//
// Approach:
// - Traverse the primary diagonal and add its elements.
// - Traverse the secondary diagonal and add its elements.
// - If the matrix size is odd, the center element gets counted twice.
// - Subtract the center element once to get the correct sum.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int sum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            sum += mat[i][i];
        }

        for(int i=0;i<n;i++)
        {
            sum += mat[i][n-i-1];
        }

        return ((n&1) != 1) ? sum : sum - mat[n/2][n/2];
    }
}
