// Problem: 3606. Coupon Code Validator
// Link: https://leetcode.com/problems/coupon-code-validator/
// Approach:
//   1. Define a fixed priority order for business lines: electronics, grocery, pharmacy, restaurant.
//   2. Iterate through all coupons and filter to keep only those that:
//       - Are active.
//       - Have a non-null, non-empty code of alphanumeric characters or underscores.
//       - Have a business line present in the priority map.
//   3. Store valid entries as paired (code, businessLine).
//   4. Sort the valid list first by businessLine priority, then lexicographically on code.
//   5. Extract the codes from the sorted pairs and return.
// Time Complexity: O(n log n) — sorting dominates.
// Space Complexity: O(n) — additional list for valid coupons.

class Solution 
{
    public List<String> validateCoupons(
            String[] code, String[] businessLine, boolean[] isActive) 
{

        List<Pair> list = new ArrayList<>();

        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        for (int i = 0; i < code.length; i++) 
        {
            if (!isActive[i]) continue;
            if(code[i] == null || !code[i].matches("[A-Za-z0-9_]+")) continue;
            if (!priority.containsKey(businessLine[i])) continue;

            list.add(new Pair(code[i], businessLine[i]));
        }

        Collections.sort(list, (a, b) -> {
            int p1 = priority.get(a.businessLine);
            int p2 = priority.get(b.businessLine);
            if (p1 != p2) return p1 - p2;
            return a.code.compareTo(b.code);
        });

        List<String> result = new ArrayList<>();
        for (Pair p : list) result.add(p.code);

        return result;
    }

    static class Pair 
    {
        String code;
        String businessLine;

        Pair(String c, String b) 
        {
            code = c;
            businessLine = b;
        }
    }
}
