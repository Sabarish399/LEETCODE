// Problem: 2149. Rearrange Array Elements by Sign
// Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
//
// Approach:
// - Create a result array of same size.
// - Maintain two pointers:
//     • pos → next even index (0, 2, 4, ...)
//     • neg → next odd index (1, 3, 5, ...)
// - Traverse nums:
//     • If num > 0 → place at res[pos], increment pos by 2.
//     • Else → place at res[neg], increment neg by 2.
// - Return result array.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n = nums.length;
        int[] res = new int[n];

        int pos = 0;
        int neg = 1;

        for(int num : nums)
        {
            if(num > 0)
            {
                res[pos] = num;
                pos += 2;
            }
            else
            {
                res[neg] = num;
                neg += 2;
            }
        }

        return res;
    }
}
