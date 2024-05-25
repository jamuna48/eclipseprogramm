package oops;


class College{
	int fine = 1100;
	public void permission() {
		System.out.println("");}
	public void meeting() {
		int j = 100;
		System.out.println("meeting for function");
		System.out.println(j);
	}
		 class Department{
			 int fine = 2000;
			public void function() {
				System.out.println("cse dept. function");
				System.out.println(fine);
				
				System.out.println(
						College.this.fine );
					}
			
		}
		
	}


public class Nestedclass {
	
	public static void main (String[]args) {
		College principal = new College();
		//College .Department hod = new College.Department();
	//	hod.function(); 
		College .Department hod = principal. new Department();
		hod.function();
		principal.meeting();
	}
}
