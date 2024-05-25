package oops;//enum that represents group of constants
 enum Month{
	JANUARY ,FEBRUARY ,MARCH, APRIL, MAY ;
}
public class Enumdemo {
	
public static void main(String[]args) {
	Month exam = Month.JANUARY;
	System.out.println(exam);
	System.out.println(Month.MARCH);
	System.out.println(exam.ordinal());
}
}
