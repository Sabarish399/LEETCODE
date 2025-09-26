// Problem: 605. Can Place Flowers
// Link: https://leetcode.com/problems/can-place-flowers/
// Approach: Traverse the flowerbed and check if the current plot is empty (0) and both neighbors 
//           (previous and next) are also empty (or boundary). If so, place a flower and decrement n. 
//           If n becomes 0 during traversal, return true. Otherwise, return false.
// Time Complexity: O(n), where n is the length of the flowerbed.
// Space Complexity: O(1), since we use only constant extra space.

class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        if(n==0) return true;

        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i] == 0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length -1 ||flowerbed[i+1]==0))
            {
                n--;
                if(n==0) return true;
                flowerbed[i] = 1;
               
            }
        }
        return false;
    }
}
