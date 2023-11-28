package Advance;
import java.util.*;
public class JdbcExample1 
{
	private static Scanner sc= new Scanner(System.in);
	private static  Employees employees;
	public static void main(String[] args) 
	{
		List<Employees>list=new ArrayList<Employees>();
		int button;
		do 
		{
			System.out.println("WELCOME TO CRUD OPERATION");
			System.out.println("ENTER 1 INSERT");
			System.out.println("ENTER 2 DISPLAY");
			System.out.println("ENTER 3 SEARCH");
			System.out.println("ENTER 4 DELETE");
			System.out.println("ENTER 5 UPDATE");
			System.out.println("ENTER 0 to EXIT");
			System.out.println("ENTER YOUR CHOICE:-");
			button=sc.nextInt();
			switch(button) 
			{
			case 1:
				System.out.println("--------------------------------");
				System.out.print("enter the empid:-");
				int empid=sc.nextInt();
				System.out.print("enter the name :-");
				String name=sc.next();
				System.out.print("enter the salary:-");
				float salary=sc.nextFloat();
				list.add(new Employees(empid, name, salary));
				break;
			case 2:
				System.out.println("--------------------------------");
				for (Employees employees : list) 
				{
					System.out.println(employees);
				}
				break;
			case 3:
				System.out.println("--------------------------------");
				boolean found=false;
				System.out.println("enter the empid to search");
				empid=sc.nextInt();
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
				break;
			case 4:
				System.out.println("--------------------------------");
				 found=false;
				System.out.println("enter the empid to search");
				empid=sc.nextInt();
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
				break;
			case 5:
				System.out.println("--------------------------------");
				found=false;
				System.out.println("enter the empid to search");
				empid=sc.nextInt();
				ListIterator<Employees>li=list.listIterator();
				while(li.hasNext())
				 employees  = li.next();
				if(employees.getEmp_id()==empid) 
				{
				System.out.println("enter the new name");
				name=sc.next();
				System.out.println("enter the new salary");
				salary=sc.nextFloat();
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
				break;
			}
			
				
		}while(button!=0);
	}
	
}
