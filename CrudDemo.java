package Advance;
import java.util.*;
public class CrudDemo 
{
	private static Scanner sc= new Scanner(System.in);
	private static  Employees employees;
	private static List<Employees>list=new ArrayList<Employees>();
	 void Insert() 
	{
		System.out.println("--------------------------------");
		System.out.print("enter the empid:-");
		int empid=sc.nextInt();
		System.out.print("enter the name :-");
		String name=sc.next();
		System.out.print("enter the salary:-");
		float salary=sc.nextFloat();
		list.add(new Employees(empid, name, salary));
		
	}
	 void Display() 
	{
		System.out.println("--------------------------------");
		for (Employees employees : list) 
		{
			System.out.println(employees);
		}
	}
	 void Search() 
	{
		System.out.println("--------------------------------");
		boolean found=false;
		System.out.println("enter the empid to search");
		int empid=sc.nextInt();
		for (Employees employees : list) 
		{
			if(employees.getEmp_id()==empid) 
			{
			System.out.println(employees);
			found=true;
			}
			System.out.println("--------------------------------");
			if(!found) 
			{
			System.out.println("RECORD OF EMPLOYEE NOT FOUND ");
			}
		}
	}
	  void Delete() 
	{
		System.out.println("--------------------------------");
		 boolean found=false;
		System.out.println("enter the empid to search");
		int empid=sc.nextInt();
		Iterator<Employees>itr=list.iterator();
		while(itr.hasNext())
		 employees  = itr.next();
		if(employees.getEmp_id()==empid) 
		{
		itr.remove();
		found=true;
		}
		System.out.println("--------------------------------");
		if(!found) 
		{
		System.out.println("RECORD OF EMPLOYEE NOT FOUND ");
		}else 
		{
			System.out.println("RECORD DELETED SUCCESSFULLY");
		}
	}
	 void Update() 
	{
		System.out.println("--------------------------------");
		boolean found=false;
		System.out.println("enter the empid to search");
		int empid=sc.nextInt();
		ListIterator<Employees>li=list.listIterator();
		while(li.hasNext())
		 employees  = li.next();
		if(employees.getEmp_id()==empid) 
		{
		System.out.println("enter the new name");
		String name=sc.next();
		System.out.println("enter the new salary");
		float salary=sc.nextFloat();
		li.set(new Employees(empid,name,salary));
		found=true;
		}
		System.out.println("--------------------------------");
		if(!found) 
		{
		System.out.println("RECORD OF EMPLOYEE NOT FOUND ");
		}else 
		{
			System.out.println("RECORD UPDATED SUCCESSFULLY");
		}
	}

}
