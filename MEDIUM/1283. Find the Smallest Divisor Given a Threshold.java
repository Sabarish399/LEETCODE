// Problem: 1283. Find the Smallest Divisor Given a Threshold
// Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Approach:
//   Apply binary search on the possible divisor range [1, max(nums)].
//   For a candidate divisor mid, compute the sum of ceilings:
//       sum += ceil(nums[i] / mid) = (nums[i] + mid - 1) / mid.
//   If the sum exceeds the threshold, the divisor is too small → move right.
//   Otherwise, try a smaller divisor → move left.
//   The smallest valid divisor is returned.
// Time Complexity: O(n log m) where m = max element in nums
// Space Complexity: O(1)

class Solution 
{
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int max = nums[0];
        for(int i:nums)
            max = Math.max(max,i);

        int left = 1;
        int right = max;

        while(left<=right)
        {
            int mid = left + (right-left)/2;
            int sum = 0;
            for(int i:nums)
            {
                sum += (i+mid-1)/mid;
                if(sum > threshold) break;
            }
            if(sum <= threshold)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;
    }
}
