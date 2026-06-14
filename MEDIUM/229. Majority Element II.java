// Problem: 229. Majority Element II
// Link: https://leetcode.com/problems/majority-element-ii/
//
// Approach:
// - Use the Boyer-Moore Voting Algorithm to find up to two potential majority candidates.
// - Traverse the array and maintain two candidates with their respective counts.
// - If the current element matches a candidate, increment its count.
// - Otherwise, assign it as a new candidate if a count becomes zero; else decrement both counts.
// - Perform a second pass to verify the actual frequencies of the two candidates.
// - Add the candidates appearing more than ⌊n/3⌋ times to the result.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int num1 = 0;
        int count1 = 0;

        int num2 = 0;
        int count2 = 0;

        for(int i:nums)
        {
            if(num1 == i)
            {
                count1++;
            }
            else if(num2 == i)
            {
                count2++;
            }
            else if(count1 == 0)
            {
                count1 = 1;
                num1 = i;
            }
            else if(count2 == 0)
            {
                count2 = 1;
                num2 = i;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for(int i:nums)
        {
            if(num1 == i) count1++;
            else if(num2 == i) count2++;
        }

        List<Integer> res = new ArrayList<>();

        if(count1 > nums.length / 3)
            res.add(num1);
        if(count2 > nums.length / 3)
            res.add(num2);

        return res;
    }
}
