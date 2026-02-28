// Problem: 1404. Number of Steps to Reduce a Number in Binary Representation to One
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
//
// Approach (Greedy + Carry Simulation):
// - Traverse the binary string from right to left (excluding MSB).
// - Maintain a carry variable (initially 0).
// - For each bit:
//     • bit = current digit + carry.
//     • If bit is even (0 or 2):
//         - One step (divide by 2).
//     • If bit is odd (1):
//         - Two steps (add 1, then divide by 2).
//         - Set carry = 1.
// - After loop, if carry remains, add it to count.
// - Return total steps.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int numSteps(String s) 
    {
        int carry = 0;
        int count = 0;

        for(int i=s.length()-1;i>0;i--)
        {
            int bit = (s.charAt(i) - '0') + carry;

            if(bit%2 == 0)
                count += 1;
            else
            {
                count += 2;
                carry = 1;
            }
        }
        return count + carry;
    }
}  
