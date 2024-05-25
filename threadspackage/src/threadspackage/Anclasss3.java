package threadspackage;

interface Contract {
	public void agreement();
}



public class Anclasss3 {
	public static void main(String[]args) {
		
		 Contract cc = new  Contract () {
			 public void agreement() {
				 System.out.println(" agreement for two years ");
			 }
		 };
		cc.agreement(); 
		
	}

}
