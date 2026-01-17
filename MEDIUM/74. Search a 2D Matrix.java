// Problem: 74. Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Approach:
//   Treat the 2D matrix as a flattened sorted 1D array of size m * n.
//   Use binary search on the range [0, m*n - 1].
//   For any index mid:
//     - Row index = mid / n
//     - Column index = mid % n
//   Compare matrix[row][col] with target and adjust the search range accordingly.
// Time Complexity: O(log(m * n))
// Space Complexity: O(1)

class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        if(target<matrix[0][0] || target>matrix[m-1][n-1]) return false;

        int left = 0;
        int right = m*n-1;

        while(left<=right)
        {
            int mid = left + (right - left)/2;

            int i = mid/n;
            int j = mid%n;

            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
