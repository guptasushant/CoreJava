package com.objects;

import java.util.Scanner;
class Calculator2
{
	public static void main(String calculator[])
	{
		Scanner sc = new Scanner(System.in);
		boolean value = true;
		while(value){
		System.out.println("ENTER THE VALUE OF a : ");
		int a =sc.nextInt();
		System.out.println("ENTER THE VALUE OF b : ");
		int b =sc.nextInt();
		System.out.println("ENTER THE OPERATOR +: ");
		System.out.println("ENTER THE OPERATOR -: ");
		System.out.println("ENTER THE OPERATOR *: ");
		System.out.println("ENTER THE OPERATOR /: ");
		System.out.println("ENTER THE button to exit 5: ");
		String button=sc.next();
		switch(button)
		{
			case "+" : System.out.println("addition of "+a+" + "+b+" is " + (a+b));
			break;
			case "-" : System.out.println("subraction of "+a+" - "+b+" is " + (a-b));
			break;
			case "*" : System.out.println("multiplication of "+a+" * "+b+" is " + (a*b));
			break;	
			case "/" : System.out.println("division of "+a+" / "+b+" is " + (a/b));
			break;
			case "5" : System.out.println("sucessfully exited...");
			value=false;
			break;
			default :System.out.println("INVALID BUTTON");
		}
		}
	}
}