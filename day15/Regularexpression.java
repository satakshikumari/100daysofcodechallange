/* Valid Username Regular Expression

Input Format
The first line of input contains an integer ,describing the total number of usernames. Each of the next lines contains a string describing the username. 
The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters
uppercase characters and digits .
The first character of the username must be an alphabetic character, either lowercase character or uppercase character .


Output Format
For each of the usernames, code prints Valid if the username is valid; otherwise Invalid each on a new line.




Code*/

import java.util.Scanner;
class UsernameValidator {
   static String abcd = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    
    public static final String regularExpression = abcd;
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}


/* Output

8                         
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007


Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid



