// Problem: 48. Rotate Image
// Link: https://leetcode.com/problems/rotate-image/
// Approach: Rotate the matrix 90° clockwise in two steps:
//           1) Transpose the matrix (swap matrix[i][j] with matrix[j][i]).
//           2) Reverse each row.
//           This achieves the required in-place rotation.
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            int left = 0;
            int right = n-1;
            while(left<right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
