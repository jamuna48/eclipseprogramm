package oops;

import java.util.ArrayList;
import java.util.ArrayList;

public class list1 {
	public static void main(String []args) {
		
		ArrayList l = new ArrayList ();
		l.add(23);
		l.add(78);
		l.add(111);
		System.out.println(l.get(2));
		l.add("jamuna");
		l.add(2,"ananth");
		l.add("ananth");
		//l.clear();System.out.println("ananth's firts positio "+ l.indexOf("ananth"));
		System.out.println("ananth's firts positio "+ l.indexOf("ananth"));
		System.out.println("ananth's last  positio "+ l.lastIndexOf("ananth"));
		
		System.out.println(l.get(2));
		System.out.println("before removing" +l);
		System.out.println("after removing"+ l.remove(0));
		System.out.println(l);
		System.out.println(l.remove("jamuna"));//outout is true 
		System.out.println(l);
		//System.out.println(l);
		//System.out.println(l.size());	
	//	Sy//stem.out.println(l.contains(111));
	/*System.out.println(l);
	 * 
	 * ------------------------------------------------------------
	ArrayList l2= new ArrayList ();
	
	
	l2.add(89);
	l2.add("mahalakshmi");
	//l2.add(0 ,l);
	 System.out.println(l2); 
	System.out.println(l2.isEmpty());
System.out.println(l2);
System.out.println(l);
System.out.println(l2.indexOf(89));//------>output is index position of object
}*/
	}
}