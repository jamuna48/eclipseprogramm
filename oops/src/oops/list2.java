package oops;
import java.util.List;
import java.util.ArrayList;
public class list2 {
	public static void main(String[]args) {
		ArrayList l = new ArrayList();
		l.add(100);
		l.add(9099);
		l.add(222);
		l.removeAll(l);
	//System..out.println(l);
		
		ArrayList l2 = new ArrayList();
		l2.add("kkkk");
		l2.add(l);
	//System.out.println("l2--->"+l2);
	//	l2.removeAll(l);------->doubt	
	//	System.out.println(l2);
	//	l2.retainAll(l);
	System.out.println(l2.set(1,"hhh"));
		System.out.println(l2);
		
	}

}
