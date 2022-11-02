/* Arraylist | HackerRank

Input Format
The first line has an integer . In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers.
In the next line there will be an integer denoting number of queries. Each query will consist of two integers.


Output Format
In each line, output the number located in yth  position of xth line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5


Code */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<N; i++){
            list.add(new ArrayList<Integer>());
            int c = in.nextInt();
            for(int j=0; j<c; j++){
            list.get(i).add(in.nextInt());
            }
        }
            int q = in.nextInt();
            for(int i=0; i<q; i++){
                int row= in.nextInt();
                int col= in.nextInt();
                 try{
                     System.out.println(list.get(row-1).get(col-1));    
                 }
                 catch(Exception e){
                     System.out.println("ERROR!");
                 }
            }
            
            
        in.close();
            
        }
        
        
    }


/*Output

74
52
37
ERROR!
ERROR!  */

