// Problem: 658. Find K Closest Elements
// Link: https://leetcode.com/problems/find-k-closest-elements/
// Approach: Use binary search to find the left boundary of the window of size k. 
//           Compare distances between x and both ends to decide the direction of the window. 
//           Collect the k elements starting from the left index.
// Time Complexity: O(log(n - k) + k) → binary search O(log(n - k)) + building the result O(k).
// Space Complexity: O(k), for storing the result.

class Solution 
{
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int left = 0,right = arr.length - k;

        while(left < right)
        {
            int mid = left + (right - left)/2;

            if(x-arr[mid] > arr[mid+k]-x)
                left = mid+1;
            else
                right = mid;
        }
      
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<left+k;i++)
            list.add(arr[i]);
      
        return list;
    }
}
