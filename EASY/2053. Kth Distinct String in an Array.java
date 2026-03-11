// Problem: 2053. Kth Distinct String in an Array
// Link: https://leetcode.com/problems/kth-distinct-string-in-an-array/
//
// Approach:
// - Use a HashMap to count the frequency of each string.
// - First pass:
//     • Traverse the array and store frequencies in the map.
// - Second pass:
//     • Traverse the array again in original order.
//     • If frequency of current string == 1, it is distinct.
//     • Decrement k.
//     • When k == 0, return that string.
// - If fewer than k distinct strings exist, return "".
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        HashMap<String,Integer> freq = new HashMap<>();

        for(String s:arr)
            freq.put(s,freq.getOrDefault(s,0)+1);

        for(String s:arr)
        {
            if(freq.get(s)==1)
            {
                k--;
                if(k==0) return s;
            }
        }
        return "";
    }
}
