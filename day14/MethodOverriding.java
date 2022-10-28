/*Method Overriding

1. Create a Soccer class that inherits from the Sports class. Override the getName method and return a different, subclass-specific string.

Code-*/
import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
      @Override
      void getNumberOfTeamMembers(){
          System.out.println("Each team has 11 players in " + getName());
      }

}

public class Solution{
	
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}


/*Output
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class*/




/* 
2.  Program using Super Keyword
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword.
Use  super.func() to call the function func(), it will call the method that was defined in the superclass.

Code-*/

import java.util.*;
import java.io.*;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp= super.define_me(); 

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}



/* Output

Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.


