package oops;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Datetime22 {
	public static void main(String[]args) {
		LocalDateTime daytime = LocalDateTime.now ();
		System.out.println(daytime);
		DateTimeFormatter fday = DateTimeFormatter.ofPattern( "E, dd-MM-yyyy   HH :mm:ss ");
		
		
		String today = daytime.format(fday);
		System.out.println(today);
		
		
		
	}

}
