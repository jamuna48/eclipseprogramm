package oops;

public class throwvv {
public void jamuna() {
	
	int a = 10;
	int b= 100;
	int c = a+b;
	System.out.println("answer is "+ c);
	try {
		throw new NullPointerException ();
		
	}
	catch(NullPointerException np) {
		System.out.println("yes");
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
throwvv mm = new throwvv();
try {
	

mm.jamuna();
	}
catch(NullPointerException kk ) {
	System.out.println("jjjj");
}
}
}