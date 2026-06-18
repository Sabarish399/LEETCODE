// Problem: 1344. Angle Between Hands of a Clock
// Link: https://leetcode.com/problems/angle-between-hands-of-a-clock/
//
// Approach:
// - Compute the angle of the hour hand as 30 × hour + 0.5 × minutes.
// - Compute the angle of the minute hand as 6 × minutes.
// - Find the absolute difference between the two angles.
// - Return the smaller angle between them by taking the minimum of
//   the difference and 360 minus the difference.
//
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution 
{
    public double angleClock(int hour, int minutes) 
    {
        double angle = Math.abs(30*hour - 5.5 * minutes);
        return Math.min(angle,360-angle);
    }
}
