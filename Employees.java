package Advance;

public class Employees
{
	private int empid;
	private String name;
	private float salary;
	public Employees(int empid,String name,float salary) {
	
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public int getEmp_id() 
	{
		return empid;
	}
	public String getName() 
	{
		return name;
	}
	public float getSalary() 
	{
		return salary;
	}
	
	
	@Override
	public String toString() 
	{
	return "Employees [emp_id=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
