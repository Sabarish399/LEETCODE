// Problem: 1679. Max Number of K-Sum Pairs
// Link: https://leetcode.com/problems/max-number-of-k-sum-pairs/
// Approach: Sort the array and use the two-pointer technique.  
//           Move pointers inward — if the sum equals k, increment count and move both.  
//           If sum < k, move the left pointer; if sum > k, move the right pointer.
// Time Complexity: O(n log n) — due to sorting.
// Space Complexity: O(1) — constant extra space.

class Solution 
{
    public int maxOperations(int[] nums, int k) 
    {
        int left = 0, right = nums.length-1;
        int count = 0;
        Arrays.sort(nums);

        while(left<right)
        {
            int sum = nums[left] + nums[right];
            if(sum == k)
            {
                count++;
                left++;
                right--;
            }
            else if(sum < k)
                left++;
            else
                right--;
        }
        System.gc();
        return count;
    }
}
