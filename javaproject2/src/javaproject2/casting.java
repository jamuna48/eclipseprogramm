package javaproject2;

public class casting {
	public static void main(String[]args) {
		short num1 = 3000; //implicit or  automatic or widenig type casting
		int num2 = num1;//short to int
	//	smaller to bigger
		System.out.println(num2);
		
	long b1 = 23;
	short s1= (short)b1;//narrow or expliciyt type casting
	System.out.println(s1);
	long l1 = 40000;
	short sj = (short)l1;//bigger to smaller
	System.out.println(sj);
	
	//converting string to integer
	String str = "234";
	int myint = Integer.parseInt(str);
	System.out.println(myint);
	
	
	
	
	}

}
