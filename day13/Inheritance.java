/*Inheritance

/ 1. Create a class which inherits the property of Super class.*/


//Code
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }      
	}


public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}



/*Output
I am walking
I am flying
I am singing*/



/*2. 
Input
A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Add method must return the sum of its parameters.*/

//Code-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic{
    int sum;
    public int add(int a,int b)
    {
        sum = a+b;
        return sum;
        
    } 
}
 class Adder extends Arithmetic{
     void adder(){
     }    
     }
 
public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}


/*Output
My superclass is: Arithmetic
42 13 20*/


