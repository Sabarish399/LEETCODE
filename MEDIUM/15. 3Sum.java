// Problem: 15. 3Sum
// Link: https://leetcode.com/problems/3sum/
// Approach:
//   Sort the array, then fix each number nums[i] as the first element of a triplet.
//   Use a two-pointer sweep (left, right) to find pairs summing to -nums[i].
//   Skip duplicates for both i and the left/right pointers to avoid repeated triplets.
//   Break early if nums[i] > 0 because no later triplet can sum to zero.
// Time Complexity: O(n²)
// Space Complexity: O(1) ignoring output list

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<3) return res;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 &&nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];

            while(left<right)
            {
                int sum = nums[left] + nums[right];
                if(sum == target)
                {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
                else if(sum < target) left++;
                else right--;
            }
        }
        return res;
    }
}
