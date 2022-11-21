/* HEAP SORT

CODE */

import java.util.Scanner;

public class Heapsort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);                                       
        System.out.println("Enter number of elements in an array -");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
            Heapsort ob = new Heapsort();
            ob.heapsort(arr);
        System.out.println("Sorted array-");  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }
    }
    static final void swap(int[] a, int i , int j){
        int temp= a[i];
        a[i]=  a[j];
        a[j]= temp;
    }
    
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
              swap(arr,i,largest);
            heapify(arr, n, largest);
        }
    }
    static void heapsort(int[] arr){
        int n=arr.length;
        for (int i = n/2-1; i >=0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n-1; i >=0; i--) {
            swap(arr,0,i);
            heapify(arr, i, 0);
        }
    }
    
}


/* OUTPUT-

Enter number of elements in an array -
5
Enter 5 elements in array-
33
5
6
77
4
Sorted array-
4 5 6 33 77
