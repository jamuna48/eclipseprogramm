package oops;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class Mapdemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs = new HashMap();
			hs.put(12345 , "jamuna");
			hs.put(30008, "ananth");
			hs.put(4567, "rithish");
			
			/*
			 * System.out.println(hs); Set j = hs.keySet(); System.out.println(j);
			 * Collection c = hs.values(); System.out.println(c); Set s = hs.entrySet();
			 * System.out.println(s); Iterator k = s.iterator(); while (k.hasNext()) {
			 * System.out.println("    ad=fter iterator---------"+k.next());
			 * 
			 * 
			 * }
			 */
			System.out.println(hs.containsValue("jamuna"));
			System.out.println(hs.containsKey(12345));
			System.out.println(hs.equals(4567));
	}

}
