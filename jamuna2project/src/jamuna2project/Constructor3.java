package jamuna2project;
//default constructor 
class exam{
	
	
	exam(int u){
		System.out.println("default constructor");
		System.out.println(u);
	}
	 public exam(){
		System.out.println("jamuna");
	}
	
}
public class Constructor3 {
	public static void main (String []args) {	
		exam candidate = new exam(7);//default constructor will be invisible
		exam jamuna = new exam ();

	

		
	
	}

}
