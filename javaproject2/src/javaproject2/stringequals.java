package javaproject2;

public class stringequals {
	public static void main(String[]args) {
		String s1 = new String("jamuna");
		String s2 = "jamuna";
		if(s1==s2) {
		System.out.println("my name is jamuna");	}
		else {						
			System.out.println("false");
		}
		if(s1.equals(s2)) {
			System.out.println("jamuna");
		}
		else {
			System.out.println("wrong");
		}
	}

}
