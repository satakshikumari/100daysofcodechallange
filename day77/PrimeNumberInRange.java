/*
Prime Number In Range

Code-
*/

import java.util.*;
  
public class Prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range");
        int n= sc.nextInt();
        boolean[] b=new boolean[n+1];
        for(int i=0;i<=n;i++){
            b[i]=true;
        }
        for(int i=2; i*i<=n;i++){
            if(b[i]==true)
            for(int j=i*i; j<=n;j=j+i)
            {
                b[j]=false;
            }
        }
        for(int i=1;i<=n;i++){
            if(b[i]==true)
                System.out.println(i+" ");
        }
    }
}

/* Output

Enter the Range
30
1
2
3
5
7
11
13
17
19
23
29
