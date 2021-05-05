//program to demonstrate working of static and non static variables 
//program to demonstrate working of static and non static Methods

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

class Display{

	int x = 10;    //declaration of instance variable
	static int y = 20; // declaration of static variable

	void getValue()  // declaration of instanc Method it can access both static & nonstatic Variables
	{
		int c = 30;  //local variable for instance variable
		x++;         //accessing instance variable from instance Method
		y++;         //accessing static variable from Instance Method

		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);
		System.out.println("The value of z is: "+c);


	}

	static void getVal()   //declaration fo static Method
	{
		int c = 40;       // local variable for static Method
		y++;              //agian accessing the same static variable from static method

		System.out.println("Incremented value in static Method is :"+y);
		System.out.println("Value of local variable in static method: "+c);
	}
}

class Mainclass2
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		Display d = new Display();

		d.getValue();
		Display.getVal();

	}
}
