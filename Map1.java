package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Map1 {

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
//	ArrayList list = new ArrayList();
 	list.add("sushant");
	list.add("sanjay");			
	list.add("sahil");			
	list.add("javed");			
	list.add("iterator");
	Iterator <String>itr=list.iterator();	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
			
	}

}
