package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 
{
	
	public static void main(String[] args) 
	{
	Student s=new Student(12,"sushant",'A',10);
	Student s1=new Student(11,"sanjay",'A',10);
	Student s2=new Student(10,"sharif",'A',10);
	Student s3=new Student(9,"akhtar",'A',10);
	List <Student>list=new ArrayList<>();
	list.add(s);
	list.add(s1);
	list.add(s2);
	list.add(s3);
//	Iterator<Student>itr=list.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	for (Student student : list) {
//		System.out.println(student.id+" "+student.name+" "+student.div+" "+student.std);
		System.out.println(student);
	}
	}
	
}
