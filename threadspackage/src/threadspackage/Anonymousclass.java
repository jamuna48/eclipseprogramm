package threadspackage;


class Election{
	public void verifyage() {
		System.out.println("minimum age of voter in india is 18years");
	}
}







public class Anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Election ee = new  Election () {


				public void verifyage() {
					
					System.out.println(" i am 18 years old ");
				}
		 
		 
		 };
		 ee.verifyage();
		 
		

	}

}
