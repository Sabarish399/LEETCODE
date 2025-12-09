// Problem: 3583. Count Special Triplets
// Link: https://leetcode.com/problems/count-special-triplets/
// Approach:
//   Use two frequency maps to maintain counts of values to the left and right of the current middle index.
//   - Initialize `right` with counts of nums[2..n-1] and `left` with nums[0].
//   - For each middle index i from 1 to n-2, the required target is 2 * nums[i].
//   - If both `left` and `right` contain target, add left.get(target) * right.get(target) to the answer.
//   - After processing i, move nums[i] into `left` and decrement the count of nums[i+1] from `right`.
//   Use long arithmetic and take modulo 1e9+7 when accumulating the count.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int specialTriplets(int[] nums) 
    {
        int n=nums.length;
        long count = 0;
        long mod = 1000000007;

        Map<Integer,Integer> left = new HashMap<>();
        Map<Integer,Integer> right = new HashMap<>();

        for(int i=2;i<n;i++)
        {
            right.put(nums[i],right.getOrDefault(nums[i],0)+1);
        }

        left.put(nums[0],1);

        int i = 1;
        while(i<n-1)
        {
            int target = nums[i] * 2;
            if(left.containsKey(target) && right.containsKey(target))
            {
                int n1 = left.get(target);
                int n2 = right.get(target);

                count = (count + ((long)n1 * (long)n2)%mod)%mod;
            }
            left.put(nums[i],left.getOrDefault(nums[i],0)+1);

            if(i+1 < n)
            {
                right.put(nums[i+1],right.get(nums[i+1])-1);
                if(right.get(nums[i+1]) == 0) right.remove(nums[i+1]);
            }
            i++;
        }
        return (int)count;
    }
}
