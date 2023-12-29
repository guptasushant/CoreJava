package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		//set interface returns the value on  the basis of hashcode of object
		// in ascending order
		  Set<String>list=new HashSet<String>();
		//Set<String>list=new LinkedHashSet<String>();
		String s="ubbu";
		String s1="ibbu";
		String s2="chillar";
		String s3="sushant";
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(s.hashCode()%16);
		System.out.println(s1.hashCode()%16);
		System.out.println(s2.hashCode()%16);
		System.out.println(s3.hashCode()%16);
		
		Iterator<String> set=list.iterator();
		while(set.hasNext()) {
			System.out.println(set.next());
		}
	}
}
