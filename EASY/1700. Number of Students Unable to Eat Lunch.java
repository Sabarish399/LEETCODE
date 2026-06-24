// Problem: 1700. Number of Students Unable to Eat Lunch
// Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
//
// Approach:
// - Count the number of students preferring each sandwich type (0 and 1).
// - Traverse the sandwiches stack from top to bottom.
// - If no student prefers the current sandwich type, the process stops.
// - Otherwise, serve the sandwich by decrementing the corresponding count.
// - The remaining number of sandwiches equals the number of students unable to eat.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution 
{
    public int countStudents(int[] students, int[] sandwiches) 
    {
        int[] freq = new int[2];

        for(int i:students) freq[i]++;

        int res = sandwiches.length;
        for(int i:sandwiches)
        {
            if(freq[i] == 0) break;
            if(res-- == 0) break;

            freq[i]--;
        }

        return res;
    }
}
