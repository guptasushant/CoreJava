package com.objects;

public class Calculator
{
	int a ;
	int b ;
	int addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a+b;
	}	
	int subraction(int a,int b)
	{
		this.a=b;
		this.b=b;
		return a-b;
	}
	int multiplication(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a*b;
	}
	int division(int a,int b)
	{
		this.a=a;
		this.b=b;
		return a/b;
	}
	public static void main(String args[])
	{
		Calculator c1 = new Calculator();
		System.out.println(c1.addition(10,10));
		System.out.println(c1.subraction(10,8));
		System.out.println(c1.multiplication(10,2));
		System.out.println(c1.division(10,2));
	}
}