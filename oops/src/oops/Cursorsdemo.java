package oops;

import java.util.ArrayList;
import java.util.Iterator;//interface
import java.util.LinkedList;

import javax.print.attribute.standard.JobKOctets;

public class Cursorsdemo {
	public static void main(String[]args) {
		ArrayList j = new ArrayList();
		j.add(6);
		j.add(1000);
		j.add("jamuna");
		j.add("prasanna");
		j.add("karthikeyan");
	//	for(Object my:j) {
			//System.out.println(my);
		Iterator k = j.iterator();
while (k.hasNext()) {
System.out.println(k.next());
k.remove();
		}
System.out.println(j);
	}

}
