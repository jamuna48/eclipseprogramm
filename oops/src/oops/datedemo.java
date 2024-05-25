package oops;// current date
//import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datedemo {
	public static void main(String[]args) {
	/*	LocalDate today = LocalDate.now();
		System.out.println(today);*/
	/*	LocalTime today = LocalTime.now();
		System.out.println(today);*/
	LocalDateTime today = LocalDateTime.now();
		System.out.println(   " before formatting"+ " " + today);
		DateTimeFormatter formattime = DateTimeFormatter.ofPattern(" E ,dd-MMM-yyyy   HH :mm:ss"   );//MM --->numeric in months
		String day = today.format(formattime);
		System.out.println("after formatting" +  " "+ day);
	}

}