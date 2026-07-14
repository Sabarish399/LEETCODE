// Problem: 974. Subarray Sums Divisible by K
// Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
//
// Approach:
// - Maintain a running prefix sum while traversing the array.
// - Compute the remainder of the prefix sum modulo k.
// - Adjust negative remainders by adding k to keep them in the range [0, k-1].
// - Use a frequency array to store how many times each remainder has occurred.
// - If the same remainder has appeared before, all corresponding subarrays
//   have sums divisible by k.
// - Accumulate the count and update the remainder frequency.
//
// Time Complexity: O(n)
// Space Complexity: O(k)

class Solution 
{
    public int subarraysDivByK(int[] nums, int k) 
    {
        int[] freq = new int[k];
        freq[0] = 1;

        int count = 0;
        int prefixSum = 0;

        for(int num : nums)
        {
            prefixSum += num;
            int rem = prefixSum % k;

            if(rem < 0) rem += k;

            count += freq[rem];
            freq[rem]++;
        }
        return count;
    }
}
