// Problem: 2011. Final Value of Variable After Performing Operations
// Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// Approach: Initialize `x = 0`. Iterate through each operation string.  
//           If the operation contains "-", decrement `x`; otherwise, increment `x`.  
//           Return the final value of `x` after processing all operations.
// Time Complexity: O(n) — iterate through all operations.
// Space Complexity: O(1) — constant extra space.

class Solution 
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for(String op : operations)
        {
            if(op.contains("-")) x--;
            else x++;
        }
        return x;
    }
}
