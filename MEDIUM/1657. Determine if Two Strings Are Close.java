// Problem: 1657. Determine if Two Strings Are Close
// Link: https://leetcode.com/problems/determine-if-two-strings-are-close/
// Approach: Count the frequency of each character in both strings using two arrays.  
//           1️⃣ Check that both strings contain the same set of characters (non-zero frequencies align).  
//           2️⃣ Sort both frequency arrays and compare them.  
//           If both conditions hold true, the strings are "close" as per the problem definition.
// Time Complexity: O(n + 26log26) ≈ O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean closeStrings(String word1, String word2) 
    {
        if(word1.length() != word2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c : word1.toCharArray()) arr1[c - 'a']++;
        for(char c : word2.toCharArray()) arr2[c - 'a']++;

        for(int i=0;i<26;i++)
        {
            if((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] ==0)) return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
