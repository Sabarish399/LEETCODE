// Problem: 3751. Total Waviness of Numbers in Range I
// Link: https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/
//
// Approach:
// - Iterate through every number in the range [num1, num2].
// - Numbers with fewer than 3 digits have waviness 0.
// - For each number:
//     • Extract digits from right to left.
//     • For every middle digit, check whether it is:
//         - a peak  : greater than both neighbors
//         - a valley: smaller than both neighbors
//     • Count all peaks and valleys in that number.
// - Add each number's waviness to the final answer.
//
// Time Complexity: O((num2 - num1 + 1) × d)
//     - d = number of digits
// Space Complexity: O(1)

class Solution 
{
    public int totalWaviness(int num1, int num2) 
    {
        int count=0;
        for(int i=num1;i<=num2;i++)
        {
            if(i<100) continue;
            int temp = i;
            int last = temp%10;
            temp/=10;
            int curr = temp%10;
            temp/=10;

            
            while(temp>0)
            {
                int next = temp%10;
                temp /=10;
                if(curr < last && curr < next || curr > next && curr > last) count++;
                last = curr;
                curr = next;
            }
        }
        return count;
    }
}
