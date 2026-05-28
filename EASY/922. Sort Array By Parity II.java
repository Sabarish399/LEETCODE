// Problem: 922. Sort Array By Parity II
// Link: https://leetcode.com/problems/sort-array-by-parity-ii/
//
// Approach (Two Pointers on Even/Odd Indices):
// - Even indices must contain even numbers.
// - Odd indices must contain odd numbers.
// - Maintain:
//     • even → next even index
//     • odd  → next odd index
// - Traverse:
//     • If nums[even] is correct → move even by 2
//     • Else if nums[odd] is correct → move odd by 2
//     • Otherwise:
//         - nums[even] is odd
//         - nums[odd] is even
//         - Swap them
// - Return modified array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int[] sortArrayByParityII(int[] nums) 
    {
        int odd = 1, even = 0, n = nums.length;

        while(even<n && odd<n)
        {
            if(nums[even]%2 == 0) even+=2;
            else if(nums[odd]%2 == 1) odd+=2;
            else
            {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
}
