// Problem: 451. Sort Characters By Frequency
// Link: https://leetcode.com/problems/sort-characters-by-frequency/
//
// Approach (Bucket Sort):
// - Count frequency of each character using a HashMap.
// - Create bucket array of size n+1 (n = string length).
//   Index represents frequency.
// - Place each character into bucket[freq].
// - Traverse buckets from highest frequency to lowest.
// - Append each character `freq` times to the result.
//
// Time Complexity: O(n)
//     - Counting + bucket traversal
// Space Complexity: O(n)


class Solution 
{
    public String frequencySort(String s) 
    {
        int n = s.length();

        Map<Character,Integer> freq = new HashMap<>();

        for(char c:s.toCharArray())
            freq.put(c,freq.getOrDefault(c,0)+1);

        List<Character>[] bucket = new List[n+1];
        for(char c:freq.keySet())
        {
            int f = freq.get(c);

            if(bucket[f]==null)
                bucket[f] = new ArrayList<>();
            bucket[f].add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=n;i>=1;i--)
        {
            if(bucket[i] != null)
            {
                for(char c:bucket[i])
                {
                    for(int j=0;j<i;j++)
                    {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
