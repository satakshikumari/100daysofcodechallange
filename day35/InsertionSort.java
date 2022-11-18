/*
INSERTION SORT

Code */

mport java.util.Scanner;
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
        sort(a,n);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(a[i] + " ");  
                } 
    }
    static void sort(int[] a, int n){
        int key=0;
        for(int i=1;i<n;i++){
            key = a[i];
            int j=i-1;
            while (j>=0 && a[j]>key) {
                a[j+1]=a[j];
                j-=1;
            }
            a[j + 1] = key;
        }
    }
}


/* Output

Enter number of value in array -
5
Enter 5 elements in array-
44
7
88
3
9
Sorted array-
3 7 9 44 88 




