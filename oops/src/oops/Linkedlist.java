package oops;
import java.util.List;
import java.util.LinkedList;
public class Linkedlist {
public static void main(String[]args) {
	LinkedList j = new LinkedList ();
	j.add(6);
	j.add(1000);
	j.add("jamuna");
	j.add("prasanna");
	j.add("karthikeyan");
	//System.out.println(j);
	j.addFirst("ooo");
	System.out.println(j);
	/*
	 * //j.add(1,"shyamu"); System.out.println(j); j.addLast("mahalakshi");
	 * System.out.println("after addlast -----"+j);//also have remove first and
	 * removelast
	 */
	j.pollFirst();
	
	System.out.println(" after poll is "+j);//it retrieves remove the first element
	j.pollLast();
	System.out.println("after polllast=--------"+j);
	j.offer(6000);//inserts the element end of the list
	System.out.println("afteroffer-------"+j);
	j.offerFirst(500);
	System.out.println("after offerfirst----"+j);//inserts the element front of the list
	
	System.out.println(j.get(4));
//	j.clear();
	//System.out.println("after clear---------"+j);
	j.clone();
	System.out.println("after clone is --------"+j);
	System.out.println(j.peek());//it returns the first element of the list and peeklast-------it returns the last element of the list 

}
}
