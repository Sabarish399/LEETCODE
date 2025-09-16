// Problem: 153. Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Approach: Binary search. 
//           Compare nums[mid] with nums[right]. 
//           - If nums[mid] > nums[right], the minimum is in the right half (mid+1 to right).
//           - Else, the minimum is in the left half (left to mid).
//           Keep narrowing until left == right, which gives the minimum.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int findMin(int[] nums) 
    {
        int left = 0, right = nums.length-1;
        
        while(left < right)
        {
            int mid = left + (right-left)/2;
            
            if(nums[right]<nums[mid])
                left = mid+1;
            else
                right= mid;
        }
        return nums[left];
    }
}
