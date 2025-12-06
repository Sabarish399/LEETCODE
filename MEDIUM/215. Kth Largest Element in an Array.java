// Problem: 215. Kth Largest Element in an Array
// Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
// Approach:
//   Maintain a min-heap of size k.  
//   Iterate through all numbers, push each into the heap, and if heap size exceeds k, pop the smallest.  
//   After processing all elements, the root of the heap is the kth largest element.
// Time Complexity: O(n log k)
// Space Complexity: O(k)

class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums)
        {
            pq.add(i);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
