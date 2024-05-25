package classesjamuna;

import java.util.Scanner;

public class Breakdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 1;i<=90;i++) {
		 * 
		 * if(i%10==0) { System.out.println(i); break;
		 * 
		 * } }
		 */

		double n;
		double sum = 0.0;
		
		 Scanner ja = new Scanner(System.in);
		
		 System.out.println("enter a number");
		 
		//  int n = ja.nextInt();
		/*  while(true) {
		  
		  if (n%2==0) { System.out.println(n); break; } n--;*/
		  while (true) {
			   n = ja.nextDouble();
			   
			  if(n<0.0) {
				  break;

			  }
			  sum = sum+n;
		  
		  }
		  
		 System.out.println(sum);
	}

}
