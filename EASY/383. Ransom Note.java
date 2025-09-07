// Problem: 383. Ransom Note
// Link: https://leetcode.com/problems/ransom-note/
// Approach: For each character in ransomNote, check if it exists in magazine. If yes, remove it from magazine; otherwise return false.
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        for(int i=0;i<ransomNote.length();i++)
        {
            char ransom = ransomNote.charAt(i);

            int index = magazine.indexOf(ransom);

            if(index == -1)
                return false;

            magazine = magazine.substring(0,index)+magazine.substring(index+1);    
        }

        return true;
    }
}
