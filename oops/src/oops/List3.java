package oops;
import java.util.ArrayList;
import java. util.List;

public class List3 {

	public static void main(String[] args) {
		
ArrayList a = new ArrayList();	
a.add(100);
a.add(900);
a.add("jamuna");
a.add(200);
a.add(800);
a.add("iii");
System.out.println(a);
 List l2= a.subList(2,4 );//fromindex is----- inclusive, toindex is -------exlucsive 
 System.out.println(l2);
 l2.add(7);
 System.out.println(l2);
 



	}

}
