// Problem: 2965. Find Missing and Repeated Values
// Link: https://leetcode.com/problems/find-missing-and-repeated-values/
//
// Approach (Frequency Counting):
// - Create a frequency array of size n*n + 1.
// - Traverse the grid and count occurrences of each number.
// - Traverse from 1 to n*n:
//     • If freq[i] == 2 → repeated number.
//     • If freq[i] == 0 → missing number.
// - Store repeated in ans[0] and missing in ans[1].
// - Return result.
//
// Time Complexity: O(n²)
// Space Complexity: O(n²)

class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n = grid.length;
        int[] ans = new int[2];
        int[] freq = new int[n*n+1];

        for(int[] row:grid)
        {
            for(int i:row)
            {
                freq[i]++;
            }
        }

        for(int i=1;i<=n*n;i++)
        {
            if(freq[i]==2) ans[0]=i;
            if(freq[i]==0) ans[1]=i;
        }
        return ans;
    }
}  
