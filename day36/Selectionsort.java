/* Selection Sort

Code */


import java.util.*;
import java.util.Scanner;
public class Selectionsort{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        Selectionsort ob = new Selectionsort();
        System.out.println("Enter number of value in array -");
        int n = s.nextInt();
        int array[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            array[i]=s.nextInt();
        ob.selectionSort(array,n);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(array[i] + " ");  
                }  
                
    }
    
  void selectionSort(int array[],int n) {
    int size = array.length;
    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;
      for (int i = step + 1; i < size; i++) {
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }
     }



/*
Output

Enter number of value in array -
5
Enter 5 elements in array-
33
4
555
6
12
Sorted array-
4 6 12 33 555
