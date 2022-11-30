/* STACK USING ARRAY


CODE */

import java.util.Scanner;
public class StackArray{
    int arr[];
    int top;
    int size;

    StackArray(int n){
        arr=new int[n];
        size=n;
        top=-1;
    }
    void push(int a){
        if (top==size-1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top]=a;
        System.out.println(a+" Inserted at top");
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top]+" Deleted from top");
        arr[top--]=0;
    }
    void traverse(){
        if (top==-1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Elements in stack-");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the stack-");
        int n=sc.nextInt();
        StackArray s=new StackArray(n);
        int flag=0;
            while(flag==0){
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Traverse/Display");
                System.out.println("4.Exit");
                int ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to be inserted-");
                        s.push(sc.nextInt());
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.traverse();
                        break;
                    case 4:
                        flag=1;
                        break;
                    default:System.out.println("Wrong Input!!");
                        break;
                } 
            }  
    }
}


/* OUTPUT 

Enter size of the stack-
3
1.Push
2.Pop
3.Traverse/Display
4.Exit
1
Enter the element to be inserted-
11
11 Inserted at top
1.Push
2.Pop
3.Traverse/Display
4.Exit
1
Enter the element to be inserted-
22
22 Inserted at top
1.Push
2.Pop
3.Traverse/Display
4.Exit
1
Enter the element to be inserted-
33
33 Inserted at top
1.Push
2.Pop
3.Traverse/Display
4.Exit
1
Enter the element to be inserted-
44
Overflow
1.Push
2.Pop
3.Traverse/Display
4.Exit
1
Enter the element to be inserted-
444
Overflow
1.Push
2.Pop
3.Traverse/Display
4.Exit
3
Elements in stack-
33
22
11
1.Push
2.Pop
3.Traverse/Display
4.Exit
2
33 Deleted from top
1.Push
2.Pop
3.Traverse/Display
4.Exit
2
22 Deleted from top
1.Push
2.Pop
3.Traverse/Display
4.Exit
2
11 Deleted from top
1.Push
2.Pop
3.Traverse/Display
4.Exit
2
Underflow
1.Push
2.Pop
3.Traverse/Display
4.Exit
3
Underflow
1.Push
2.Pop
3.Traverse/Display
4.Exit
