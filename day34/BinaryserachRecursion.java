/* BINARY SEARCH USING RECURSION

Code */
import java.util.Scanner;
public class Binary{
    public static void main(String[] args) {
        Binary ob = new Binary();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter element to be searched in array-");
        int key=s.nextInt();
        int b= ob.binarySearch(a,key,0,n-1);
        if(b!=-1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        
    }
     int binarySearch(int[] a, int key, int low, int high){
        int lo=0;
        int hi=a.length-1;
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==key) 
                return mid;
            if(a[mid]<key)
                return binarySearch(a,key,mid+1,hi);
                
                return binarySearch(a,key,lo,mid-1);
        }
        return -1;
    }
}


/* Output

CASE 1- ELEMENT FOUND
Enter number of value in array -
4
Enter 4 elements in array-
55
7
6
8
Enter element to be searched in array-
8
Element found


CASE 2- ELEMENT NOT FOUND
Enter number of value in array -
4
Enter 4 elements in array-
55
7
6
8
Enter element to be searched in array-
88
Element not found
