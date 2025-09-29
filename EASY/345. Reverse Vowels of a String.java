// Problem: 345. Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Approach: Use two pointers, one starting from the left and one from the right. 
//           Move them inward until both point to vowels, then swap. 
//           Continue until the pointers cross. Finally, return the modified string.
// Time Complexity: O(n), where n is the length of the string.
// Space Complexity: O(n), due to converting the string to a char array.

class Solution 
{
    public String reverseVowels(String s) 
    {
        char[] chars = s.toCharArray();

        int left = 0,right = chars.length-1;

        while(left<right)
        {
            while(left<right && "AEIOUaeiou".indexOf(chars[left])==-1)
                left++;
            while(left<right && "AEIOUaeiou".indexOf(chars[right])==-1)
                right--;

            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]=temp;

            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
