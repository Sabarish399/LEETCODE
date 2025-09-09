// Problem: 977. Squares of a Sorted Array
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Approach: Square each element, store in a list, sort the list, and copy back to the array.
// Time Complexity: O(n log n)
// Space Complexity: O(n)


class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        ArrayList<Integer> list =new ArrayList<>(); 
        for(int num : nums)
        {
            list.add(num*num);
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++)
        {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
