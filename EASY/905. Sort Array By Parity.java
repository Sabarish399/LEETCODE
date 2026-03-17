// Problem: 905. Sort Array By Parity
// Link: https://leetcode.com/problems/sort-array-by-parity/
//
// Approach:
// - Create a result array of same size.
// - Use two pointers:
//     • even → starts from beginning (0)
//     • odd → starts from end (n-1)
// - Traverse input array:
//     • If number is even → place at ans[even++].
//     • If number is odd → place at ans[odd--].
// - Return the result array.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int n = nums.length;

        int i = 0;
        int even = 0;
        int odd = n-1;
        int[] ans = new int[n];

        while(even <= odd && i < n)
        {
            if(nums[i]%2 == 0)
            {
                ans[even++] = nums[i];
            }
            else
            {
                ans[odd--] = nums[i];
            }
            i++;
        }
        return ans;
    }
}
