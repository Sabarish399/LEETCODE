// Problem: 303. Range Sum Query - Immutable
// Link: https://leetcode.com/problems/range-sum-query-immutable/
//
// Approach (Prefix Sum):
// - Precompute prefix sums where:
//     • prefix[i] = sum of elements from index 0 to i-1.
// - Create prefix array of size n+1.
// - prefix[0] = 0.
// - For each index i:
//     • prefix[i+1] = prefix[i] + nums[i].
// - To get sum from left to right:
//     • sum = prefix[right+1] - prefix[left].
//
// Time Complexity:
//     Constructor → O(n)
//     sumRange() → O(1)
//
// Space Complexity: O(n)

class NumArray {
    int prefix[];
    public NumArray(int[] nums)
    {
        prefix = new int[nums.length+1];
        prefix[0] = 0;
        for(int i=0;i<nums.length;i++)
        {
            prefix[i+1] = prefix[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) 
    {
        return prefix[right+1] - prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
