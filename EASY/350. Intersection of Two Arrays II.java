// Problem: 350. Intersection of Two Arrays II
// Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
//
// Approach (Frequency Counting):
// - Use a frequency array to count occurrences of elements in nums1.
// - Traverse nums2:
//     • If frequency of current element > 0:
//         - Add element to result
//         - Decrement frequency
// - Convert result list to array and return.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)
//     - Frequency array size is fixed (1001)

class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int[] freq = new int[1001];

        for(int i=0;i<nums1.length;i++)
        {
            freq[nums1[i]]++;
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums2.length;i++)
        {
            if(freq[nums2[i]] > 0)
            {
                list.add(nums2[i]);
                freq[nums2[i]]--;
            }
        }
        
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++)
            res[i] = list.get(i);

        return res;
    }
}
