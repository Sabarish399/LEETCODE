// Problem: 78. Subsets
// Link: https://leetcode.com/problems/subsets/
// Approach: Iterative subset generation. Start with the empty subset.  
//           For each number, duplicate all existing subsets and append the number to each copy.
//           Add these new subsets to the result list.
// Time Complexity: O(n * 2^n) — each element doubles the subset count
// Space Complexity: O(2^n) — storage of all subsets

class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums)
        {
            int size = result.size();
            for (int i = 0; i < size; i++)
            {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }
}





