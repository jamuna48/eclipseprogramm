package jamuna2project;
//inheritance
class Birds{
	String name;//fields
	public void wildbirds() {
		System.out.println("hii birds");
		
	}
}
class Parrot extends Birds{
	String name2 ;//fields
	public void peacock() {
	
		System.out.println("peacock is very beautifull");
		
	}
	
}
	



public class Inheritance {
	public static void main(String []args) {
		
	 Parrot dancing = new  Parrot();
		 dancing.wildbirds();
		dancing.peacock();
		
		
		
		
		
		
	}

}
