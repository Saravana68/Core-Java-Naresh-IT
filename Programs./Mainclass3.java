//program to demonstrate working of static and non-static Blocks in java
//for output the program see last lines of the code


import java.util.Scanner;
import java.lang.String;
import java.lang.System;

class Test 
{
    {
    	System.out.println("non-static block of subclass loaded!");  //declaration of non-static block in subclass
    }
    static
    {
          System.out.println("Static block of subclass loaded!");  //declaration of static block in subclass
    }
}
class Mainclass3
{
	{
		System.out.println("non-static block of Mainclass loaded!");  //declaration of non-static block in Mainclass
	}
	static
	{
		System.out.println("Static block of Mainclass loaded!");     //declaration of static block in Mainclass
	}

	public static void main(String args[])
	 {
	 	Mainclass3 md = new Mainclass3();
	 	Test td = new Test();
	 	Test t2 = new Test();
	 	Test t3 = new Test();
	 	Test t4 = new Test();
	 	Test t5 = new Test();
	 }
}


//output of the above program
/*
Static block of Mainclass loaded!
non-static block of Mainclass loaded!
Static block of subclass loaded!
non-static block of subclass loaded!
non-static block of subclass loaded!
non-static block of subclass loaded!
non-static block of subclass loaded!
non-static block of subclass loaded!       */
