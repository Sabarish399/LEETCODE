// Problem: 2190. Most Frequent Number Following Key In an Array
// Link: https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
//
// Approach:
// - Traverse the array and look for occurrences of the given key.
// - Whenever the key is found, increment the frequency of the immediately
//   following element.
// - Keep track of the element with the highest frequency while updating
//   the frequency array.
// - Return the element that appears most frequently after the key.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int mostFrequent(int[] nums, int key) 
    {
        int[] freq = new int[1001];
        int res = 0;
        int max = 0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == key)
            {
                freq[nums[i+1]]++;

                if(max < freq[nums[i+1]])
                {
                    max = freq[nums[i+1]];
                    res = nums[i+1];
                }
            }

        }

        return res;
    }
}
