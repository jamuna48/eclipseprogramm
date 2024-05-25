import java.util.Scanner;
//scanner for scanning inputs from token
public class scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner j1= new Scanner(System.in);
		System.out.println("what is your name ?");
		String p =j1.next();
		System.out.println("my name is"+ p);
		int a = j1.nextInt();
		System.out.println("my age is now" + a);
		long aadhar = j1.nextLong();
		System.out.println("aadhar number is"+ aadhar);
	}

}
