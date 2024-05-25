package jamuna2project;
/* global variable and initialization 
 *integer data types default value 0
 *foating data type default value 0.0
 *string data type default value "null"
 *boolean default value "false"
 * */

public class stationary {
	String brandname ;
	int  amount ;
	int discount ;
	 void pen(){
		System.out.println("llll");
		S
	publicystem.out.println(brandname );
		System.out.println(amount );
		System.out.println(discount);
	} 
	stationary(String n1,int n2, int n3){
	brandname = n1;
		amount = n2;
	
		
		
		
		
		
		discount = n3;
		
		
		System.out.println(n1+ n2+ n3);
		
	}
	
	
	
	public static void main(String []args) {
		stationary brand1 = new  stationary("hero", 120, 40);
		stationary brand2 = new  stationary("cello ", 166,6);
		stationary brand3 = new  stationary("pilot" ,20 ,40);
		//brand1.brandname = "hero";
		
		//brand1.amount = 100;
		//brand1.discount = 20;
		brand1.pen();
		//brand2.brandname = "pilot";
		//brand2.amount = 90;
		//brand2.discount = 30;
		brand2.pen();
		//brand3.brandname = "cello";
		//brand3.amount = 120;
		//brand3.discount =10;
		brand3.pen();
	}

}
