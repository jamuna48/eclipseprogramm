package jamuna2project; 
//two types of default constructor and parameterised constructor  class School
class School {
	 String name ;
	 int rollnumber ;
	 //default constructor//ex user name and password for website
	 School() {
		 name = "jamuna";
		 rollnumber = 100572;
		 System.out.println("default constructot");
		 
	 }
	 void studentinfo () {
		 System.out.println("the student name is " + name);
		 System.out.println("the student roll number is" + rollnumber);
	 }
	 School(String h, int r) {//parameterized constructor
		 name =h;
		 rollnumber = r;
		 
		 
		 
	 }
	 
	 
 }

public class constructors {
	public static void main ( String[]args) {
		
		School j1 = new School("jamua", 190);
		
		j1.studentinfo();
		

		
	}
	
	

}
