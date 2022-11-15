/* Binary search
Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. 

Input-
1. Take imput for number of elements to be entered in array.
2. Elements in array.
3. Key element to be searched.

Code */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter element to be searched in array-");
        int key=s.nextInt();
        int b=search(a,key);
        if(b!=-1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        
        long end = System.nanoTime();
        long execution = (end - start)/1000000000;
        System.out.println("");
        System.out.println("Execution time: " + execution + " seconds");
        
    }
    static int search(int[] a, int key){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
}


/* Output-
Case 1- ELEMENT FOUND
Enter number of value in array -
5
Enter 5 elements in array-
44
77
88
99
54
Enter element to be searched in array-
77
Element found

Execution time: 55 seconds


Case2- ELEMENT FOUND

Enter number of value in array -
5
Enter 5 elements in array-
44
77
88
99
33
Enter element to be searched in array-
7
Element not found

Execution time: 55 seconds

Time Complexity: O(log n)
Auxiliary Space: O(1)




*/
