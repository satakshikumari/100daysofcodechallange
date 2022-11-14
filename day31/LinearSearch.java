/* Linear Search
To search an element using Linear search.

Input-
1. Number of elements to be entered in array.
2. All the array elements
3. Key element to be searched

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
        boolean b=search(a,key);
        if(b==true)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        long end = System.nanoTime();

        long execution = (end - start)/1000000000;
        System.out.println("");
        System.out.println("Execution time: "+ execution + " seconds");
        
    }
    static boolean search(int[] a, int key){
        int i=0;
        while(i<a.length && a[i]!=key)
            i++;
        if(i<a.length)
            return true;
        else
         return false;
    }
}


/* Output

CASE1- ELEMENT FOUND
Enter number of value in array -
5
Enter 5 elements in array-
22
3
677
8
6
Enter element to be searched in array-
677
Element found

Execution time: 11 seconds

CASE2- ELEMENT NOT FOUND
Enter number of value in array -
6
Enter 6 elements in array-
3
4
5
66
77
8
Enter element to be searched in array-
1
Element not found

Execution time: 16 seconds








BEST CASE COMPLEXITY 
In linear search, the best-case occurs when the search element is present at the first location of the array.
So the best-case time complexity of the linear search is o(1). 
The best-case time complexity of the linear search is o(1).

AVERAGE CASE COMPLEXITY 
In linear search average case occurs when the search element is present at the random location of the array.
so the average case time complexity of the linear search is o(1).
The average case time complexity of the linear search is o(n).

WORST-CASE COMPLEXITY
In linear search, the worst case occurs when the search element is present at the last location of the array 
So the worst-case time complexity of the linear search is o(1).In the worst case in if the search element is not present in the given array then we need to traverse the entire array to search element. So the worst-case time complexity of the linear search is o(n).
The worst-case time complexity of the linear search is o(n)

SPACE COMPLEXITY: 
The SPACE complexity of the linear search is o(1)
