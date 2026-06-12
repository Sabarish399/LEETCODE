// Problem: 304. Range Sum Query 2D - Immutable
// Link: https://leetcode.com/problems/range-sum-query-2d-immutable/
//
// Approach:
// - Precompute a 2D prefix sum array where prefSum[i][j] stores the sum of
//   all elements in the rectangle from (0,0) to (i-1,j-1).
// - Build the prefix sum using the inclusion-exclusion principle.
// - To answer a query, use the 2D prefix sum formula to obtain the sum of
//   the required submatrix in O(1) time.
// - This allows multiple range sum queries to be answered efficiently after
//   a one-time preprocessing step.
//
// Time Complexity:
// - Constructor: O(m × n)
// - sumRegion(): O(1)
//
// Space Complexity: O(m × n)

class NumMatrix 
{
    int[][] matrix;
    int[][] prefSum;

    public NumMatrix(int[][] matrix) 
    {
        this.matrix = matrix;

        int n = matrix.length;
        int m = matrix[0].length;

        prefSum = new int[n+1][m+1];

        for(int i=1;i<=matrix.length;i++)
        {
            for(int j=1;j<=matrix[0].length;j++)
            {
                prefSum[i][j] = prefSum[i][j-1] + prefSum[i-1][j] + matrix[i-1][j-1] - prefSum[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        return prefSum[row2+1][col2+1] - (prefSum[row1][col2+1] + prefSum[row2+1][col1]) + prefSum[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
