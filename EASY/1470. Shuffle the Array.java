// Problem: 1470. Shuffle the Array
// Link: https://leetcode.com/problems/shuffle-the-array/
// Approach:
//   Use two pointers:
//     - `left` starting at index 0 (x1 … xn)
//     - `right` starting at index n (y1 … yn)
//   Alternately place elements from left and right halves into the result array.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[2*n];

        int left = 0;
        int right = n;
        int i=0;
        while(left < n && right < 2*n)
        {
            ans[i++] = nums[left++];
            ans[i++] = nums[right++];
        }
        return ans;
    }
}
