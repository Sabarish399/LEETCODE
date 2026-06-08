// Problem: 2490. Circular Sentence
// Link: https://leetcode.com/problems/circular-sentence/
//
// Approach:
// - First character of the sentence must match the last character.
// - For every space:
//     • Character before the space = last character of current word.
//     • Character after the space = first character of next word.
// - If all such pairs match, the sentence is circular.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public boolean isCircularSentence(String sentence) 
    {
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) 
            return false;

        int spaceIdx = sentence.indexOf(' ');

        while(spaceIdx != -1)
        {
            if(sentence.charAt(spaceIdx-1) != sentence.charAt(spaceIdx+1)) 
                return false;
            spaceIdx = sentence.indexOf(' ',spaceIdx+1);
        }

        return true;
    }
}
