//program to demonstrate working of scanner classes
//we can see how builtin functions in scanner classes are working and their implementation

import java.lang.System;
import java.lang.String;
import java.util.Scanner;  

class Mainclass1   //Mainclass declaration
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);  //object creation for scanner class
		Product p = new Product();          //object creation for userdefined class


		System.out.println("Enter the product code:");
		p.pCode = s.nextLine();  //receiving string as input

		System.out.println("Enter the Product Name:");
		p.pName = s.nextLine(); //receiving string as input

		System.out.println("Enter the product price:");
		p.pPrice = s.nextFloat(); //receiving string as input

		System.out.println("Enter the product quantity:");
		p.pQty = s.nextInt();  //receiving string as input

		p.getProduct();  //calling a function to print the values got from the console!
	}
}
class Product   //declaration of user defined classes 
{
    String pCode,pName;
    float pPrice;
    int pQty;

    void getProduct()
    {
    	System.out.println("pCode:"+pCode);
    	System.out.println("pName:"+pName);
    	System.out.println("pPrice:"+pPrice);
    	System.out.println("pQty: "+pQty);
    }

}
