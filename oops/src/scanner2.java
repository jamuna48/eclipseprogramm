import java.util.Scanner;
public class scanner2 {
	public void mark() {
		Scanner jamuna =  new Scanner(System.in);
		System.out.println("enter your science mark");
		int j = jamuna.nextInt();
		System.out.println( "my science mark is"+j);
		System.out.println("enter your maths mark");
		int s = jamuna.nextInt();
		System.out.println("my maths mark is "+ s);
		
		
		if (j<s) {
			System.out.println("maths mark is greater than sceince mark");
		}
		
		else if (s<j) {
			System.out.println("science mark is good");
		}
		else {
			System.out.println("both are equal");
		}
	}
	public static void main(String[]args) {
		scanner2 rank = new scanner2();
	//	rank.mark();
		rank. scanning();

		
	}
	
	
	public void scanning() {
		Scanner jamuna =  new Scanner(System.in);
	/*	System.out.println("enter your byte number");
	byte no1 =	jamuna.nextByte();
	System.out.println("my byte number is "+no1);
	System.out.println("enter your short number ");	
	short no2 = jamuna.nextShort();
	System.out.println("my short number is "+ no2);
	System.out.println("enter your float number is ");	
	float no3 = jamuna.nextFloat();
	System.out.println("my float number is "+ no3);
	System.out.println("my boolean is ");
	boolean s = jamuna.nextBoolean();
	System.out.println("my boolean is "+ s);*/
System.out.println("where are you from");
	String k = jamuna.nextLine();//next()----> this for one words  
	System.out.println("i am from "+ k);//nexLine ()	----->this is for senctences and so on or morethan one word
}
}