package com.logical;

import java.util.*;
class Logic11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(" *");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-i+2;k<=n;k++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(" *");
			}		
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(" *");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-i+2;k<=n;k++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(" *");
			}		
			System.out.println();
		}
	}
}