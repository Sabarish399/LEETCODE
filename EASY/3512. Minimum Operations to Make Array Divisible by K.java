// Problem: 3512. Minimum Operations to Make Array Divisible by K
// Link: https://leetcode.com/problems/minimum-operations-to-make-array-divisible-by-k/
// Approach:
//   Compute the total sum of the array.
//   Each operation reduces the total sum by exactly k.
//   Therefore, the minimum number of operations required is:
//       totalSum % k
//   If totalSum is already divisible by k, no operations are needed.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int sum = 0;
        for(int i:nums)
            sum += i;

        return sum%k;
    }
}
