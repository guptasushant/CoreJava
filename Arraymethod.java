package com.arrays;

class TestArray
{
	 String[] name=new String[10];
	 String[] getNameOfArray()
	 {
		 name[0]="sushant";
		 name[1]="sushant";
		 name[2]="sushant";
		 name[3]="sushant";
		 name[4]="sushant";
		 name[5]="sushant";
		 name[6]="sushant";
		 name[7]="sushant";
		 name[8]="sushant";
		 name[9]="sushant";
		 for(int i=0;i<name.length;i++)
		 {
			 System.out.println(name[i]);
		 }
		 return name;
	 }
	public static void main(String args[])
	{
		TestArray obj = new TestArray();
		obj.getNameOfArray();
	}
}