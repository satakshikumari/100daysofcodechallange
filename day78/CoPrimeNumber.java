/*
Co-prime numbers problem

Code
*/


import java.util.*;

public class CoPrime {
    static int GCD(int a,int b)
    {
        if(a==0)
            return b;
        return GCD(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range");
        int b= sc.nextInt();
        int count=0;
        System.out.println("All Co-Prime Pairs");
        for(int a=1;a<b;a++){
            if((GCD(a,b)==1))
            {
                count++;
                System.out.println(+a+","+b);
            }
        }
        System.out.println("Total pairs = " +count);

    } 
}

/*
Output
Enter the Range
77
All Co-Prime Pairs
1,77
2,77
3,77
4,77
5,77
6,77
8,77
9,77
10,77
12,77
13,77
15,77
16,77
17,77
18,77
19,77
20,77
23,77
24,77
25,77
26,77
27,77
29,77
30,77
31,77
32,77
34,77
36,77
37,77
38,77
39,77
40,77
41,77
43,77
45,77
46,77
47,77
48,77
50,77
51,77
52,77
53,77
54,77
57,77
58,77
59,77
60,77
61,77
62,77
64,77
65,77
67,77
68,77
69,77
71,77
72,77
73,77
74,77
75,77
76,77
Total pairs = 60
