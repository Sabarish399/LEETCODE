// Problem: 1431. Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Approach: First, find the maximum number of candies any kid currently has. 
//           Then, for each kid, check if their candies plus extraCandies is at least max. 
//           If yes, they can have the greatest number of candies.
// Time Complexity: O(n), where n is the number of kids.
// Space Complexity: O(n), for storing the result list.

class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = 0;
        for(int i : candies)
        {
            if(i>max)
                max = i;
        }

        List<Boolean> ans = new ArrayList<>();

        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
