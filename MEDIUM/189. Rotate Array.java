// Problem: 189. Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Approach:
//   Use the reverse technique.
//   1) Normalize k by k %= n.
//   2) Reverse the entire array.
//   3) Reverse the first k elements.
//   4) Reverse the remaining n - k elements.
//   This rotates the array to the right by k steps in-place.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
