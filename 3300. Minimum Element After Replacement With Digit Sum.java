// Problem: 3300. Minimum Element After Replacement With Digit Sum
// Link: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
//
// Approach:
// - For each number in the array:
//     • Compute the sum of its digits.
// - Track the minimum digit sum encountered.
// - Return the minimum digit sum.
//
// Time Complexity: O(n * d)
//     - d = number of digits in each number
// Space Complexity: O(1)

class Solution 
{
    public int minElement(int[] nums) 
    {
        int min = nums[0];
        for(int i:nums)
        {
            int sum = 0;
            while(i>0)
            {
                sum += i%10;
                i /= 10;
            }
            if(min > sum) min = sum;
        }
        return min;
    }
}
