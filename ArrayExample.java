package com.arrays;

import java.util.*;
class ArrayExample 
{		
		String[] name;
		String[] getnameofArray()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size of arrays");
			int n = sc.nextInt();
			sc.nextLine();
			name = new String[n];
			for(int i=0;i<name.length;i++)
			{
				System.out.println("enter the name ");
				name[i]=sc.nextLine();
			}
			System.out.println("the name of the list are ");
			for(int i=0;i<name.length;i++)
			{
				System.out.println("the name of person is : "+ name[i]);	
			}
			return name;
		}
		
		public static void main(String args[])
		{
		ArrayExample a1 = new ArrayExample();
		a1.getnameofArray();
		}
}