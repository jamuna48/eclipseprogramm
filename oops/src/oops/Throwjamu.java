package oops;

public class Throwjamu {
	
	
	public void verifyAge(int a) {
		if(a<18) {
			System.out.println("eligible");
			try {
				throw new LicenseAgeException ();
				
			}
			catch(LicenseAgeException ll){
				System.out.println("please check your age");
				
			}
			
			
		}
		else {
			System.out.println("ok you are eligible ");
		}
	}

}
