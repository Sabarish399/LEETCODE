// Problem: 13. Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Approach: Convert each Roman character to its integer value. Iterate through the array and subtract if a smaller number comes before a bigger one; otherwise, add it.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int romanToInt(String s) 
    {
        int rom[] = new int[s.length()];

        for(int i=0;i<s.length();i++)
        {
            char r = s.charAt(i);

            switch(r)
            {
                case 'I':
                    rom[i]=1;
                    break;
                case 'V':
                    rom[i]=5;
                    break;
                case 'X':
                    rom[i]=10;
                    break;
                case 'L':
                    rom[i]=50;
                    break;
                case 'C':
                    rom[i]=100;
                    break;
                case 'D':
                    rom[i]=500;
                    break;
                case 'M':
                    rom[i]=1000;
                    break;
            }            
        }

        int sum =0;
        for(int i=0;i<rom.length;i++)
        {
            if(i<rom.length-1 && rom[i]<rom[i+1])
            {
                sum-=rom[i];
            }
            else
                sum+=rom[i];
        }

    return sum;
    }
}
