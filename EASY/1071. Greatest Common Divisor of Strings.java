// Problem: 1071. Greatest Common Divisor of Strings
// Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/
// Approach: First, check if str1 + str2 equals str2 + str1; if not, no common divisor exists. 
//           Otherwise, compute the GCD of the lengths of str1 and str2 using the Euclidean algorithm. 
//           The substring of length GCD from either string is the answer.
// Time Complexity: O(m + n), for string concatenation and comparison (where m and n are lengths of str1 and str2). 
//                  GCD computation takes O(log(min(m, n))) which is negligible.
// Space Complexity: O(1), ignoring the temporary concatenated strings (which can be considered O(m + n)).

class Solution 
{
    public String gcdOfStrings(String str1, String str2) 
    {
        if(!(str1+str2).equals(str2+str1))
            return "";
        
        int len1 = str1.length();
        int len2 = str2.length();

        while(len2 != 0)
        {
            int temp = len1 % len2;
            len1 = len2 ;
            len2 = temp;
        }

        return str2.substring(0,len1);
    }
}
