package oops;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet hs = new HashSet();
		LinkedList ls = new LinkedList ();
		ls.add(10);
		ls.add(40);
		ls.add(70);
		ls .add(10);
		ls.add(40);
		ls.add(80);
		ls.add("hoooo");
		
		ls.toArray();
		System.out.println(ls);
		/*LinkedHashSet lhs = new	LinkedHashSet(ls);
		lhs
		System.out.println("after removing --------"+ lhs);*/
		

		
	}

}
