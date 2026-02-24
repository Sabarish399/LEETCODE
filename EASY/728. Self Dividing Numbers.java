// Problem: 728. Self Dividing Numbers
// Link: https://leetcode.com/problems/self-dividing-numbers/
//
// Approach:
// - Iterate from left to right.
// - For each number:
//     • Extract digits one by one using modulo 10.
//     • If digit is 0 → return false.
//     • If original number % digit != 0 → return false.
//     • Continue until all digits checked.
// - If all digits divide the number evenly, add to result list.
// - Return result list.
//
// Time Complexity: O(n * d)
//     - n = right - left + 1
//     - d = number of digits (at most 10 for int)
// Space Complexity: O(1) (excluding output list)

class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(selfDiv(i)) res.add(i);
        }
        return res;
    }
    boolean selfDiv(int i)
    {
        int temp = i;
        while(i>0)
        {
            int d = i%10;
            if(d ==0 || temp%d != 0)return false;
            i /= 10; 
        }
        return true;
    }
}
