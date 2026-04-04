// Problem: 1498. Number of Subsequences That Satisfy the Given Sum Condition
// Link: https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
//
// Approach (Sort + Two Pointers + Precomputed Powers):
// - Sort the array.
// - Precompute powers of 2:
//     • pow[i] = 2^i % mod (represents number of subsequences).
// - Use two pointers:
//     • left = 0, right = n-1.
// - While left <= right:
//     • If nums[left] + nums[right] <= target:
//         - All subsequences between left and right are valid.
//         - Add pow[right - left] to count.
//         - Move left++.
//     • Else:
//         - Move right--.
// - Return count.
//
// Time Complexity: O(n log n)
//     - Sorting dominates.
// Space Complexity: O(n)

class Solution 
{
    public int numSubseq(int[] nums, int target) 
    {
        Arrays.sort(nums);

        int mod = 1000000007;

        int[] pow = new int[nums.length];
        pow[0] = 1;

        for(int i=1; i<nums.length; i++)
            pow[i] = (pow[i-1]*2) % mod;

        int left = 0,right = nums.length-1;
        int count=0;
        while(left<=right)
        {
            if(nums[left]+nums[right]<=target)
            {
                count = (count + pow[right-left]) % mod;
                left++;
            }
            else
            {
                right--; 
            }
        }
        return count;
    }
}
