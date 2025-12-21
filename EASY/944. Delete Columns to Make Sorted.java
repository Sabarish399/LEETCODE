// Problem: 944. Delete Columns to Make Sorted
// Link: https://leetcode.com/problems/delete-columns-to-make-sorted/
// Approach:
//   Check each column independently.
//   For a given column c, scan rows top to bottom.
//   If any pair of adjacent rows violates non-decreasing order
//   (strs[r-1][c] > strs[r][c]), that column must be deleted.
// Time Complexity: O(m * n) where m = number of strings, n = string length
// Space Complexity: O(1)

class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int delCols = 0;

        for(int c=0;c<strs[0].length();c++)
        {
            for(int r=1;r<strs.length;r++)
            {
                if(strs[r-1].charAt(c) > strs[r].charAt(c))
                {
                    delCols++;
                    break;
                }   
            }
        }
        return delCols;
    }
}
