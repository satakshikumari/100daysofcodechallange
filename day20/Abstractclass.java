/* Abstract class | HackerRank

Problem-

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:

Book new_novel=new Book(); 
You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.\
In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook.
Your task is to write just the MyBook class.

Your class mustn't be public.

Sample Input
A tale of two cities


Code */

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
  class MyBook extends Book 
{
    void setTitle(String s) 
    {
        title = s;
    }
}

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}


/* Output

The title is: A tale of two cities */
