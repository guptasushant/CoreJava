package com.objects;

import java.util.*;
abstract class Encaps1
{
	final int id2;
	final String name2;
	private int id;
	private String name;
	abstract void m1();
	abstract String m2();
	
	{
		id2 = 12;
		name2 = "Sushant in block";
		System.out.println("in instance block"+id2+" "+name2);
	}
	public int getID()
	{
		return id;
	}
	void setID(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void displayData(){
		System.out.println("in bean class "+id+" "+name);
	}
}
class Encaps2 extends Encaps1
{
	void m1()
	{
		System.out.println("in m1 method");
	}
	String m2()
	{
		System.out.println("in m2 method");
		return null;
	}
}
class TestEncaps
{
	public static void main(String args[])
	{
		Encaps2 e1 = new Encaps2();
		e1.m1();
		e1.m2();
		e1.setID(11);
		e1.setName("sushant as argument");
		e1.displayData();
	}
}