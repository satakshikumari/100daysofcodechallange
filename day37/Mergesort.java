/* MERGE SORT

CODE */

import java.util.*;
import java.util.Scanner;
public class Mergesort
{
    void merge(int arr[], int p, int q, int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int [n1];
        int M[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = arr[p + i];
        for (int j=0; j<n2; ++j)
            M[j] = arr[q + 1+ j];
        int i = 0, j = 0;
        int k = p;
        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);                                       
        System.out.println("Enter number of value in array -");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
            Mergesort ob = new Mergesort();
            ob.sort(arr, 0, n-1);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " "); 
    }
}
}


/* OUTPUT
Enter number of elements in array -
5
Enter 5 elements in array-
57
56
36
05
10
Sorted array-
5 10 36 56 57
