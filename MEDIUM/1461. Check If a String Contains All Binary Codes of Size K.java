// Problem: 1461. Check If a String Contains All Binary Codes of Size K
// Link: https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
//
// Approach (HashSet + Sliding Window):
// - Iterate over the string from index 0 to s.length() - k.
// - Extract every substring of length k.
// - Store each substring in a HashSet to ensure uniqueness.
// - Total possible binary strings of length k = 2^k.
// - Return true if set size equals 2^k, else false.
//
// Time Complexity: O(n * k)
//     - n = s.length()
//     - Each substring creation takes O(k).
// Space Complexity: O(2^k) — storing all unique substrings.


class Solution 
{
    public boolean hasAllCodes(String s, int k) 
    {
        Set<String> substrings = new HashSet<>();
        for(int i=0;i+k<=s.length();i++)
        {
            substrings.add(s.substring(i,i+k));
        }
        return substrings.size() == Math.pow(2,k);
    }
}
