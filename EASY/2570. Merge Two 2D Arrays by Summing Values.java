// Problem: 2570. Merge Two 2D Arrays by Summing Values
// Link: https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/
//
// Approach (Two Pointers):
// - Both arrays are sorted by id.
// - Use two pointers i and j.
// - Compare current ids:
//     • If equal:
//         - Add values and store result.
//         - Move both pointers.
//     • If id1 < id2:
//         - Add nums1[i].
//         - Move i.
//     • If id2 < id1:
//         - Add nums2[j].
//         - Move j.
// - Add remaining elements from either array.
// - Convert list to 2D array and return.
//
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

class Solution 
{
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        int i=0,j=0;
        List<int[]> res = new ArrayList<>();

        while(i<nums1.length && j<nums2.length)
        {
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];

            if(id1 == id2)
            {
                res.add(new int[]{id1 , val1+val2});
                i++;
                j++;
            }
            else if(id1 < id2)
                res.add(nums1[i++]);
            else
                res.add(nums2[j++]);
        }

        while(i<nums1.length)
        {
            res.add(nums1[i++]);
        }

        while(j<nums2.length)
        {
            res.add(nums2[j++]);
        }

        return res.toArray(new int[res.size()][]);
    }
}
