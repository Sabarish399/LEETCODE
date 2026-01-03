// Problem: 875. Koko Eating Bananas
// Link: https://leetcode.com/problems/koko-eating-bananas/
// Approach:
//   Use binary search on the eating speed k in the range [1, max(piles)].
//   For a given speed mid, compute the total hours needed by summing:
//       ceil(pile / mid) = (pile + mid - 1) / mid.
//   If total hours ≤ h, try a smaller speed; otherwise, increase the speed.
//   The smallest valid speed is the answer.
// Time Complexity: O(n log m) where m = max pile size
// Space Complexity: O(1)

class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max = Integer.MIN_VALUE;

        for(int i:piles)
            max = Math.max(i,max);

        int left = 1;
        int right = max;

        while(left<=right)
        {
            int mid = left + (right - left)/2;
            long sum = 0;
            for(int i:piles)
                sum += (mid+i-1)/mid;
            
            if(sum <= h)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
