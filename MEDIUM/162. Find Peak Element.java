// Problem: 162. Find Peak Element
// Link: https://leetcode.com/problems/find-peak-element/
// Approach: Binary search. 
//           Compare nums[mid] with nums[mid+1]. 
//           If nums[mid] > nums[mid+1], move to the left side (including mid).
//           Otherwise, move to the right side. 
//           Eventually, left == right, which is a peak index.
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int left = 0, right = nums.length-1;

        while(left<right)
        {
            int mid = left + (right-left)/2;
            
            if(nums[mid]>nums[mid+1])
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
}
