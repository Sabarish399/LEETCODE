// Problem: 219. Contains Duplicate II
// Link: https://leetcode.com/problems/contains-duplicate-ii/
//
// Approach (Sliding Window + HashSet):
// - Maintain a sliding window of size at most k using a HashSet.
// - Traverse the array:
//     • If current element already exists in set → duplicate within range → return true.
//     • Add current element to set.
//     • If window size exceeds k → remove nums[i - k].
// - If no duplicates found within distance k → return false.
//
// Time Complexity: O(n)
// Space Complexity: O(k)

class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
            
            if(set.size() > k)
                set.remove(nums[i-k]);
        }
        return false;
    }
}
