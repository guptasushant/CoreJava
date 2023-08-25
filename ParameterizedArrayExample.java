package com.arrays;

class ParameterizedArraysExample
{
	int arr[] = new int[5];
	  void m1(int arr[])
	  {
		this.arr=arr;
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}
	  }
	}
class TestParameterizedarray{
	public static void main(String args[]){
	ParameterizedArraysExample p1 = new ParameterizedArraysExample();	
	p1.m1(new int[]{1,2,3,4,5});
	}
}