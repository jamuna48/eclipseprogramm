package oops;
class Mahalakshmi{
	public static void age() {
		System.out.println("mahalkshmi  age is ");
	}
	

}
class Jamuna extends Mahalakshmi{
	public static void age () {
		System.out.println("18");
	}
	
	
}
public class Staticdynamic {
	public static void main (String[]args) {
		Mahalakshmi j1 = new Jamuna ();
		
		j1.age(46);
		Jamuna j2 = new Jamuna();
		j2.age(18);
	}

}
