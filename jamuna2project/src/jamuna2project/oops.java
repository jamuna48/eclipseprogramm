package jamuna2project;
 /*examples for objects an class ***withobject
  * it is bottom up approach
  */

 class application {
	String name;// = "jamuna";
	int acnumber;// = 1234567;
	
	public int withdraw(int x, int y ) {
		int amount = x + y;
		return amount;
	}
		
		
		public  void  print () {
			System.out.println(" accountant name is " + name);
			System.out.println("account number is " + acnumber);
		}//encapsulation
	}

public class oops {
	public static void main(String[]args) {
		application result = new application();
		int last = result.withdraw(10000 , 20000);
	  	
	  result.name = "jamuna";
	  result.acnumber = 1234567;
	  result.print();
	  application s2 = new application();
	  s2.name = "shyamala";
	  s2.acnumber = 9876544;
	  
	  
		System.out.println( "final amount is" + last );
		System.out.println(s2.name + " " + s2.acnumber );
		
		
		
	}
	
	

}
