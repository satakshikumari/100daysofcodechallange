/*  HackerRank Subarray Problem

Input Format

The first line contains a single integer, denoting the length of array .
The second line contains  space-separated integers describing each respective element,in array .

Sample Input

5
1 -2 4 -5 1

Output Format

Print the number of subarrays having negative sums.


Code*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] =new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
     }
    int sum=0;
    int count=0;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            sum =sum+arr[j];
            if(sum<0){
                count++;
            }
        }
        sum=0;
    } 
    System.out.println(count);    
    }
}



/*Output
9
