/* Arrays

1. HacerRank 1D Array

Input Format

The first line contains a single integer,denoting the size of the array.
Each line  of the  subsequent lines contains a single integer denoting the value of element .

Output Format
Iterate loops through array and print each sequential element on a new line.

Code*/

mport java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int[] a = new int[n];

for(int i = 0; i < n; i++)
    a[i]=scan.nextInt();

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


/*Output

10
20
30
40
50


2. HackerRank Java 2D Arrray

Input Format
There will be exactly 6 lines,6 each containing  integers seperated by spaces. Each integer will be between 9  and -9  inclusive.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output Format
Print the largest sum among all the hourglasses in the array. Print the answer to this problem on a single line.


Code*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
         
        int maxsum= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(sum>maxsum)
                    maxsum=sum;    
            }
        }
        System.out.println(maxsum);
        bufferedReader.close();
    }
}



// Output
//19

