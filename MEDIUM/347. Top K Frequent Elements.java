// Problem: 347. Top K Frequent Elements
// Link: https://leetcode.com/problems/top-k-frequent-elements/
// Approach:
//   1) Count frequencies using a hashmap.
//   2) Use a min-heap of size k that keeps the k most frequent elements.
//      Push (num, freq) pairs; if heap exceeds size k, pop the smallest freq.
//   3) Extract keys from heap for the result.
// Time Complexity: O(n log k)
// Space Complexity: O(n)

class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map = new TreeMap<>();


        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            minHeap.offer(new int[]{entry.getKey() , entry.getValue()});
            if(minHeap.size()>k) minHeap.poll();
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++)
            res[i]=minHeap.poll()[0];
      
        return res;
        
    }
}
