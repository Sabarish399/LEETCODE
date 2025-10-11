// Problem: 2215. Find the Difference of Two Arrays
// Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Approach: Use two hash sets to store unique elements from each array.  
//           Compare both sets — add elements from one that are not in the other.  
//           Return a list of two lists representing the distinct elements from each array.
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);

        List<Integer>  list1 = new ArrayList<>();
        List<Integer>  list2 = new ArrayList<>();

        for(int i:set1)
        {
            if(!set2.contains(i)) list1.add(i);
        }
        for(int i:set2)
        {
            if(!set1.contains(i)) list2.add(i);
        }

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);

        return finalList;
    }
}
