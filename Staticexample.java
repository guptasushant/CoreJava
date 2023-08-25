package com.objects;

class StaticExample
{
	static int a = m1()+ m2();
	static 
	{
		System.out.println("in static block "+ a);
	}
	static int m1()
	{
		System.out.println("in m1 method" + a);
		return 1;
	}
	static int m2()
	{
		System.out.println("in m2 method");
		return 1;
	}
	public static void main(String []args)
	{
		
	System.out.println("in  main "+a);
	}
}