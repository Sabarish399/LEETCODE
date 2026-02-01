// Problem: 2974. Minimum Cost of Buying Three Items
// Link: https://leetcode.com/problems/minimum-cost-of-buying-three-items/
// Approach:
//   The first element nums[0] must always be included in the cost.
//   From the remaining elements, select the two smallest values.
//   Add nums[0] + min1 + min2 to get the minimum total cost.
//   This is done in a single pass without sorting by tracking the two minimums.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int minimumCost(int[] nums) 
    {
       int min1 = 51;
       int min2 = 51;

       for(int i=1;i<nums.length;i++)
       {
            if(nums[i] < min1)
            {
                min2 = min1;
                min1 = nums[i];
            }
            else if(nums[i] < min2)
            {
                min2 = nums[i];
            }
       }
       return nums[0]+min1+min2;
    }
}
