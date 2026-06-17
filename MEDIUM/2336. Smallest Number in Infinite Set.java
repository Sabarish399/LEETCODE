// Problem: 2336. Smallest Number in Infinite Set
// Link: https://leetcode.com/problems/smallest-number-in-infinite-set/
//
// Approach:
// - Maintain a boolean array to track whether a number has been removed.
// - Keep a pointer 'min' representing the current smallest available number.
// - For popSmallest():
//     • Advance the pointer until an undeleted number is found.
//     • Mark it as deleted and return it.
// - For addBack(num):
//     • If the number was previously deleted, mark it as available again.
//     • Update the pointer if the added number is smaller than the current minimum.
//
// Time Complexity:
// - popSmallest(): O(1) amortized
// - addBack(): O(1)
//
// Space Complexity: O(1)

class SmallestInfiniteSet 
{
    boolean deleted[];
    int min;
    public SmallestInfiniteSet() 
    {
        deleted = new boolean[1001];
        min = 1;
    }
    
    public int popSmallest() 
    {
        while(deleted[min])
        {
            min++;
        }
        deleted[min] = true;
        return min;
    }
    
    public void addBack(int num) 
    {
        if(deleted[num])
        {
            deleted[num] = false;
            if(num < min) min = num;
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
