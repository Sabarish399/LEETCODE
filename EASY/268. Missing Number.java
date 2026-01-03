// Problem: 268. Missing Number
// Link: https://leetcode.com/problems/missing-number/
// Approach:
//   Use the mathematical formula for the sum of first n natural numbers:
//       sum = n * (n + 1) / 2
//   Subtract each element in the array from this total.
//   The remaining value is the missing number.
//   (Alternative approaches include XOR or boolean marking, but this is simplest.)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        /*
        boolean[] arr = new boolean[nums.length+1];

        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]] = true;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i]) return i;
        }
        return nums.length;
        */

        int n = nums.length;
        int total = (n*(n+1))/2;

        for(int i:nums)
        {
            total -= i;
        }
        return total;
    }
}
