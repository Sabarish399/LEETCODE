// Problem: 73. Set Matrix Zeroes
// Link: https://leetcode.com/problems/set-matrix-zeroes/
// Approach: Use the first row and first column as markers to record which rows and columns should be zeroed.
//           1) First pass: scan matrix. If matrix[i][j] == 0, set matrix[i][0] = 0 and matrix[0][j] = 0.
//              Keep a separate flag for whether the first column itself must be zeroed (to avoid clobbering).
//           2) Second pass (reverse order): use markers to set zeros for non-first-column cells, then handle
//              the first column using the saved flag. Reverse order preserves marker values while writing.
// Time Complexity: O(m * n)
// Space Complexity: O(1) — in-place using matrix as markers

class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        boolean zeroInCol0 = false;

        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0] == 0) zeroInCol0 = true;
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = matrix.length-1;i>=0;i--)
        {
            for(int j=matrix[0].length-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0) 
                    matrix[i][j]=0;                
            }
            if(zeroInCol0) matrix[i][0] = 0;
        }
    }
}
