package oops;
import java.util.*;

import java.util.Scanner;


public class Exception5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("jamuna hi");
//int a = 90;
//int b = 0;
//try {
//int c = a/b;
//}
//catch(ArithmeticException ja) {
//	System.out.println("something wrong");}
		
//}
		
		Exception5 j = new Exception5();
		j.divition();
		
		
		
		
	}
		public void divition() {
		
		Scanner ja = new Scanner(System.in);
		System.out.println("enter a number ");
	try {
		int n1 = ja.nextInt();
		int n2 = ja.nextInt();
		//try {
		int answer = n1/n2;
		
		System.out.println(answer);}
		catch(ArithmeticException  k) {
			System.out.println("ok its wrong");
		}
	catch(InputMismatchException o) {
		
		
	System.out.println("please enter correct value");}
	catch(Exception l) {
		System.out.println("invalid reason");
	}
		
	finally {
		System.out.println("finally block ");
	}
		
		
		
		
	
	System.out.println("hii ");

}
}
