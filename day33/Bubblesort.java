/* BUBBLE SORT
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

iNPUT-
1. Number of elements in array.
2. Elements in array.

Code */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
        int n = s.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        Bubble(a,n);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(a[i] + " ");  
                } 
    }
    static void Bubble(int[] a, int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=a.length-1;j>i;j--)
                if(a[j]<a[j-1])
                {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
        }
    }
}

/* Output
Enter number of value in array -
6
Enter 6 elements in array-
338
667
46
7
98
3
Sorted array-
3 7 46 98 338 667 
