package oops;
//runtime polymorphism or methodoverriding 

class Amma{
	public void work() {
		System.out.println("she is hardworking women");
	}
}
class Jamuna extends Amma {
	public void work()
	{
		System.out.println("she is studying now");
	}
}
public class Polymorphism {
	
	public static void main(String[]args) {
		Jamuna j1 = new Jamuna ();
		j1.work();
		
	}

}
