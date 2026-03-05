// Problem: 929. Unique Email Addresses
// Link: https://leetcode.com/problems/unique-email-addresses/
//
// Approach:
// - Use a HashSet to store normalized email addresses.
// - For each email:
//     • Split into local and domain using '@'.
//     • In the local part:
//         - Ignore everything after '+'.
//         - Remove all '.' characters.
//     • Combine normalized local with domain.
//     • Add the result to the set.
// - Return the size of the set.
//
// Time Complexity: O(n * m)
//     - n = number of emails
//     - m = average length of email
// Space Complexity: O(n)

class Solution 
{
    public int numUniqueEmails(String[] emails) 
    {
        Set<String> uniqueEmails = new HashSet<>();

        for(String email : emails)
        {
            String local = email.split("@")[0];
            String domain = email.split("@")[1];

            local = local.split("\\+")[0];
            local = local.replace(".","");

            uniqueEmails.add(local+"@"+domain);
        }
        return uniqueEmails.size();
    }
}
