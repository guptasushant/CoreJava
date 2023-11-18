package collection;
import java.util.*;
import java.util.Scanner;
public abstract class Module{
	
	private  int id;
	private  String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", name=" + name + "]";
	}
	
//	private int getId() {
//		return id;
//	}
//	private String getName() {
//		return name;
//	}
//	protected void setId(int id) 
//	{
//		this.id=id;
//	}
//	protected void setName(String name) 
//	{
//		this.name=name;
//	}public String toString() {
//		return "[id = "+ getId()+" name = "+getName()+"]";
//	}
//	public static void main(String[] args) {
//		Module module = new Module();
//		System.out.println("--------Enter the details below--------");
//		module.setId(sc.nextInt());
//		sc.nextLine();
//		module.setName(sc.nextLine());
//		System.out.println("----the data is given below----");
//		System.out.println(module.toString());
//		System.out.println(module.getName());
//	}

}

    


