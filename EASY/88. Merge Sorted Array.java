// Problem: 88. Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Approach: Copy non-zero elements of nums1 and all elements of nums2 into a list. 
//           Fill with zeros if needed, then sort and copy back to nums1.
// Time Complexity: O((m+n) log(m+n))
// Space Complexity: O(m+n)

class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int num1: nums1)
        {
            if(num1!=0)
                list.add(num1);
        }
        for(int num2 : nums2)
        {
            if(num2!=0)
                list.add(num2);
        }
        while(list.size()<nums1.length)
        {
            list.add(0);
        }
        Collections.sort(list);
      
        for(int i=0;i<list.size();i++)
            nums1[i]=list.get(i);
        
        
    }
}
