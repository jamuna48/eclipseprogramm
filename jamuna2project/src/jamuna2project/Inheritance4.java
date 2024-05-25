package jamuna2project;
//multi level inheritance  must hava two sub class(parent and other one is grandchild
class grandparent{
	String grandmaa = "kamuthai";
	String grandpa = "kamatchi";
	
	protected void info1() {//grandparent
		System.out.println("gandmother is "+ " " +grandmaa);
		System.out.println("grandpaa name is "+" " + grandpa );
		System.out.println("5th");
	}
	
}
class parent extends grandparent  {
	String amma = "mahalakshmi";
	String appa = "selvaraj";
	String brother = "ananthakumar";
	protected void info2 () {
		System.out.println(amma + appa + brother);
		System.out.println("sslc");
		
	}
}
class brides extends parent{
	String bride = "jamuna";
	String village= "kattunayakaan pati theni";
	public void info3 () {
		
		System.out.println(bride +  village );
		System.out.println("hsc");
		}
	}
class invitation extends brides{
	 protected void totallinfo () {
		 System.out.println("invitation is ready ");
	 }
	}
public class Inheritance4 { 
	
	public static void main(String[]args) {
		invitation information = new invitation ();
		information.info1();
		information.info2();
		information.info3();
		information.totallinfo();
		
		
		
	}

}
