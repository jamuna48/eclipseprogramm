package oops;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Cursors1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList j = new ArrayList();
		j.add("jamuna");
		j.add("ananth");
		j.add("arunkumar");
		j.add("janani");
		j.add("rithika");
		j.add("rithish");
		j.add("thirunesh");
		//System.out.println(j);
		//Iterator i = j.iterator();
		
	/*	while(i.hasNext()) {
			if(i.next().equals("jamuna")) {
				i.remove();
				
			}
				
			
			//System.out.println(i.next());
		//i.remove();
			
		}
		System.out.println("after remove jamuna--------------->"+j);*/
		
		
		
		ListIterator li = j. listIterator();

		
		while(li.hasPrevious()) {
			
			System.out.println(li.previous());
			System.out.println("kkk");
			
		}
		
		/*System.out.println(li.hasPrevious());
		System.out.println(li.previous());*/
		
			}

	}
