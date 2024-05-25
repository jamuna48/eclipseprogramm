package jamuna2project;
//inheritance inheritance is a mechanism in which one class inherits the properties from another class
//single inheritance

class Mahalakshmi{// base class ,superclass or  parent class
String relationship;
int age = 45;
String husbnad = "selvaraj";
long phno = 9585348656l;
Mahalakshmi (){
	System.out.println("mahlakshimi is mother of jamuna");
}

protected void  ac_no(){
	System.out.println("1234567899" );
	
}
protected void  aadhar() {
	System.out.println("9876--5432 -1234");
	
}
public void gender  () {
	System.out.println("female");
	
	
	
}


}
class Jamuna extends Mahalakshmi{
int age = 18;
String standard = "twelth";
long phno = 9094578695l;
Jamuna(){
	super();//super is used to invoking a conructor from parent class
	System.out.println("hi jamuna");
}
protected void schoolbonafied() {
	System.out.println("school bonafied is ready ");}
	protected void tcxerox() {
		System.out.println("tcxerox 2 copy");
	}	
	protected void aadhar() {
	
		//method overriding
		//calling parent clsss method
		super.aadhar();
		System.out.println("123456789");
		System.out.println(super.phno);//invoking a variable from parent class with using super keyword
		
		
	}
	
}

	
public class inheritance3 {
	public static void main(String []args) {
		
	Jamuna f1 = new Jamuna();
	f1.ac_no();
	f1.aadhar();
	f1.gender();
	f1.schoolbonafied();
	f1.tcxerox();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		



