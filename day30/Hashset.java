/* Hashset | HackerRank

Input Format

In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.

Constraints:

Length of each string is atmost 5 and will consist lower case letters only.
Output Format

Print T lines. In the ith line, print number of unique pairs you have after taking ith  pair as input.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3


Code-
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

    Set<String> set = new HashSet<>();
    String name = "";
    int count = 0;
    for (int i = 0; i < t; i++) {
        name = pair_left[i] + " " + pair_right[i];
        if (set.add(name)){
            count++;
        }
        System.out.println(count);                
    }

    }
}
