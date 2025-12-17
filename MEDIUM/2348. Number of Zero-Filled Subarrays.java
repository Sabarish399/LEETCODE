// Problem: 2348. Number of Zero-Filled Subarrays
// Link: https://leetcode.com/problems/number-of-zero-filled-subarrays/
// Approach:
//   Traverse the array and count consecutive zeros.
//   For each zero encountered, increment a running counter `count` representing
//   the number of consecutive zeros ending at the current index.
//   Add `count` to the total subarray count, since each new zero extends all
//   previous zero-only subarrays by one.
//   Reset the counter when a non-zero element is found.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long count = 0;
        long subArrCount = 0;

        for(int i:nums)
        {
            if(i==0)
            {
                count++;
                subArrCount += count;
            }
            else count=0;
        }
        return subArrCount;
    }
}
