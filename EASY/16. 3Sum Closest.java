// Problem: 16. 3Sum Closest
// Link: https://leetcode.com/problems/3sum-closest/
//
// Approach (Sort + Two Pointers):
// - Sort the array.
// - Fix one element nums[i].
// - Use two pointers (left, right) to find best pair with nums[i]:
//     • Compute sum = nums[i] + nums[left] + nums[right]
//     • If this sum is closer to target → update result
//     • If sum < target → move left++
//     • If sum > target → move right--
//     • If sum == target → return immediately (best possible)
// - Return the closest sum found.
//
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++)
        {
            int left = i+1;
            int right = n-1;

            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target-sum) < Math.abs(target-result))
                    result = sum;

                if(sum == target) return sum;
                else if(sum < target) left++;
                else right--;
            }
        }
        return result;
    }
}
