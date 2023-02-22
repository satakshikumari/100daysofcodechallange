/*
Example 1:
Input: ideas = ["coffee","donuts","time","toffee"]
Output: 6
Explanation: The following selections are valid:
- ("coffee", "donuts"): The company name created is "doffee conuts".
- ("donuts", "coffee"): The company name created is "conuts doffee".
- ("donuts", "time"): The company name created is "tonuts dime".
- ("donuts", "toffee"): The company name created is "tonuts doffee".
- ("time", "donuts"): The company name created is "dime tonuts".
- ("toffee", "donuts"): The company name created is "doffee tonuts".
Therefore, there are a total of 6 distinct company names.
The following are some examples of invalid selections:
- ("coffee", "time"): The name "toffee" formed after swapping already exists in the original array.
- ("time", "toffee"): Both names are still the same after swapping and exist in the original array.
- ("coffee", "toffee"): Both names formed after swapping already exist in the original array.
Example 2:
Input: ideas = ["lack","back"]
Output: 0
Explanation: There are no valid selections. Therefore, 0 is returned.
Code-
*/

class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<Integer>[] count = new HashSet[26];
        for (int i = 0; i < 26; ++i)
            count[i] = new HashSet<>();
        for (String s : ideas)
            count[s.charAt(0) - 'a'].add(s.substring(1).hashCode());
        long res = 0;
        for (int i = 0; i < 26; ++i)
            for (int j = i + 1; j < 26; ++j) {
                long c1 = 0, c2 = 0;
                for (int c : count[i])
                    if (!count[j].contains(c)) c1++;
                for (int c : count[j])
                    if (!count[i].contains(c)) c2++;
                res += c1 * c2;
            }
        return res * 2;
    }
}