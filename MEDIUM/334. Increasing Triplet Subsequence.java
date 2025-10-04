// Problem: 334. Increasing Triplet Subsequence
// Link: https://leetcode.com/problems/increasing-triplet-subsequence/
// Approach: Maintain two variables `first` and `second` representing the smallest and second smallest numbers seen so far. 
//           Iterate through the array: 
//           - Update `first` if current number is smaller or equal. 
//           - Update `second` if current number is bigger than `first` but smaller or equal to `second`. 
//           - If a number is bigger than both, a triplet exists, return true.
// Time Complexity: O(n), single pass through the array.
// Space Complexity: O(1), only two variables are used.

class Solution 
{
    public boolean increasingTriplet(int[] nums) 
    {
        int first = Integer.MAX_VALUE,second = Integer.MAX_VALUE;

        for(int num : nums)
        {
            if(num<=first)
                first = num;
            else if(num<=second)
                second = num;
            else
                return true;
        }
        return false;
    }
}
