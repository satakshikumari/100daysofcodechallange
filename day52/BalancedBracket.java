/* HackerRank | Balanced Bracket


A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.


Sample Input

STDIN           Function
-----           --------
3               n = 3
{[()]}          first s = '{[()]}'
{[(])}          second s = '{[(])}'
{{[[(())]]}}    third s ='{{[[(())]]}}'
Sample Output

YES
NO
YES

Explanation

The string {[()]} meets both criteria for being a balanced string.
The string {[(])} is not balanced because the brackets enclosed by the matched pair { and } are not balanced: [(]).
The string {{[[(())]]}} meets both criteria for being a balanced string.

Code */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 //int arr[] = new int[n];
 for(int arr_i=0; arr_i < n; arr_i++){
 Stack st = new Stack();
 //arr[arr_i] = in.nextInt();
 String ipSeq = in.next();
 //System.out.println(ipSeq);
 boolean match = true;
 for(int ind=0; ind<ipSeq.length(); ind++){
 char ch = ipSeq.charAt(ind);
 if(ch=='(' || ch=='{' || ch=='['){
 st.push(ch);
 }else if(st.isEmpty()){
 match = false;
 break;
 }else if(ch==')'){
 if('('!=(char)st.pop()){
 match = false;
 break;
 }
 }else if(ch=='}'){
 if('{'!=(char)st.pop()){
 match = false;
 break;
 }
 }else if(ch==']'){
 if('['!=(char)st.pop()){
 match = false;
 break;
 }
 }
 }
 if(match){
 if(!st.isEmpty()){
 System.out.println("NO");
 }else{
 System.out.println("YES");
 }
 }else{
 System.out.println("NO");
 }
}
}
}

