// Problem: 1524. Number of Sub-arrays With Odd Sum
// Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
//
// Approach:
// - Traverse the array while maintaining the running prefix sum.
// - Count how many prefix sums are odd; the remaining prefix sums (including
//   the initial empty prefix) are even.
// - A subarray has an odd sum when its endpoints are formed by one odd and one
//   even prefix sum.
// - Compute the total as (odd prefixes × even prefixes) and return the result
//   modulo 1,000,000,007.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int numOfSubarrays(int[] arr) 
    {
        long prefixSum = 0;
        long oddCount = 0;
        for(int num : arr)
        {
            prefixSum += num;
            oddCount += (prefixSum%2);
        }
        oddCount += (arr.length-oddCount)*oddCount;
        return (int)(oddCount%1_000_000_007);
    }
}
